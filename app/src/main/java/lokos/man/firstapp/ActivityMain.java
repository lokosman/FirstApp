package lokos.man.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    Button bttnEnter, bttnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnEnter = (Button) findViewById(R.id.bttnEnter);
        bttnExit  = (Button) findViewById(R.id.bttnExit);
    }

    public void Enter(View view) {
        bttnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityMain.this, "I Was Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
