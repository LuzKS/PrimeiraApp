package santos.souza.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); //obtem o intent q criou essa tela
        String amoeba = i.getStringExtra("amoeba"); //obtem o texto string vindo com a intent
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(amoeba); //seta o texto digitado na string no textview

    }
}