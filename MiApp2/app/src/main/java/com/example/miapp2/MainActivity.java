package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText et1, et2, et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_matematicas);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.txt_quimica);
        tv1 = (TextView)findViewById(R.id.tv_status);
    }


    public void status (View view)
    {
        int val_matematicas = Integer.parseInt(et1.getText().toString());
        int val_fisica = Integer.parseInt(et2.getText().toString());
        int val_quimica = Integer.parseInt(et3.getText().toString());

        float promedio = (val_matematicas + val_fisica + val_quimica)/3f;

        if (promedio>10.5)
        {
            tv1.setText("Alumno aprobado con: " + promedio);
        }
        else
        {
            tv1.setText("Alumno desaprobado con: " + promedio);
        }
    }
}
