package com.example.myapplication1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelVH> {

    List<Model> modelList;

    public ModelAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ModelAdapter.ModelVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw,parent,false);
        return new ModelVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAdapter.ModelVH holder, int position) {

        Model model = modelList.get(position);
        holder.codeNameTxt.setText(model.getCodeName());
        holder.descriptionTxt.setText(model.getDescription());

        boolean isExpandable = modelList.get(position).isExpandable();
        holder.expandable.setVisibility(isExpandable ? View.VISIBLE : View.GONE);


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ModelVH extends RecyclerView.ViewHolder{
        TextView codeNameTxt,descriptionTxt;

        LinearLayout linearLayout;
        RelativeLayout expandable;

        public ModelVH(@NonNull View itemView) {
            super(itemView);

            codeNameTxt = itemView.findViewById(R.id.code_name);
            descriptionTxt = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linearLayout);
            expandable = itemView.findViewById(R.id.expandable);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Model model = modelList.get(getAdapterPosition());
                    model.setExpandable(!model.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
