package vedant9.com.task3;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;


public class SecondActivity extends AppCompatActivity {
    private LinearLayout Linear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Linear = (LinearLayout) findViewById(R.id.Linear);
        Snackbar.make(Linear, "Second Activity", Snackbar.LENGTH_LONG).show();




    }
}
