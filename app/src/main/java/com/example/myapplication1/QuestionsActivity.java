package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("null");
    private TextView question, noIndicator;

    private LinearLayout optionsContainer;
    private Button shareBtn, nextBtn;
    private int count = 0;
    private List<QuestionModel> list;
    private int position = 0;
    private int score = 0;
    private String categort;
    private int setNo;
    private Dialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        question = findViewById(R.id.question);
        noIndicator = findViewById(R.id.no_indicator);
        optionsContainer = findViewById(R.id.options_container);
        shareBtn = findViewById(R.id.share_btn);
        nextBtn = findViewById(R.id.next_btn);

        categort = getIntent().getStringExtra("category");
        setNo = getIntent().getIntExtra("setNo", 1);

        loadingDialog = new Dialog(this);
        loadingDialog.setContentView(R.layout.loading);
        loadingDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.rounded_borders));
        loadingDialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT );
        loadingDialog.setCancelable(false);

        list = new ArrayList<>();
        loadingDialog.show();
        myRef.child("SETS").child(categort).child("questions").orderByChild("setNo").equalTo(setNo).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    QuestionModel questionModel = snapshot.getValue(QuestionModel.class);
                    list.add(questionModel);
                }

                if (list.size() > 0) {

                    for (int i = 0; i < 4; i++) {

                        optionsContainer.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                checkAnswer((Button) v);
                            }
                        });

                    }
                    playAnim(question, 0, list.get(position).getQuestion().toString());

                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            nextBtn.setEnabled(false);
                            nextBtn.setAlpha(0.7f);
                            position++;

                            if (position == list.size() ) {
//                              If all questions are answered, you can launch ScoreActivity here.
                                Intent scoreIntent = new Intent(QuestionsActivity.this, ScoreActivity.class);
                                scoreIntent.putExtra("score", score);
                                scoreIntent.putExtra("total", list.size());
                                startActivity(scoreIntent);
                                finish();
                                return;
                            }

                            count = 0;
                            resetOptions();
                             playAnim(question, 0, list.get(position).getQuestion().toString());
                        }

                        private void resetOptions() {
                            for (int i = 0; i < 4; i++) {
                                Button optionButton = (Button) optionsContainer.getChildAt(i);
                                optionButton.setEnabled(true);
                                optionButton.setBackgroundTintList(null);
                            }
                        }
                    });

                } else {
                    finish();
                    Toast.makeText(QuestionsActivity.this, "No questions", Toast.LENGTH_SHORT).show();
                }
                loadingDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(QuestionsActivity.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
                loadingDialog.dismiss();
                finish();
            }
        });


   }

        private  void playAnim(View view, int value,String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart( Animator animation) {
                        if (value == 0 && count < 4 ){
                            Object option = "";
                            if (count == 0){
                                option = list.get(position).getOptionA();
                            } else if (count ==1) {
                                option = list.get(position).getOptionB();
                            }else if (count ==2){
                                option = list.get(position).getOptionC();
                            }else if (count ==3){
                                option = list.get(position).getOptionD();
                            }
                            playAnim(optionsContainer.getChildAt(count), 0, (String) option);
                            count++;
                        }
                    }

                    @Override
                    public void onAnimationEnd( Animator animation) {
                        if (value == 0) {
                            try {
                                ((TextView) view).setText(data);
                            } catch (ClassCastException ex) {
                                ((Button) view).setText(data);
                            }
                            view.setTag(data);

                            playAnim(view, 1, data);
                        }
                    }


                    @Override
                    public void onAnimationCancel( Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat( Animator animation) {

                    }
                });

        }
        private  void checkAnswer(Button selectedOption) {
            enableOption(false);
            nextBtn.setEnabled(true);
            nextBtn.setAlpha(1);
            if (selectedOption.getText().toString().equals(list.get(position).getCorrectANS())) {
                score++;
                selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF44D53A")));
            } else {
                selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
                Button correctoption = (Button) optionsContainer.findViewWithTag(list.get(position).getCorrectANS());
                if (correctoption != null) {
                    correctoption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#848484")));
                }

            }
        }
        private void enableOption(boolean enable){
        for (int i = 0;i < 4; i++){
            optionsContainer.getChildAt(i).setEnabled(enable);

        }
        }
}
