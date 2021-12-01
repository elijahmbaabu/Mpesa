package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String menus [] = {"Safaricom","Send Money", "Withdraw Cash", "Buy Airtime", "Loans and Savings", "Lipa na M-PESA", "My Account"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listView);

        ArrayAdapter <String> arrayList;

        arrayList= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, menus);

        list.setAdapter(arrayList);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, menus[position], Toast.LENGTH_SHORT).show();
                if (position == 1){
                    startActivity(new Intent(MainActivity.this,
                            SendMoney.class));
                }
                if (position == 5){
                    startActivity(new Intent(MainActivity.this, LipaNaMpesa.class));
                }

            }
        });



    }
}