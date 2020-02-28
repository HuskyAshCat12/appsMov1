package com.example.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class miClicListener implements View.OnClickListener {
    Context context;
    public miClicListener (Context context){
        this.context = context;
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(context, "EVENTO CLASE INDEPENDIENTE", Toast.LENGTH_SHORT).show();
    }
}
