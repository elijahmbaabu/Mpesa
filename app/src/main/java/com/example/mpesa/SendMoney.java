package com.example.mpesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendMoney extends AppCompatActivity {
    EditText number, money;
    Button SendMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        number = findViewById(R.id.phone);
        SendMoney = findViewById(R.id.send);
        money = findViewById(R.id.amount);

        SendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PhoneNumber = number.getText().toString();
                String sendAmount =money.getText().toString();
                
                if (PhoneNumber.isEmpty() && sendAmount.isEmpty()){
                    Toast.makeText(com.example.mpesa.SendMoney.this, "Fill The Empty Fields!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(com.example.mpesa.SendMoney.this, "Money send successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(com.example.mpesa.SendMoney.this, MainActivity.class));
                }
            }
        });
    }
}