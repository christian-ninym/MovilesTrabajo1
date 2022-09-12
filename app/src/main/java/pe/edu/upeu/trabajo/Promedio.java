package pe.edu.upeu.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Promedio extends AppCompatActivity {

    private EditText num_uno;
    private EditText num_dos;
    private EditText num_tres;
    private EditText num_cuatro;
    private EditText num_cinco;
    private EditText num_seis;
    private EditText num_siete;
    private EditText num_ocho;
    private EditText num_nueve;
    private EditText num_diez;
    private TextView resp;
    private Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio1);

        num_uno = (EditText) findViewById(R.id.dato_1);
        num_dos = (EditText) findViewById(R.id.dato_2);
        num_tres = (EditText) findViewById(R.id.dato_3);
        num_cuatro = (EditText) findViewById(R.id.dato_4);
        num_cinco = (EditText) findViewById(R.id.dato_5);
        num_seis = (EditText) findViewById(R.id.dato_6);
        num_siete = (EditText) findViewById(R.id.dato_7);
        num_ocho = (EditText) findViewById(R.id.dato_8);
        num_nueve = (EditText) findViewById(R.id.dato_9);
        num_diez = (EditText) findViewById(R.id.dato_10);
        resp = (TextView) findViewById(R.id.txt_respromedio);

    }

    public void evaluar (View view){

        try {
            String Primero = num_uno.getText().toString();
            String segundo = num_dos.getText().toString();
            String tercero = num_tres.getText().toString();
            String cuarto = num_cuatro.getText().toString();
            String quinto = num_cinco.getText().toString();
            String sexto = num_seis.getText().toString();
            String septimo = num_siete.getText().toString();
            String octavo = num_ocho.getText().toString();
            String noveno = num_nueve.getText().toString();
            String decimo = num_diez.getText().toString();

            int promedio1 = Integer.parseInt(Primero);
            int promedio2 = Integer.parseInt(segundo);
            int promedio3 = Integer.parseInt(tercero);
            int promedio4 = Integer.parseInt(cuarto);
            int promedio5 = Integer.parseInt(quinto);
            int promedio6 = Integer.parseInt(sexto);
            int promedio7 = Integer.parseInt(septimo);
            int promedio8 = Integer.parseInt(octavo);
            int promedio9 = Integer.parseInt(noveno);
            int promedio10 = Integer.parseInt(decimo);

            int resultpromedio = (promedio1+promedio2+promedio3+promedio4+promedio5+promedio6+promedio7+promedio8+promedio9+promedio10)/10;

            int minimo =promedio1;

            if (promedio1<minimo){
                minimo = promedio1;
            } if (promedio2<minimo){
                minimo = promedio2;
            } if (promedio3<minimo){
                minimo = promedio3;
            } if (promedio4<minimo){
                minimo = promedio4;
            } if (promedio5<minimo){
                minimo = promedio5;
            } if (promedio6<minimo){
                minimo = promedio6;
            } if (promedio7<minimo){
                minimo = promedio7;
            } if (promedio8<minimo){
                minimo = promedio8;
            } if (promedio9<minimo){
                minimo = promedio9;
            } if (promedio10<minimo){
                minimo = promedio10;
            }

            resp.setText("Promedio = " + resultpromedio + " y el minimo es = " + minimo);

        } catch (Exception e){
            Toast.makeText(this, "Inserte todos los casilleros", Toast.LENGTH_SHORT).show();
        }


    }


    public void RegresarMenu(View view) {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}