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

public class HotelaAdaptar extends ArrayAdapter {
    List<Hotels> Q;

    public HotelaAdaptar(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        Q = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        Hotels currentHotel = Q.get(position);

        TextView HotelName = view.findViewById(R.id.Titel);
        TextView HotelTaqem = view.findViewById(R.id.Taqeem);
        ImageView HotelImage = view.findViewById(R.id.imageView20);

        HotelName.setText(currentHotel.getHotelName());
        HotelTaqem.setText(currentHotel.getHoteltqeem());
        HotelImage.setImageResource(currentHotel.getHotelimage());

        return view;



    }



    }


