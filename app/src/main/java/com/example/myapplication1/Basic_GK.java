package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Basic_GK extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_gk);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Basic GK");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.recyclerView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        ModelAdapter modelAdapter = new ModelAdapter(modelList);
        recyclerView.setAdapter(modelAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        modelList = new ArrayList<>();
        modelList.add(new Model("Question 1", "Grand Central Terminal, Park Avenue, New York is the world's\n1) largest railway station\n2) highest railway station\n3) longest railway station\n4) None of the above\nAnswer: 1) "));
        modelList.add(new Model("Question 2", "Entomology is the science that studies\n1) Behavior of human beings\n2) Insects\n3)The formation of rocks\n4) None of the above\nAnswer: 2)\n Explanation: Entomology: The branch of zoology concerned with the study of insects."));
        modelList.add(new Model("Question 3", "Eritrea, which became the 182nd member of the UN in 1993, is in the continent of\n" + "Asia\n" + "Africa\n" + "Europe\n" + "Australia\nAnswer: 2)"));
        modelList.add(new Model("Question 4", "Garampani sanctuary is located at\n" + "Junagarh, Gujarat\n" + "Diphu, Assam\n" + "Kohima, Nagaland\n" + "Gangtok, Sikkim\nAnswer: 2)"));
        modelList.add(new Model("Question 5", "For which of the following disciplines is Nobel Prize awarded?\n" + "Physics and Chemistry\n" + "Physiology or Medicine\n" + "Literature, Peace and Economics\n" + "All of the above\nAnswer: 4)"));
        modelList.add(new Model("Question 6", "In which decade was the American Institute of Electrical Engineers (AIEE) founded?\n" + "1850s\n" + "1880s\n" + "1930s\n" + "1950s\nAnswer: 2)\nExplanation:\n" + "The IEEE (Institute of Electrical and Electronics Engineers) was formed in 1963 by the merger of the Institute of Radio Engineers (IRE, founded 1912) and the American Institute of Electrical Engineers (AIEE, founded 1884)."));
        modelList.add(new Model("Question 7", "What is part of a database that holds only one type of information?\n" + "Report\n" + "Field\n" + "Record\n" + "File\nAnswer: 2)"));
        modelList.add(new Model("Question 8", "'OS' computer abbreviation usually means ?\n" + "Order of Significance\n" + "Open Software\n" + "Operating System\n" + "Optical Sensor\nAnswer: 3)"));
        modelList.add(new Model("Question 9", "In which decade with the first transatlantic radio broadcast occur?\n" + "1850s\n" + "1860s\n" + "1870s\n" + "1900sAnswer: 4)\nExplanation:\n" + "On December 12, 1901, a radio transmission received by Guglielmo Marconi resulted in the first transmission of a transatlantic wireless signal (Morse Code) from Poldhu, Cornwall, to St. John's, Newfoundland"));
        modelList.add(new Model("Question 10", "'.MOV' extension refers usually to what kind of file?\n" + "Image file\n" + "Animation/movie file\n" + "Audio file\n" + "MS Office document\nAnswer: 2)"));
        modelList.add(new Model("Question 11", "Most modern TV's draw power even if turned off. The circuit the power is used in does what function?\n" + "Sound\n" + "Remote control\n" + "Color balance\n" + "High voltage\nAnswer: 2)\nExplanation:\n" + "Some authorities are recommending TV's, VCR's and Stereo's be connected to power strips with switches and turned off when not in use to save energy. Your remote will not work until power is switched back on."));
        modelList.add(new Model("Question 12", "Which is a type of Electrically-Erasable Programmable Read-Only Memory?\n" + "Flash\n" + "Flange\n" + "Fury\n" + "FRAM\nAnswer: 1)\nExplanation:\n" + "It's commonly used for MP3 players, computer BIOS code and \"thumb\" drives. Originally developed in Japan by Toshiba, it has become quite popular for products requiring non-volatile erasable memory. Flash devices have a limited number of erase cycles (typically 10,000 to 1,000,000 cycles) so they're not as good a choice for applications in which the data changes constantly. However, since it has no moving parts (unlike a hard disk) it is an excellent choice for storing the operating code for small personal electronics like PDAs, cell phones, digital cameras, and the data in items like MP3 players."));
        modelList.add(new Model("Question 13", "The purpose of choke in tube light is ?\n" + "To decrease the current\n" + "To increase the current\n" + "To decrease the voltage momentarily\n" + "To increase the voltage momentarily\nAnswer: 4)"));
        modelList.add(new Model("Question 14", "'.MPG' extension refers usually to what kind of file?\n" + "WordPerfect Document file\n" + "MS Office document\n" + "Animation/movie file\n" + "Image file\nAnswer: 3)"));
        modelList.add(new Model("Question 15", "Who developed Yahoo?\n" + "Dennis Ritchie & Ken Thompson\n" + "David Filo & Jerry Yang\n" + "Vint Cerf & Robert Kahn\n" + "Steve Case & Jeff Bezos\nAnswer: 2)"));
        modelList.add(new Model("Question 16", "Made from a variety of materials, such as carbon, which inhibits the flow of current...?\n" + "Choke\n" + "Inductor\n" + "Resistor\n" + "Capacitor\nAnswer: 3)\nExplanation:\n" + "So named because it resists (or inhibits) the flow of current."));
        modelList.add(new Model("Question 17","The most common format for a home video recorder is VHS. VHS stands for...?\n" + "Video Home System\n" + "Very high speed\n" + "Video horizontal standard\n" + "Voltage house standard\nAnswer: 1)\nExplanation:\n" + "JVC (Japan Victor Corporation) and Matsushita (Panasonic) developed the VHS format to compete with Sony which developed the Beta format as the first home video cassette recorder. VHS originally stood for Vertical Helical Scan, but now means Video Home System."));
        modelList.add(new Model("Question 18", "What does VVVF stand for?\n" + "Variant Voltage Vile Frequency\n" + "Variable Velocity Variable Fun\n" + "Very Very Vicious Frequency\n" + "Variable Voltage Variable Frequency\nAnswer: 4)\nExplanation:\n" + "It is a method of controlling the speed of an AC induction motor, whereby speed, current and torque can all be accurately controlled."));
        modelList.add(new Model("Question 19", "What frequency range is the High Frequency band?\n" + "100 kHz\n" + "1 GHz\n" + "30 to 300 MHz\n" + "3 to 30 MHz\nAnswer: 4)\nExplanation:\n" + "The HF band is based on frequencies 3 to 30 Mhz. AM radio stations are in the HF band but normally are stated in kilohertz."));
        modelList.add(new Model("Question 20", "The first step to getting output from a laser is to excite an active medium. What is this process called?\n" + "Pumping\n" + "Exciting\n" + "Priming\n" + "Raising\nAnswer: 1)\nExplanation:\n" + "A collection of atoms or molecules that can be excited to a higher energy state is called an active medium. Before lasing can occur, the active media is \"pumped\". The process of raising the atoms in the active media from a lower energy state to a higher state is like pumping water up from a well."));
        modelList.add(new Model("Question 21", "What is the relationship between resistivity r and conductivity s?\n" + "R = s2\n" + "R = s\n" + "R > s\n" + "R = 1/s\nAnswer: 4)"));
        modelList.add(new Model("Question 22", "Which motor is NOT suitable for use as a DC machine?\n" + "Permanent magnet motor\n" + "Series motor\n" + "Squirrel cage motor\n" + "Synchronous motor\nAnswer: 3)\nExplanation:\n" + "The squirrel cage motor is the only one without any connection to the armature."));
        modelList.add(new Model("Question 23", "A given signal's second harmonic is twice the given signal's __________ frequency...?\n" + "Fourier\n" + "Foundation\n" + "Fundamental\n" + "Field\nAnswer: 3)\nExplanation:\n" + "A given signal's second harmonic is twice the given signal's fundamental frequency. Harmonics are generated when there are non-linearities in an amplifier (there are always non-linearities). The worse the non-linearities, the more harmonics. A signal at 27.5 MHz (approximate frequency for US citizen's band) would have a second harmonic at 55.0 MHz (on US channel 2!). Can you see why there might be problems? A CB operator might do well to place a low-pass filter on his radio.\n"));
        modelList.add(new Model("Question 24", "What does the term PLC stand for?\n" + "Programmable Lift Computer\n" + "Program List Control\n" + "Programmable Logic Controller\n" + "Piezo Lamp Connector\nAnswer: 3)\nExplanation:\n" + "Used in manufacturing, engineering, and process operations."));
        modelList.add(new Model("Question 25", "DB' computer abbreviation usually means ?\n" + "Database\n" + "Double Byte\n" + "Data Block\n" + "Driver Boot\nAnswer: 1)"));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}