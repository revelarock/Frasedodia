package frasedodia.abctech.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {

            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo – Winston Churchill, político",
            "Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los – Walt Disney, desenhista e empreendedor",
            "\"Para de perseguir o dinheiro e comece a perseguir o sucesso\" – Tony Hsieh, empreendedor",
            "\"Se você não está disposto a arriscar, esteja disposto a uma vida comum\" – Jim Rohn, empreendedor",
            "\"Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos\" – James Cameron, cineasta",
            "\"O sucesso normalmente vem para quem está ocupado demais para procurar por ele\" – Henry David Thoreau, filósofo",
            "\"A vida é melhor para aqueles que fazem o possível para ter o melhor – John Wooden, jogador e treinador de basquete",
            "POBRE QUE É POBRE ... VAI PRA CIDADE VIZINHA VISITAR OS PARENTES E DIZ QUE VIAJOU\n" +
                    "Caco Antibes",
            "POBRE QUE É POBRE, BATE GELATINA COM LEITE CONDENSADO NO LIQUIDIFICADOR E DIZ QUE FEZ UMA SOBREMESA.\n" +
                    "Caco Antibes",





    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovafraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        //textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
