package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class soupKitchens extends AppCompatActivity {
    private ArrayList<String> lista[];

    private TextView comedor1, comedor2, comedor3, comedor4, calle1, calle2, calle3, calle4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup_kitchens);
    }

    public void leer() throws IOException {

        comedor1 = findViewById(R.id.textView17);
        comedor2 = findViewById(R.id.textView21);
        comedor3 = findViewById(R.id.textView24);
        comedor4 = findViewById(R.id.textView26);
        calle1 = findViewById(R.id.textView18);
        calle2 = findViewById(R.id.textView22);
        calle3 = findViewById(R.id.textView20);
        calle4 = findViewById(R.id.textView27);

        ArrayList <String>lista = new ArrayList<String>();
        InputStream archivo =getResources().openRawResource(R.raw.comedores);
        BufferedReader b = new BufferedReader(new InputStreamReader(archivo));
        String strng;
        while((strng = b.readLine())!=null) {
            lista.add(strng);
        }

        String comedorr1 =lista.get(0);
        String c = lista.get(1);
        String comedorr2 =lista.get(2);
        String c1 = lista.get(3);
        String comedorr3 =lista.get(4);
        String c2 = lista.get(5);
        String comedorr4 =lista.get(6);
        String c3 = lista.get(7);



        comedor1.setText(comedorr1);
        comedor2.setText(comedorr2);
        comedor3.setText(comedorr3);
        comedor4.setText(comedorr4);

        calle1.setText(c);
        calle2.setText(c1);
        calle3.setText(c2);
        calle4.setText(c3);


    }
}