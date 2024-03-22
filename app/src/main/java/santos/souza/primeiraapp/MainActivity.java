package santos.souza.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cria e busca o botão da interface xml
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //ele vai "ouvir" o click do usuário
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //quando clicado, os comandos abaixo serão chamados
            public void onClick(View v) {
                //cria e busca o edittext da interface xml
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //pega o texto digitado e guarda dentro da variável transformando ele em string
                String textoDigitado = etDigiteAqui.getText().toString();

                //cria uma nova "intenção", ou seja, ele tem a intenção de que isso seja executado e será executado quando for possível
                //a intenção é abrir a tela next actibity
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                //ele cria uma chave e valor onde a chave ta entre aspas e o valor é o que ta dentro da variável texto digitado, manda td isso junto com a intenção
                i.putExtra("amoeba", textoDigitado);

                //inicia a nova tela sinalizada em Intente i
                startActivity(i);

            }
        });
    }
}