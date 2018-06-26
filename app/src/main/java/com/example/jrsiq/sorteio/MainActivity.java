package com.example.jrsiq.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        int x = new Random().nextInt(11);

        TextView numeroSorteado = findViewById(R.id.numeroResultado);

        numeroSorteado.setText("O número selecionado é: " + x);
    }
}
