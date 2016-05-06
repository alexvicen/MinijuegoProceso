package com.example.sala5.minijuegoproceso;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProcesarMateriales extends AppCompatActivity {

    private AnimationDrawable animacion1 = new AnimationDrawable();
    private int movimiento1;
    private LinearLayout iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.procesar_materiales);
        iv1 = (LinearLayout) findViewById(R.id.iv1);
        movimiento1 = R.drawable.cinta;
        iv1.setBackgroundResource(movimiento1);
        animacion1 = (AnimationDrawable) iv1.getBackground();
        animacion1.start();
    }
}
