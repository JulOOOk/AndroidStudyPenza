package ru.annina.androidstudypenza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SMSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Button singIn = findViewById(R.id.ButtonSignIn);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ContactsActivity.class);
                startActivity(intent);
                Log.d("Экран Код", "Нажатие на кнопку Войти");
            }
        });
    }
}
