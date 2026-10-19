package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Notatka> listaNotatek;

    Button button;
    EditText tytul;
    EditText tresc;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        tytul = findViewById(R.id.editTextText);
        tresc = findViewById(R.id.editTextText2);
        listview = findViewById(R.id.listview);
        listaNotatek = new ArrayList<>();



        ArrayAdapter<Notatka> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaNotatek);
        listview.setAdapter(arrayAdapter);


        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Notatka notatkaTemp = new Notatka(tytul.getText().toString(), tresc.getText().toString());
                        listaNotatek.add(notatkaTemp);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );


    }
}