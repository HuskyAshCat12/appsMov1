package com.example.eva1_6_idioma;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView tV, tV2, tV3, tV4;
    EditText eT, eT2, eT3;
    RadioButton x;
    RadioGroup rG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rG = findViewById(R.id.rG);
        rG.setOnCheckedChangeListener(this);

        tV = findViewById(R.id.tV);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);

        eT = findViewById(R.id.eT);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        x = findViewById(checkedId);
        if(x.getText().equals("Español")){
            tV.setText(R.string.idioma_es);
            tV2.setText(R.string.tVNom_es);
            eT.setHint(R.string.eTNom_es);
            tV3.setText(R.string.tVAp_es);
            eT2.setHint(R.string.eTAP_es);
            tV4.setText(R.string.tVE_es);
            eT3.setHint(R.string.eTE_es);
        }
        else{
            tV.setText(R.string.idioma_en);
            tV2.setText(R.string.tVNom_en);
            eT.setHint(R.string.eTNom_en);
            tV3.setText(R.string.tVAp_en);
            eT2.setHint(R.string.eTAP_en);
            tV4.setText(R.string.tVE_en);
            eT3.setHint(R.string.eTE_en);
        }
    }
}
