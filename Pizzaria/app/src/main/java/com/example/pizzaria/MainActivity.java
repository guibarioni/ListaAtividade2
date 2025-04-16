package com.example.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cbCalabresa, cbMarguerita, cbPortuguesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCalabresa = findViewById(R.id.cbCalabresa);
        cbMarguerita = findViewById(R.id.cbMarguerita);
        cbPortuguesa = findViewById(R.id.cbPortuguesa);

        findViewById(R.id.btnAvancar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder tipos = new StringBuilder();

                if (cbCalabresa.isChecked()) tipos.append("Calabresa ");
                if (cbMarguerita.isChecked()) tipos.append("Marguerita ");
                if (cbPortuguesa.isChecked()) tipos.append("Portuguesa ");

                Intent i = new Intent(MainActivity.this, TamanhoActivity.class);
                i.putExtra("tipos", tipos.toString().trim());
                startActivity(i);
            }
        });
    }
}
