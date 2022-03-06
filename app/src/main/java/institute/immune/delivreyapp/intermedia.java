package institute.immune.delivreyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class intermedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedia);
    }

    public void onClickPedirComida(View view){
        Intent intent = new Intent(this, Restaurantes.class);
        startActivity(intent);
    }

    public void onClickDarComida(View view){
        Intent intent = new Intent(this, soupKitchens.class);
        startActivity(intent);
    }

}