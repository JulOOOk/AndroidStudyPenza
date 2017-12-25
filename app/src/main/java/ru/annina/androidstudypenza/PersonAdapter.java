package ru.annina.androidstudypenza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Yulia on 25.12.2017.
 */

public class PersonAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Person> objects;

    PersonAdapter(Context context, ArrayList<Person> person) {
        ctx = context;
        objects = person;
        lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.item_person, viewGroup, false);
        }

        Person person = objects.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textName);
        TextView textViewPhone = view.findViewById(R.id.textPhone);

        textViewName.setText(person.name);
        textViewPhone.setText(person.phone);
        imageView.setImageResource(person.icon);

        return view;
    }
}
