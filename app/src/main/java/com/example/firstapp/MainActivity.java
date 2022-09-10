package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtName;
    Button btnSayHello;

    protected void onCreate(Bundle savedInstanceState) {
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = (EditText) findViewById(R.id.edtName);
        btnSayHello = (Button) findViewById(R.id.btnHello);
        btnSayHello.setOnClickListener(this);
    }

    public void OnClick(view v){
        if (v.getId()== btnSayHello.getId()){
            String name =String.valueOf(edtName.getText());
            Toast.makeText(getApplicationContext(), text: "Hello"+name, Toast.LENGTH_LONG).show();
        }
    }
}