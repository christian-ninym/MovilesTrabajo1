package pe.edu.upeu.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Salir(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void entrarPromedio(View view) {
        Intent i = new Intent(this, Promedio.class);
        startActivity(i);
    }

    public void entrarFactorial(View view) {
        Intent i = new Intent(this, Factorial.class);
        startActivity(i);
    }

    public void entrarCalculadora(View view) {
        Intent i = new Intent(this, Calculadora.class);
        startActivity(i);
    }

    public void entrarCajero(View view) {
        Intent i = new Intent(this, Cajero.class);
        startActivity(i);
    }
}