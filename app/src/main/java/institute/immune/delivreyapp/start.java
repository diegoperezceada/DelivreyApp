package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class start extends AppCompatActivity {

    /**
        PANTALLA PRINCIPAL DE DELICIOUS
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void OnclickRegistrr(View view){
        Intent intent = new Intent(this, Registrer.class);
        startActivity(intent);

    }


}