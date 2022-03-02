package institute.immune.delivreyapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    MyOpenHelper myOpenHelper;
    private EditText inputPhone,inputPass;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myOpenHelper = new MyOpenHelper(this);
        inputPhone = findViewById(R.id.inputPhone);
        inputPass = findViewById(R.id.inputPassword);

    }

    public void onclick(View view){

        MyOpenHelper myOpenHelper = new MyOpenHelper(this);
        SQLiteDatabase db = myOpenHelper.getReadableDatabase();

        String datosPhone = inputPhone.getText().toString();
        String datosPassword = inputPass.getText().toString();

        cursor=db.rawQuery("SELECT phone, password FROM user where phone='"+datosPhone+"' and password='"+datosPassword+"'",null);
        try {
            if (cursor.moveToFirst()){
                String phone = cursor.getString(0);
                String password = cursor.getString(1);
                if (datosPhone.equals(phone)&& datosPassword.equals(password)){
                    Intent intent = new Intent(this, intermedia.class);
                    startActivity(intent);
                    inputPhone.setText("");
                    inputPass.setText("");
                }
            }
            else {
                Toast toast=Toast.makeText(this,"Datos incorrectos",Toast.LENGTH_LONG);
                //mostramos el toast


                toast.show();
            }
        } catch (Exception e) {//capturamos los errores que ubieran
            Toast toast=Toast.makeText(this,"Error" + e.getMessage(),Toast.LENGTH_LONG);
            //mostramos el mensaje
            toast.show();
        }

        // 123456789
        // 12345

    }
}