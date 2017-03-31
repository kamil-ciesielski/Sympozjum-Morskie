package sympozjummorskie.sympozjummorskie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class AbstractActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AbstractAdapter commentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        recyclerView = (RecyclerView) findViewById(R.id.ConsultationsRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        commentAdapter = new AbstractAdapter();

        recyclerView.setAdapter(commentAdapter);





    }

}
