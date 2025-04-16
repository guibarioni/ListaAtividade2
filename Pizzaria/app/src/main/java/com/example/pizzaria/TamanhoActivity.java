package com.example.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class TamanhoActivity extends AppCompatActivity {

    RadioGroup rgTamanho, rgPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamanho);

        rgTamanho = findViewById(R.id.rgTamanho);
        rgPagamento = findViewById(R.id.rgPagamento);

        findViewById(R.id.btnResumo).setOnClickListener(view -> {
            int valor = 0;
            String tamanho = "";
            String pagamento = "";

            int idSelecionado = rgTamanho.getCheckedRadioButtonId();
            if (idSelecionado == R.id.rbPequena) {
                tamanho = "Pequena";
                valor = 25;
            } else if (idSelecionado == R.id.rbMedia) {
                tamanho = "Média";
                valor = 35;
            } else if (idSelecionado == R.id.rbGrande) {
                tamanho = "Grande";
                valor = 45;
            }


            int idPagamento = rgPagamento.getCheckedRadioButtonId();
            if (idPagamento == R.id.rbDinheiro) {
                pagamento = "Dinheiro";
            } else if (idPagamento == R.id.rbCartao) {
                pagamento = "Cartão";
            }


            String tipos = getIntent().getStringExtra("tipos");

            Intent i = new Intent(this, ResumoActivity.class);
            i.putExtra("tipos", tipos);
            i.putExtra("tamanho", tamanho);
            i.putExtra("pagamento", pagamento);
            i.putExtra("valor", valor);
            startActivity(i);
        });
    }
}
