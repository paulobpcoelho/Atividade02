package sinaisvitaisdospacientes.paulo.atividade2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText; /* Não se usa*/
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private TextView preArterial1;
    private TextView batCardiaco1;
    private TextView temCorpo1;
    private TextView nomPaciente1;
    private TextView numLeito1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        preArterial1 = (TextView) findViewById(R.id.edt_pressao_arterial1);
        batCardiaco1 = (TextView) findViewById(R.id.edt_batimentos_cardiacos1);
        temCorpo1 = (TextView) findViewById(R.id.edt_temperatura_do_corpo1);
        nomPaciente1 = (TextView) findViewById(R.id.nome_id1);
        numLeito1 = (TextView) findViewById(R.id.edt_numero_do_leito1);


        Intent intent = getIntent();

        Bundle chamar = intent.getExtras();

        String paciente = chamar.getString("pa");

        nomPaciente1.setText(paciente);

        /* Teste */

        int batimentos = chamar.getInt("batimentos");
        batCardiaco1.setText(String.valueOf(batimentos));

        int temperatura = chamar.getInt("temperatura");
        temCorpo1.setText(String.valueOf(temperatura));

        int pressao = chamar.getInt("pressao");
        preArterial1.setText(String.valueOf(pressao));

        int leito = chamar.getInt("leito");
        numLeito1.setText(String.valueOf(leito));

        Button voltar = (Button) findViewById(R.id.botao_voltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
