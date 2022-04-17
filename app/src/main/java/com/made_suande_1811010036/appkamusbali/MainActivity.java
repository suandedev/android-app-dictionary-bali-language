package com.made_suande_1811010036.appkamusbali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public String TAG ="mydata";
    Button btn_search;
    TextView txt_result;
    EditText input_word;

    Map<String , String > bali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_search = findViewById(R.id.btn_search);
        txt_result = findViewById(R.id.txt_result);
        input_word = findViewById(R.id.input_word);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();
            }
        });
    }

    private void search() {
        bali = new HashMap<>();

        bali.put("kamu", "cai");
        bali.put("saya", "cang");

//        Log.d(TAG, "onCreate: " + bali.get("kamu"));
        if (input_word.getText().toString().equals("")) {
            Toast.makeText(this, "input not null", Toast.LENGTH_SHORT).show();
        } else {
            if (bali.get(input_word.getText().toString()) == null) {
                Toast.makeText(this, "word not found", Toast.LENGTH_SHORT).show();
                txt_result.setText("result : null");
            } else {
                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
                txt_result.setText(input_word.getText().toString()+ " : " +bali.get(input_word.getText().toString()));
            }
        }
    }
}