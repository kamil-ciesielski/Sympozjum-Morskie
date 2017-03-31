package sympozjummorskie.sympozjummorskie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {

    public TextView autorTextview;
    public TextView streszczenieTextview;
    public TextView infoTextview;
    public TextView tytulTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);




        Intent intent = getIntent();

        // textViewBookPrice.setText(intent.getStringExtra(MainActivity.KEY_BOOK_PRICE));


        String autor = intent.getStringExtra(AbstractAdapter.CommentViewHolder.KEY_AUTOR);
        String streszczenie = intent.getStringExtra(AbstractAdapter.CommentViewHolder.KEY_STESZCZENIE);
        String info = intent.getStringExtra(AbstractAdapter.CommentViewHolder.KEY_INFO);
        String tytul = intent.getStringExtra(AbstractAdapter.CommentViewHolder.KEY_TYTUL);


        setTitle(tytul);

        autorTextview = (TextView) findViewById(R.id.autor);
        streszczenieTextview= (TextView) findViewById(R.id.streszczenie);
        infoTextview = (TextView) findViewById(R.id.info);
        tytulTextview = (TextView) findViewById(R.id.tytul);

        autorTextview.setText(autor);
        streszczenieTextview.setText(Html.fromHtml("<p style=\"text-align:justify;\">"+streszczenie+"</p>"));
        infoTextview.setText(info);
        tytulTextview.setText(tytul);

    }
}
