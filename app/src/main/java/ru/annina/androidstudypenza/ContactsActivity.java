package ru.annina.androidstudypenza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ListView listView = findViewById(R.id.List);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Карашов Илья", "+79061234501", R.mipmap.ic_launcher));
        persons.add(new Person("Иванов Михаил", "+79061234502", R.mipmap.ic_launcher));
        persons.add(new Person("Жорова Ксения", "+79061234503", R.mipmap.ic_launcher));
        persons.add(new Person("Агапов Сергей", "+79061234504", R.mipmap.ic_launcher));
        persons.add(new Person("Агапов Илья", "+79061234505", R.mipmap.ic_launcher));
        persons.add(new Person("Маржина Оксана", "+79061234506", R.mipmap.ic_launcher));
        persons.add(new Person("Катышкина Юлия", "+79061234507", R.mipmap.ic_launcher));
        persons.add(new Person("Жданов Андрей", "+79061234508", R.mipmap.ic_launcher));
        persons.add(new Person("Простова Марина", "+79061234509", R.mipmap.ic_launcher));
        persons.add(new Person("Лордина Зоя", "+79061234510", R.mipmap.ic_launcher));
        persons.add(new Person("Татарин Ярд", "+79061234511", R.mipmap.ic_launcher));
        persons.add(new Person("Коршун Петр", "+79061234512", R.mipmap.ic_launcher));
        persons.add(new Person("Горб Марина", "+79061234513", R.mipmap.ic_launcher));
        persons.add(new Person("Уварова Дарья", "+79061234514", R.mipmap.ic_launcher));
        persons.add(new Person("Пирожков Артур", "+79061234515", R.mipmap.ic_launcher));
        persons.add(new Person("Нарядный Василий", "+79061234516", R.mipmap.ic_launcher));
        persons.add(new Person("Кузнецов Артем", "+79061234517", R.mipmap.ic_launcher));
        persons.add(new Person("Жалова Ольга", "+79061234518", R.mipmap.ic_launcher));
        persons.add(new Person("Дуров Павел", "+79061234519", R.mipmap.ic_launcher));
        persons.add(new Person("Кузнецова Илона", "+79061234520", R.mipmap.ic_launcher));

        PersonAdapter adapter = new PersonAdapter(this, persons);
        listView.setAdapter(adapter);
    }
}
