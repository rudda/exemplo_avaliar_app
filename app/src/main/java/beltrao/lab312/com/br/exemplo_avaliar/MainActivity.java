package beltrao.lab312.com.br.exemplo_avaliar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btGooglePlay;
    private String baseUrl="https://play.google.com/store/apps/details?id=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGooglePlay = (Button) findViewById(R.id.bt_open_gp);


        btGooglePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse
                (baseUrl+"com.icet.fabricaReciclagem.ChristianRayaneRubber"));
                startActivity(i);

            }
        });


    }
}
