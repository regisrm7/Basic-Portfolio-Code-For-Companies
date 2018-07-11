package com.example.consultoria.divulgacaodeempresaxxx;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView empresa;
    private ImageView contato;
    private ImageView clientes;
    private ImageView servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empresa=(ImageView) findViewById(R.id.empresa_id);
        contato=(ImageView) findViewById(R.id.contato_id);
        clientes=(ImageView) findViewById(R.id.clientes_id);
        servicos=(ImageView) findViewById(R.id.servicos_id);


        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));

            }
        });
        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });
        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });


    }
}
