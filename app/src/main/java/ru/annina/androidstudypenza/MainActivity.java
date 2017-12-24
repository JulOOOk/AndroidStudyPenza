package ru.annina.androidstudypenza;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton google = findViewById(R.id.ButtonGoogle);
        ImageButton vk = findViewById(R.id.ButtonVk);
        ImageButton facebook = findViewById(R.id.ButtonFacebook);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com"));
                startActivity(intent);
                Log.d("Экран Авторизации", "Нажатие на кнопку google");
            }
        });

        vk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com"));
                startActivity(intent);
                Log.d("Экран Авторизации", "Нажатие на кнопку vk");
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"));
                startActivity(intent);
                Log.d("Экран Авторизации", "Нажатие на кнопку facebook");
            }
        });

        Button next = findViewById(R.id.ButtonNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),SMSActivity.class);
                startActivity(intent);
                Log.d("Экран Подтверждения", "Нажатие на кнопку Продолжить");
            }
        });

        Lada myLada = new Lada();
        Kalina myKalina = new Kalina();

        System.out.println (myLada.getBrand());
        System.out.println(myKalina.getModel());
    }
}
