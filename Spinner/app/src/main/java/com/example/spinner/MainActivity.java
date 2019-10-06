package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
        spinner1 = (Spinner)findViewById(R.id.spinner);

        String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_joel, opciones);
        spinner1.setAdapter(adapter);
    }


    //Método del botón
    public void calcular(View view)
    {
        int val1 = Integer.parseInt( et1.getText().toString() );
        int val2 = Integer.parseInt( et2.getText().toString() );

        String seleccion = spinner1.getSelectedItem().toString();
        String resultado = "";

        if(seleccion.equals("Sumar"))
        {
            resultado = String.valueOf( val1 + val2 );
        }
        else if(seleccion.equals("Restar"))
        {
            resultado = String.valueOf( val1 - val2 );
        }
        else if(seleccion.equals("Multiplicar"))
        {
            resultado = String.valueOf( val1 * val2 );
        }
        else if(seleccion.equals("Dividir"))
        {
            if(val2 == 0)
            {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG ).show();
            }
            else
            {
                resultado = String.valueOf( val1 / val2 );
            }
        }

        tv1.setText("Resultado " + resultado);
    }

}
