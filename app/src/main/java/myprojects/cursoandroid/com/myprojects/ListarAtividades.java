package myprojects.cursoandroid.com.myprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListarAtividades extends AppCompatActivity {

    private ListView lista;
    private String[] atividades = {"Ir até a Loja de Material de Construção","Ir até a Revenda de Plantas",
            "Preparar a terra para o plantio","Iniciar Plantio","Atividade - N"};

    private Button btnNovo;
    private Button btnFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_atividades);

        lista = (ListView) findViewById(R.id.listAtividades);
        btnFinal = (Button) findViewById(R.id.btnFinalizarProj);
        btnNovo = (Button) findViewById(R.id.btnNovaAtiv);


        ArrayAdapter<String> adapt = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                atividades
        );

        lista.setAdapter(adapt);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(atividades[i].equals("Ir até a Loja de Material de Construção")){
                    startActivity(new Intent(ListarAtividades.this, ManterAtividades.class));
                }
                else{
                    Toast.makeText(ListarAtividades.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListarAtividades.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
            }
        });

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListarAtividades.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
