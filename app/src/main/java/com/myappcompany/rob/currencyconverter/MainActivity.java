package com.myappcompany.rob.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    public void convertCurrency(View view) {

        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollar = editText.getText().toString();

        double amountIninrDouble = Double.parseDouble(amountInDollar);

        double amountInDollarsDouble = amountIninrDouble * 75;

        String amountInINRString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "$ " + amountInDollar + " is INR " + amountInINRString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Log.i("Info", "Button pressed");
            }
        });

    }
}
