package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Restaurantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
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
}