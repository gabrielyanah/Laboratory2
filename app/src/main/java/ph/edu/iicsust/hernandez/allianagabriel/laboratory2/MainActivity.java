package ph.edu.iicsust.hernandez.allianagabriel.laboratory2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCon = (Button)findViewById(R.id.buttonCon);
        buttonCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonCon = new Intent(getApplicationContext(), Constraint.class);
                startActivity(buttonCon);
            }
        });

        Button buttonLin = (Button)findViewById(R.id.buttonLin);
        buttonLin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonLin = new Intent(getApplicationContext(), Linear.class);
                startActivity(buttonLin);
            }
        });

        Button buttonRel = (Button)findViewById(R.id.buttonRel);
        buttonRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonRel = new Intent(getApplicationContext(), Relative.class);
                startActivity(buttonRel);
            }
        });
    }
}
