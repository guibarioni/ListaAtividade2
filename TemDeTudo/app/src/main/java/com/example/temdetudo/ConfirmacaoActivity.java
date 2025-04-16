package com.example.temdetudo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacaoActivity extends AppCompatActivity {

    TextView tvMensagem;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvMensagem = findViewById(R.id.tvMensagem);
        btnVoltar = findViewById(R.id.btnVoltar);

        String nome = getIntent().getStringExtra("nome_cliente");
        tvMensagem.setText("Bem-vindo, " + nome + "!");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(ConfirmacaoActivity.this, MainActivity.class);
                voltar.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(voltar);
            }
        });
    }
}
