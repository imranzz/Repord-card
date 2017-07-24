package com.example.andriod.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String MATH_GRADE, ENGLISH_GRADE, HISTORY_GRADE ,ART_GRADE ,PHYSICS_GRADE,BIOLOGY_GRADE,Your_Name;
    public static int MATH_SCORE, ENGLISH_SCORE, HISTORY_SCORE ,ART_SCORE ,PHYSICS_SCORE,BIOLOGY_SCORE;
    public static String USER_DETAILS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.SubmitButton);
        final EditText editName = (EditText) findViewById(R.id.your_name);
        final EditText editMaths = (EditText) findViewById(R.id.getMaths);
        final EditText editEnglish = (EditText) findViewById(R.id.getEnglish);
        final EditText editHistory = (EditText) findViewById(R.id.getHistory);
        final EditText editArt = (EditText) findViewById(R.id.getArt);
        final EditText editPhysics = (EditText) findViewById(R.id.getPhysics);
        final EditText editBiology = (EditText) findViewById(R.id.getBiology);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Your_Name=editName.getText().toString();
                MATH_SCORE = Integer.parseInt(editMaths.getText().toString());
                ENGLISH_SCORE = Integer.parseInt(editEnglish.getText().toString());
                HISTORY_SCORE = Integer.parseInt(editHistory.getText().toString());
                ART_SCORE = Integer.parseInt(editArt.getText().toString());
                PHYSICS_SCORE = Integer.parseInt(editPhysics.getText().toString());
                BIOLOGY_SCORE = Integer.parseInt(editBiology.getText().toString());

                TextView textView = (TextView) findViewById(R.id.results);
                textView.setText(ReportCard());

            }
        });

    }
    private  String ReportCard(){
        setMathGrade();
        setEnglishGrade();
        setArtGrade();
        setHistoryGrade();
        setBiologyGrade();
        setPhysicsGrade();

        String maths = "Math grade is" + getMathGrade();
        String english = "English grade is" + getEngishGrade();
        String history = "History grade is" + getHistoryGrade();
        String art = "Art grade is" + getArtGrade();
        String physics = "Physics grade is" + getPhysicsGrade();
        String biology = "Biology grade is" + getBiologyGrade();

        USER_DETAILS = "Name: "+ Your_Name + "\n" + maths + "\n"
                + english +"\n"+ history +"\n"+ art+"\n" + physics+"\n" + biology+"\n";

        return USER_DETAILS;
    }
    // String to display score and grade
    public String getMathGrade(){
        return "Grade - " + MATH_SCORE +" - " + MATH_GRADE;
    }
    public String getEngishGrade(){
        return "Grade - " + ENGLISH_SCORE +" - " + ENGLISH_GRADE;
    }
    public String getHistoryGrade(){
        return "Grade - " + HISTORY_SCORE +" - " + HISTORY_GRADE;
    }
    public String getArtGrade(){
        return "Grade - " + ART_SCORE +" - " + ART_GRADE;
    }
    public String getPhysicsGrade(){
        return "Grade - " + PHYSICS_SCORE +" - " + PHYSICS_GRADE;
    }
    public String getBiologyGrade(){
        return "Grade - " + BIOLOGY_SCORE +" - " + BIOLOGY_GRADE;
    }
    public  String setMathGrade(){

        if (MATH_SCORE <40){
            MATH_GRADE ="F";
        } else if (MATH_SCORE >40 && MATH_SCORE <50) {
            MATH_GRADE = "D";
        }else if (MATH_SCORE >50 && MATH_SCORE <60) {
            MATH_GRADE = "C";
        }else if (MATH_SCORE >60 && MATH_SCORE <70) {
            MATH_GRADE = "B";
        } else if (MATH_SCORE >70 && MATH_SCORE <80) {
            MATH_GRADE = "B+";
        }else if (MATH_SCORE >80 && MATH_SCORE <90) {
            MATH_GRADE = "A";
        }else   {
            MATH_GRADE = "A+";
        }
        return MATH_GRADE;
    }
    public  String setEnglishGrade(){

        if (ENGLISH_SCORE <40){
            ENGLISH_GRADE ="F";
        } else if (ENGLISH_SCORE >40 && ENGLISH_SCORE <50) {
            ENGLISH_GRADE = "D";
        }else if (ENGLISH_SCORE >50 && ENGLISH_SCORE <60) {
            ENGLISH_GRADE = "C";
        }else if (ENGLISH_SCORE >60 && ENGLISH_SCORE <70) {
            ENGLISH_GRADE = "B";
        } else if (ENGLISH_SCORE >70 && ENGLISH_SCORE <80) {
            ENGLISH_GRADE = "B+";
        }else if (ENGLISH_SCORE >80 && ENGLISH_SCORE <90) {
            ENGLISH_GRADE = "A";
        }else   {
            ENGLISH_GRADE = "A+";
        }
        return ENGLISH_GRADE;
    }
    public  String setHistoryGrade(){

        if (HISTORY_SCORE <40){
            HISTORY_GRADE ="F";
        } else if (HISTORY_SCORE >40 && HISTORY_SCORE <50) {
            HISTORY_GRADE = "D";
        }else if (HISTORY_SCORE >50 && HISTORY_SCORE <60) {
            HISTORY_GRADE = "C";
        }else if (HISTORY_SCORE >60 && HISTORY_SCORE <70) {
            HISTORY_GRADE = "B";
        }
        else if (HISTORY_SCORE >70 && HISTORY_SCORE <80) {
            HISTORY_GRADE = "B+";
        }else if (HISTORY_SCORE >80 && HISTORY_SCORE <90) {
            HISTORY_GRADE = "A";
        }else   {
            HISTORY_GRADE = "A+";
        }
        return HISTORY_GRADE;
    }
    public  String setArtGrade(){

        if (ART_SCORE <40){
            ART_GRADE ="F";
        } else if (ART_SCORE >40 && ART_SCORE <50) {
            ART_GRADE = "D";
        }else if (ART_SCORE >50 && ART_SCORE <60) {
            ART_GRADE = "C";
        }else if (ART_SCORE >60 && ART_SCORE <70) {
            ART_GRADE = "B";
        } else if (ART_SCORE >70 && ART_SCORE <80) {
            ART_GRADE = "B+";
        }else if (ART_SCORE >80 && ART_SCORE <90) {
            ART_GRADE = "A";
        }else   {
            ART_GRADE = "A+";
        }
        return ART_GRADE;
    }
    public  String setPhysicsGrade(){

        if (PHYSICS_SCORE <40){
            PHYSICS_GRADE ="F";
        } else if (PHYSICS_SCORE >40 && PHYSICS_SCORE <50) {
            PHYSICS_GRADE = "D";
        }else if (PHYSICS_SCORE >50 && PHYSICS_SCORE <60) {
            PHYSICS_GRADE = "C";
        }else if (PHYSICS_SCORE >60 && PHYSICS_SCORE <70) {
            PHYSICS_GRADE = "B";
        }else if (PHYSICS_SCORE >70 && PHYSICS_SCORE <80) {
            PHYSICS_GRADE = "B+";
        }else if (PHYSICS_SCORE >80 && PHYSICS_SCORE <90) {
            PHYSICS_GRADE = "A";
        }else   {
            PHYSICS_GRADE = "A+";
        }
        return PHYSICS_GRADE;
    }
    public  String setBiologyGrade(){

        if (BIOLOGY_SCORE <40){
            BIOLOGY_GRADE ="F";
        } else if (BIOLOGY_SCORE >40 && BIOLOGY_SCORE <50) {
            BIOLOGY_GRADE = "D";
        }else if (BIOLOGY_SCORE >50 && BIOLOGY_SCORE <60) {
            BIOLOGY_GRADE = "C";
        }else if (BIOLOGY_SCORE >60 && BIOLOGY_SCORE <70) {
            BIOLOGY_GRADE = "B";
        }
        else if (BIOLOGY_SCORE >70 && BIOLOGY_SCORE <80) {
            BIOLOGY_GRADE = "B+";
        }
        else if (BIOLOGY_SCORE >80 && BIOLOGY_SCORE <90) {
            BIOLOGY_GRADE = "A";
        }
        else   {
            BIOLOGY_GRADE = "A+";
        }
        return BIOLOGY_GRADE;
    }

}
