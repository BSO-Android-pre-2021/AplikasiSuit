package com.example.nikkoekasaputra.aplikasisuit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button batu, gunting, kertas;
    TextView pilihanCpu, hasil;

    int cpu;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batu = (Button) findViewById(R.id.batu);
        gunting = (Button) findViewById(R.id.gunting);
        kertas = (Button) findViewById(R.id.kertas);
        pilihanCpu = (TextView) findViewById(R.id.pilihan_cpu);
        hasil = (TextView) findViewById(R.id.hasil);



        //0 batu, 1 gunting, 2 kertas

        cpu = (int)(Math.random()*3); //0
        final String komputer;
        if(cpu==0){
            komputer = "BATU";
        }
        else if(cpu==1){
            komputer = "GUNTING";
        }
        else{
            komputer = "KERTAS";
        }

        batu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = "BATU";
                pilihanCpu.setText(komputer);
                if(komputer.equals("BATU")){
                    hasil.setText("DRAW");
                }
                else if(komputer.equals("GUNTING")){
                    hasil.setText("MENANG");
                }
                else{
                    hasil.setText("KALAH");
                }
            }
        });

        gunting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = "GUNTING";
                pilihanCpu.setText(komputer);
                if(komputer.equals("BATU")){
                    hasil.setText("KALAH");
                }
                else if(komputer.equals("GUNTING")){
                    hasil.setText("DRAW");
                }
                else{
                    hasil.setText("MENANG");
                }
            }
        });

        kertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = "KERTAS";
                pilihanCpu.setText(komputer);
                if(komputer.equals("BATU")){
                    hasil.setText("MENAGN");
                }
                else if(komputer.equals("GUNTING")){
                    hasil.setText("KALAH");
                }
                else{
                    hasil.setText("DRAW");
                }
            }
        });


    }
}
