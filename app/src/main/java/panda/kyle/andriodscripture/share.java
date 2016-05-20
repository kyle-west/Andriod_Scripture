package panda.kyle.andriodscripture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        String book = getIntent().getStringExtra("book");
        String chapter = getIntent().getStringExtra("chapter");
        String verse = getIntent().getStringExtra("verse");

        TextView output = (TextView)findViewById(R.id.printout);
        String msg = "Your favorite scripture is: \n\n" + book + " " + chapter + ":" + verse;
        output.setText(msg);
    }
}
