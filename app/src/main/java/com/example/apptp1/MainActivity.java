package com.example.apptp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CAT = "PMR";
    private EditText edtPseudo;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT, "onCreate");
        edtPseudo = findViewById(R.id.edtPseudo);
        btnOK = findViewById(R.id.btnOK);
        edtPseudo.setOnClickListener(this);
        btnOK.setOnClickListener(this);
    }
    public void saluer(String s) {
        Toast myToast = Toast.makeText(this,s,Toast.LENGTH_LONG);
        myToast.show();
        Log.i(CAT, s);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CAT, "onStart");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.edtPseudo) {
            saluer("Saisir votre pseudo");
        } else if (v.getId() == R.id.btnOK) {
            saluer("click");
        }
    }
}