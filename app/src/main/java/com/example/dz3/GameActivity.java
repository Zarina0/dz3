package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {


    TextView tvWhoIsWho;
    ImageView imStudent;
    Button btnStudent1, btnStudent2, btnStudent3;
    Button btnAsem, btnAdi,btnAmir;
    boolean amir,asem,adi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initView();
        listener();

    }

    private void initView(){
        tvWhoIsWho=findViewById(R.id.tv_who_is_who);
        imStudent=findViewById(R.id.im_student);
        btnStudent1=findViewById(R.id.btn_student1);
        btnStudent2=findViewById(R.id.btn_student2);
        btnStudent3=findViewById(R.id.btn_student3);
        btnAsem=findViewById(R.id.btn_asem);
        btnAdi=findViewById(R.id.btn_adi);
        btnAmir=findViewById(R.id.btn_amir);
    }

    public void changeImage(View view){
        switch (view.getId()){
            case R.id.btn_student1:
                imStudent.setImageResource(R.drawable.amir);
                amir=true;
                asem=false;
                adi=false;
                break;
            case R.id.btn_student2:
                imStudent.setImageResource(R.drawable.asem);
                amir=false;
                asem=true;
                adi=false;
                break;
            case R.id.btn_student3:
                imStudent.setImageResource(R.drawable.adi);
                amir=false;
                asem=false;
                adi=true;
                break;

        }
    }



    private void listener(){
        btnAmir.setOnClickListener(view -> {
            if (amir){
                Toast.makeText(GameActivity.this,"Well done",Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(GameActivity.this,"Don't give up",Toast.LENGTH_SHORT).show();
            }
        });
        btnAsem.setOnClickListener(view -> {
            if (asem){
                Toast.makeText(GameActivity.this,"Well done",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(GameActivity.this,"Don't give up",Toast.LENGTH_SHORT).show();
            }
        });

        btnAdi.setOnClickListener(view -> {
            if (adi){
                Toast.makeText(GameActivity.this,"Well done",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(GameActivity.this,"Don't give up",Toast.LENGTH_SHORT).show();
            }
        });


    }


}