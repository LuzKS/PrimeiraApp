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

        //pega a intenção do main activity
        Intent i = getIntent();

        //pega a string criada em mainactivity
        String amoeba = i.getStringExtra("amoeba");

        //encontra o textview a partir do id
        TextView tvTexto = findViewById(R.id.tvTexto);

        //seta o texto digitado na string no textview
        tvTexto.setText(amoeba);

    }
}