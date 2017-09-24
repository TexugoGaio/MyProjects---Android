package myprojects.cursoandroid.com.myprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManterAtividades extends AppCompatActivity {

    private Button btnFinal;
    private Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manter_atividades);

        btnEdit = (Button) findViewById(R.id.btnEditarAtiv);
        btnFinal = (Button) findViewById(R.id.btnFinalizarAtiv);

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManterAtividades.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManterAtividades.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
