package myprojects.cursoandroid.com.myprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtSenha;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = "admin";
                String senha = "admin";

                String textoUser = txtUser.getText().toString();
                String textoSenha = txtSenha.getText().toString();

                if(textoUser.equals(user)){
                    if(textoSenha.equals(senha)){
                        startActivity(new Intent(MainActivity.this, ListarProjetos.class));

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Senha incorreta", Toast.LENGTH_SHORT).show();
                        txtSenha.setText("");
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuário incorreto" , Toast.LENGTH_SHORT).show();

                    txtUser.setText("");
                    txtSenha.setText("");
                }
            }
        });


    }
}
