package com.example.mpesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LipaNaMpesa extends AppCompatActivity {

    EditText PhoneNumber, AmountPay;
    Button payment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipa_na_mpesa);

        PhoneNumber = findViewById(R.id.phone);
        AmountPay = findViewById(R.id.amount);
        payment = findViewById(R.id.pay);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PhoneNo = PhoneNumber.getText().toString();
                String AmountPayable = AmountPay.getText().toString();

                if (PhoneNo.isEmpty() && AmountPayable.isEmpty()){
                    Toast.makeText(LipaNaMpesa.this, "Fill the Empty fields", Toast.LENGTH_SHORT).show();
                    if (PhoneNo.isEmpty()){
                    }
                } else {
                    Toast.makeText(LipaNaMpesa.this, "Bill Paid Successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LipaNaMpesa.this, MainActivity.class));
                }
            }
        });

    }
}