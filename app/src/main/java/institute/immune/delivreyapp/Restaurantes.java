package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurantes extends AppCompatActivity {

    private ArrayList<String> lista[];
    private TextView bg;
    private TextView goiko;
    private TextView kfc;
    private TextView mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        try {
            leer();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onClickBurguer(View view){
        Intent intent = new Intent(this, Burguer.class);
        startActivity(intent);
    }

    public void onClickGoito(View view){
        Intent intent = new Intent(this, Goito.class);
        startActivity(intent);
    }

    public void onClickKfc(View view){
        Intent intent = new Intent(this, Kfc.class);
        startActivity(intent);
    }

    public void onClickMcDonalds(View view){
        Intent intent = new Intent(this, McDonalds.class);
        startActivity(intent);
    }

    public void leer() throws IOException {

        bg = findViewById(R.id.textViewBurguerKing);
        goiko = findViewById(R.id.textViewGoiko);
        kfc = findViewById(R.id.textViewKfc);
        mc = findViewById(R.id.textViewMcDonals);

        ArrayList <String>lista = new ArrayList<String>();
        InputStream archivo =getResources().openRawResource(R.raw.restaurantes);
        BufferedReader b = new BufferedReader(new InputStreamReader(archivo));
        String strng;
        while((strng = b.readLine())!=null) {
                lista.add(strng);
        }

        String textBG =lista.get(0);
        String textGk =lista.get(1);
        String textKfc =lista.get(2);
        String textMc =lista.get(3);


        bg.setText(textBG);
        goiko.setText(textGk);
        kfc.setText(textKfc);
        mc.setText(textMc);


    }
}