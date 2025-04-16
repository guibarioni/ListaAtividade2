package com.example.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResumoActivity extends AppCompatActivity {

    TextView txtResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        txtResumo = findViewById(R.id.txtResumo);

        String tipos = getIntent().getStringExtra("tipos");
        String tamanho = getIntent().getStringExtra("tamanho");
        String pagamento = getIntent().getStringExtra("pagamento");
        int valor = getIntent().getIntExtra("valor", 0);

        String resumo = "Pedido:\nPizza: " + tipos + "\nTamanho: " + tamanho +
                "\nPagamento: " + pagamento + "\nValor Total: R$ " + valor;

        txtResumo.setText(resumo);

        findViewById(R.id.btnNovo).setOnClickListener(view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }
}
