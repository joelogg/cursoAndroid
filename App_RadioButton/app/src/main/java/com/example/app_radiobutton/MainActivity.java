package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valo1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);
    }

    //Metodo para calcular
    public void calcular (View view)
    {
        int val1 = Integer.parseInt( et1.getText().toString() );
        int val2 = Integer.parseInt( et2.getText().toString() );

        String resultado = "";
        if(rb1.isChecked())
        {
            resultado = String.valueOf(val1 + val2);
        }
        else if(rb2.isChecked())
        {
            resultado = String.valueOf(val1 - val2);
        }
        else if(rb3.isChecked())
        {
            resultado = String.valueOf(val1 * val2);
        }
        else if(rb4.isChecked())
        {
            if (val2 == 0)
            {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            }
            else
            {
                resultado = String.valueOf(val1 / val2);
            }
        }

        tv1.setText("Resultado " + resultado);
    }
}
