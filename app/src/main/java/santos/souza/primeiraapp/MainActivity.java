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
        setContentView(R.layout.activity_main); //le arquivo layout e constroi interface
        Button btnEnviar = findViewById(R.id.btnEnviar); //busca e obtém o botao da interface xml
        btnEnviar.setOnClickListener(new View.OnClickListener() { //define o "ouvidor" de click do usuario
            @Override
            public void onClick(View v) {//quando clicado, os comandos abaixo serao chamados
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //busca e obtem o edittext da interface xml
                String textoDigitado = etDigiteAqui.getText().toString(); //pega o texto digitado e guarda dentro da variavel transformando ele em string

                //cria uma nova "intenção", ou seja, ele tem a intenção de que isso seja executado e será executado quando for possível
                //a intenção é abrir a tela next activity
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("amoeba", textoDigitado); //ele cria uma chave e valor onde a chave ta entre aspas e o valor é o que ta dentro da variável texto digitado, manda td isso junto com a intenção
                startActivity(i); //navegar para a próxima tela sinalizada em Intent i

            }
        });
    }
}