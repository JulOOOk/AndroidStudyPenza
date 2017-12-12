package ru.annina.androidstudypenza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lada myLada = new Lada();
        Kalina myKalina = new Kalina();

        System.out.println (myLada.getBrand());
        System.out.println(myKalina.getModel());
    }
}
