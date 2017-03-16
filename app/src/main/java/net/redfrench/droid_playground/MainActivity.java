package net.redfrench.droid_playground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mocker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userMsg = (EditText) findViewById(R.id.topText);
        Button button = (Button) findViewById(R.id.button);
        this.mocker = (TextView) findViewById(R.id.mockMe);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String message = userMsg.getText().toString();
                saySomething(message);
            }
        });

    }

    private void saySomething(String phrase) {
        Log.v("LOG", phrase);
        this.mocker.setText(phrase);
    }

}