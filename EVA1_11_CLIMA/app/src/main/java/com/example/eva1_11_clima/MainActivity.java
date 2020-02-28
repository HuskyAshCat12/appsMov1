package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lstVwClima;
    Weather[] cities = {
            new Weather("Chihuahua", 654, "Nublado",R.drawable.cloudy),
            new Weather("Juárez", 23, "Nevando",R.drawable.snow),
            new Weather("Casas Chicas", 65, "Granizo",R.drawable.tornado),
            new Weather("Villa Juárez", 666, "Pepinillo",R.drawable.cloudy),
            new Weather("Matachí", 420, "Soleado",R.drawable.sunny),
            new Weather("Guadalupe y Calvo", 69, "Nevando",R.drawable.snow),
            new Weather("Parral", 30, "Medio soleado",R.drawable.atmospher),
            new Weather("Aldama", 67, "Nublado",R.drawable.cloudy),
            new Weather("Villa Ahumada", 12, "Lluvioso",R.drawable.rainy),
            new Weather("Fondo de Bikini", 25, "Lluvioso",R.drawable.light_rain)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout, cities));
    }
}
