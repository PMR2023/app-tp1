package com.example.apptp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String CAT = "PMR";
    private EditText edtPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT, "onCreate");
        edtPseudo = findViewById(R.id.edtPseudo);
        edtPseudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saluer("entrez votre pseudo");
            }
        });
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


}