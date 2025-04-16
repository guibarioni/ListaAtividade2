package com.example.lanchefacil;

import com.example.lanchefacil.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PedidoActivity extends AppCompatActivity {

    EditText editNome;
    String lancheSelecionado = "Hambúrguer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        editNome = findViewById(R.id.editNome);
    }

    public void selecionarLanche(View view) {
        int id = view.getId();

        if (id == R.id.btnHamburguer) {
            lancheSelecionado = "Hambúrguer";
        } else if (id == R.id.btnPizza) {
            lancheSelecionado = "Pizza";
        } else if (id == R.id.btnCachorroQuente) {
            lancheSelecionado = "Cachorro-Quente";
        }
    }


    public void confirmarPedido(View view) {
        String nome = editNome.getText().toString();
        Intent intent = new Intent(this, ResumoPedidoActivity.class);
        intent.putExtra("nome", nome);
        intent.putExtra("lanche", lancheSelecionado);
        startActivity(intent);
    }
}
