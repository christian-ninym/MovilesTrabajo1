package pe.edu.upeu.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText id;
    private EditText password;
    private Button login;
    private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id       = findViewById(R.id.txt_id);
        password = findViewById(R.id.txt_password);
        login    = findViewById(R.id.btn_login);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logearmenu(id.getText().toString(),password.getText().toString());
            }
        });
    }

    public void Logearmenu (String Userid, String Userpassword){
        if((Userid.equals("christian"))  && (Userpassword.equals("upeu"))){
            Intent i = new Intent(this, Menu.class);
            startActivity(i);
        } else {
            counter--;

            Toast.makeText(this, "Usuario y/o contraseña incorrecta, inserte correctamente", Toast.LENGTH_SHORT).show();

            if (counter == 0){
                login.setEnabled(false);
            }
        }

    }
}