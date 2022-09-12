package pe.edu.upeu.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Cajero extends AppCompatActivity {

    private Button btnretirar, btnconsultar, btnAgregar;
    private EditText  txtNumerador;
    private TextView txtBancoRsp;
    double saldo = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajero);

        btnretirar = (Button) findViewById(R.id.btnRetirar);
        btnconsultar = (Button) findViewById(R.id.btnConsultarSaldo);
        btnAgregar = (Button)findViewById(R.id.btnAgregar);
        txtNumerador = (EditText) findViewById(R.id.txtNumerador);
        txtBancoRsp = (TextView) findViewById(R.id.txtBancoRsp);


        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = txtNumerador.getText().toString();
                double a = Integer.parseInt(valor);
                saldo =  saldo + a;
                txtBancoRsp.setText("S/." + saldo);
            }
        });


        btnconsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBancoRsp.setText("S/." + saldo);
            }
        });

        btnretirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = txtNumerador.getText().toString();
                double a = Integer.parseInt(valor);

                if(a>saldo){
                    Toast.makeText(Cajero.this, "Saldo insuficiente", Toast.LENGTH_SHORT).show();
                } else {
                    saldo =  saldo - a;
                    txtBancoRsp.setText("S/." + saldo);
                }
            }
        });

    }



    public void RegresarMenu(View view) {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);

    }
}