package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }package com.example.ardi.pantheon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
    public class MainActivity extends AppCompatActivity {

        ImageView imgView;
        TextView txtView;
        int linkGambar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            Intent intent = getIntent();
            String Tit = intent.getStringExtra("Tit");

            setTitle(Tit);
            linkGambar = intent.getIntExtra("gambar", linkGambar);
            imgView.setImageResource(linkGambar);
            txtView.setText(intent.getStringExtra("text"));


        }
    }


}

