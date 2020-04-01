package com.example.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    public AnimalAdapter(@NonNull Context context, @NonNull List<Animal> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animals = getItem(position);

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.layout_name_image_animals,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imagView);
        TextView textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(animals.getId());
        textView.setText(animals.getName());

        return convertView;
    }
}
