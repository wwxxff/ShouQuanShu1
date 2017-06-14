package test.bwie.com.shouquanshu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity_Query extends AppCompatActivity {

    private TextView textView_Back;
    private ListView ListView_query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        initView();
    }

    private void initView() {
        textView_Back = (TextView) findViewById(R.id.textView_Back);
        ListView_query = (ListView) findViewById(R.id.ListView_query);

    }
}
