package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter <Weather>{
    Weather[] objects;
    Context context;
    int resource;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView == null){ //Sólo se ejecuta la primera vez, hay que crear el layout
                convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent,false);
            }
            //Hay que recuperar los componentes

            ImageView iVW;
            TextView tVC, tVT, tVD;
            iVW = convertView.findViewById(R.id.iVC);
            tVC = convertView.findViewById(R.id.tV1);
            tVT = convertView.findViewById(R.id.tV2);
            tVD = convertView.findViewById(R.id.tV3);

            iVW.setImageResource(objects[position].getImage());
            tVC.setText(objects[position].getCity());
            tVT.setText("" + objects[position].getTemp());
            tVD.setText(objects[position].getClimate());

        return convertView;
    }

    }
