package panda.kyle.andriodscripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View v){
        Intent share_intent = new Intent(getApplicationContext(), share.class);
        EditText book    = (EditText)findViewById(R.id.book);
        EditText chapter = (EditText)findViewById(R.id.chapter);
        EditText verse   = (EditText)findViewById(R.id.verse);
        share_intent.putExtra("book", book.getText().toString());
        share_intent.putExtra("chapter", chapter.getText().toString());
        share_intent.putExtra("verse", verse.getText().toString());
        startActivity(share_intent);
    }
}
