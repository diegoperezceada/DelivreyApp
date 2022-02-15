package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registrer extends AppCompatActivity {

    private EditText phone, mail, password;
    private String[] lista = {"ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"};
    Pattern letter = Pattern.compile("[a-zA-z]");
    Pattern digit = Pattern.compile("[0-9]");
    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrer);
        phone = findViewById(R.id.editTextPhone);
        mail = findViewById(R.id.input_email);
        password = findViewById(R.id.inputPassword);

    }

    public void OnclickLogin(View view){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void recogerDatos(View view){
        String datos_Phone = phone.getText().toString();
        String datosMail = mail.getText().toString();
        String datosPassword = password.getText().toString();

        Matcher hasLetter = letter.matcher(datosPassword);
        Matcher hasDigit = digit.matcher(datosPassword);
        Matcher hasSpecial = special.matcher(datosPassword);
        if (datos_Phone.length()!= 9){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Inserte un teléfono válido", Toast.LENGTH_SHORT);
            toast1.show();
        }

        if (!datosMail.contains("@")){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Inserte un email válido", Toast.LENGTH_SHORT);
            toast1.show();
        }

        if(datosPassword.length() != 8 && hasLetter.find() && hasDigit.find() && hasSpecial.find()){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Inserte una contraseña más segura", Toast.LENGTH_SHORT);
            toast1.show();
        }

    }

}