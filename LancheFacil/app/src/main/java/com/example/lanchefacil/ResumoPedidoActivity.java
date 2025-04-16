package com.example.lanchefacil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResumoPedidoActivity extends AppCompatActivity {

    TextView txtResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        txtResumo = findViewById(R.id.txtResumo);

        String nome = getIntent().getStringExtra("nome");
        String lanche = getIntent().getStringExtra("lanche");

        txtResumo.setText("Pedido de " + nome + ":\n" + lanche);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // limpa pilha
        startActivity(intent);
    }
}
