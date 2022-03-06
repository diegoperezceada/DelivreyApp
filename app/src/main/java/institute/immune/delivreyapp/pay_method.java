package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class pay_method extends AppCompatActivity {
    private EditText name, number, date, cvc;
    private List<String> listaNombre;
    private Date cogertiempo;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_method);

        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        date = findViewById(R.id.date);
        cvc = findViewById(R.id.cvc);

        listaNombre = new ArrayList<String>();

        imageView = findViewById(R.id.imageView2);
    }

    public void comprobar(View view) {
        listaNombre.add(name.getText().toString());
        String card = number.getText().toString();

        if (number.getText().length() != 16){
            Toast toast1 = Toast.makeText(view.getContext(),
                    "Formato de tarjeta incorrecto", Toast.LENGTH_SHORT);
            toast1.show();
        }

        if (card.startsWith("4")){
            imageView.setImageResource(R.drawable.visa_card);
        }

        if (card.startsWith("5")){
            imageView.setImageResource(R.drawable.card);
        }

        if (cvc.getText().length() != 3){
            Toast toast1 = Toast.makeText(view.getContext(),
                    "CVC incorrecto" +
                            "", Toast.LENGTH_SHORT);
            toast1.show();
        }

        else{
            Intent intent = new Intent(this, intermedia.class);
            startActivity(intent);
        }
    }

}