package tech.iwish.moneyshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        {
            {
                try {
                    this.getSupportActionBar().hide();
                } catch (NullPointerException e) {
                }

            }
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_sigup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sigup.class);
                startActivity(intent);
            }
        });

    }
}
