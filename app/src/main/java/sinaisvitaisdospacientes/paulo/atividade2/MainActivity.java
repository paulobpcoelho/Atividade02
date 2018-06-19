package sinaisvitaisdospacientes.paulo.atividade2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_prearterial;
    EditText edt_batcardiaco;
    EditText edt_temcorpo;

    EditText nome;
    EditText edt_numleito;

    Button botaoenviar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_prearterial = (EditText) findViewById(R.id.edt_pressao_arterial);
        edt_batcardiaco = (EditText) findViewById(R.id.edt_batimentos_cardiacos);
        edt_temcorpo = (EditText) findViewById(R.id.edt_temperatura_do_corpo);
        nome = (EditText) findViewById(R.id.nome_id);
        edt_numleito = (EditText) findViewById(R.id.edt_numero_do_leito);

        botaoenviar = (Button) findViewById(R.id.botao_enviar);


        botaoenviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity1.class);

                // Mandar os dados para outra activity
                Bundle bundle = new Bundle();

                bundle.putString("pa", nome.getText().toString());
                bundle.putInt("batimentos", Integer.parseInt(edt_batcardiaco.getText().toString()));
                bundle.putInt("temperatura", Integer.parseInt(edt_temcorpo.getText().toString()));
                bundle.putInt("pressao", Integer.parseInt(edt_prearterial.getText().toString()));
                bundle.putInt("leito", Integer.parseInt(edt_numleito.getText().toString()));

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
