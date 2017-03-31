package sympozjummorskie.sympozjummorskie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finishscreen();
            }
        };
        Timer t = new Timer();
        t.schedule(task, 1500);
    }
    private void finishscreen() {
        this.finish();
    }
}
