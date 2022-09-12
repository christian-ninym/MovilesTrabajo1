package pe.edu.upeu.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class    Factorial extends AppCompatActivity {

    private EditText etl;
    private TextView tvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);


        etl =(EditText) findViewById(R.id.txt_factorialnumero);
        tvl =(TextView) findViewById(R.id.txt_respfacto);

    }

    public int factorial (int num){
        int aux=1;
        for (int i=2; i<=num; i++)
            aux=aux*i;
        return aux;
    }

    public int factorial2 (int num){
        if (num==0)
        return 1;
        else
            return num*factorial2(num=1);
    }

    public void factorial (View view){
        String valor2 = etl.getText().toString();
        int num = Integer.parseInt(valor2);
        tvl.setText("El FACTORIAL ES =" + factorial(num));
    }



    public void RegresarMenu(View view) {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}