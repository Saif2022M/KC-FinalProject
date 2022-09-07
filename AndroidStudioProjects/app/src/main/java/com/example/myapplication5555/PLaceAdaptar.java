package com.example.myapplication5555;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PLaceAdaptar extends ArrayAdapter {
    List<Plase>F;


    public PLaceAdaptar(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        F = objects;
    }

    @NonNull
    @Override
    public View getView(int position3, @Nullable View convertView, @NonNull ViewGroup parent2) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item2, parent2, false);
        Plase currentplase = F.get(position3);


        ImageView RestrantImage = view.findViewById(R.id.CORA);
        TextView REstramtNAme = view.findViewById(R.id.TOTAAAL);


        RestrantImage.setImageResource(currentplase.getPlaceImage());
        REstramtNAme.setText(currentplase.getPlaseName());

        return view ;
    }

}
