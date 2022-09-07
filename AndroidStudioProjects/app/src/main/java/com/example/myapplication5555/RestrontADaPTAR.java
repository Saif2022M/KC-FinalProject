package com.example.myapplication5555;

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

public class RestrontADaPTAR extends ArrayAdapter {
    List<Restrounts> J;

    public RestrontADaPTAR(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        J = objects;


    }

    @NonNull
    @Override
    public View getView(int position1, @Nullable View convertView, @NonNull ViewGroup parent1) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item2, parent1, false);
        Restrounts currentRestrant = J.get(position1);

        ImageView RestrantImage = view.findViewById(R.id.CORA);
        TextView REstramtNAme = view.findViewById(R.id.TOTAAAL);


        RestrantImage.setImageResource(currentRestrant.getRestrantImage());
        REstramtNAme.setText(currentRestrant.getRestrontName());


    return view ;
    }

}
