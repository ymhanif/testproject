package com.labs.testproject;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button clickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intiLayout(){
        clickMe = (Button) findViewById(R.id.Btn_ClickMe);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Congratulations. You clicked a button", Snackbar.LENGTH_LONG)
                        .setAction("Dismiss", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // The snackbar is automatically dismissed, so you add
                                // whatever additional tasks to be performed
                            }
                        }).show();
            }
        });
    }
}
