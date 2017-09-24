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

public class ListarProjetos extends AppCompatActivity {

    private ListView lista;
    private String[] projetos = {"Projeto - Jardim","Projeto - 2", "Projeto - 3", "Projeto - N"};
    private Button btnNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_projetos);

        lista = (ListView) findViewById(R.id.ListProjetos);
        btnNovo= (Button) findViewById(R.id.btnNovoProj);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                projetos
        );

        lista.setAdapter(adapt);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(projetos[i].equals("Projeto - Jardim")){
                    startActivity(new Intent(ListarProjetos.this , ListarAtividades.class));
                }
                else{
                    Toast.makeText(ListarProjetos.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListarProjetos.this, "Não foi implementado.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
