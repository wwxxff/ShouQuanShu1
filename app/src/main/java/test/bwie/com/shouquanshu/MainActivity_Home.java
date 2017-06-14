package test.bwie.com.shouquanshu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Home extends AppCompatActivity implements View.OnClickListener {

    private Button button_Front;
    private EditText editText_gender;
    private EditText editText_nation;
    private EditText editText_Address;
    private EditText editText_name;
    private EditText editText_prove;
    private Button button_Tail;
    private EditText editText_Organ;
    private EditText editText_period_start;
    private EditText editText_period_over;
    private Button button_number;
    private EditText editText_number;
    private EditText editText_phone;
    private EditText editText_Myphone;
    private ImageView ImageView_portrait;
    private ImageView ImageView_front;
    private ImageView ImageView_anti;
    private ImageView ImageView_Authorize;
    private ImageView ImageView_apply;
    private Button Button_home_present;
    private TextView textView_Query;
    private TextView textView_Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        button_Front = (Button) findViewById(R.id.button_Front);
        editText_gender = (EditText) findViewById(R.id.editText_gender);
        editText_nation = (EditText) findViewById(R.id.editText_nation);
        editText_Address = (EditText) findViewById(R.id.editText_Address);
        editText_name = (EditText) findViewById(R.id.editText_name);
        editText_prove = (EditText) findViewById(R.id.editText_prove);
        button_Tail = (Button) findViewById(R.id.button_Tail);
        editText_Organ = (EditText) findViewById(R.id.editText_Organ);
        editText_period_start = (EditText) findViewById(R.id.editText_period_start);
        editText_period_over = (EditText) findViewById(R.id.editText_period_over);
        button_number = (Button) findViewById(R.id.button_number);
        editText_number = (EditText) findViewById(R.id.editText_number);
        editText_phone = (EditText) findViewById(R.id.editText_phone);
        editText_Myphone = (EditText) findViewById(R.id.editText_Myphone);
        ImageView_portrait = (ImageView) findViewById(R.id.ImageView_portrait);
        ImageView_front = (ImageView) findViewById(R.id.ImageView_front);
        ImageView_anti = (ImageView) findViewById(R.id.ImageView_anti);
        ImageView_Authorize = (ImageView) findViewById(R.id.ImageView_Authorize);
        ImageView_apply = (ImageView) findViewById(R.id.ImageView_apply);
        Button_home_present = (Button) findViewById(R.id.Button_home_present);
        textView_Query = (TextView) findViewById(R.id.textView_Query);
        textView_Back = (TextView) findViewById(R.id.textView_query_Back);

        textView_Query.setOnClickListener(this);
        textView_Back.setOnClickListener(this);
        button_Front.setOnClickListener(this);
        button_Tail.setOnClickListener(this);
        button_number.setOnClickListener(this);
        Button_home_present.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Front:

                break;
            case R.id.button_Tail:

                break;
            case R.id.button_number:

                break;
            case R.id.Button_home_present:

                break;
            case R.id.textView_Query:

                break;
            case R.id.textView_query_Back:

                break;
        }
    }

    private void submit() {
        // validate
        String gender = editText_gender.getText().toString().trim();
        if (TextUtils.isEmpty(gender)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String nation = editText_nation.getText().toString().trim();
        if (TextUtils.isEmpty(nation)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String Address = editText_Address.getText().toString().trim();
        if (TextUtils.isEmpty(Address)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String name = editText_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String prove = editText_prove.getText().toString().trim();
        if (TextUtils.isEmpty(prove)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String Organ = editText_Organ.getText().toString().trim();
        if (TextUtils.isEmpty(Organ)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String start = editText_period_start.getText().toString().trim();
        if (TextUtils.isEmpty(start)) {
            Toast.makeText(this, "2012.08", Toast.LENGTH_SHORT).show();
            return;
        }

        String over = editText_period_over.getText().toString().trim();
        if (TextUtils.isEmpty(over)) {
            Toast.makeText(this, "2017.08", Toast.LENGTH_SHORT).show();
            return;
        }

        String number = editText_number.getText().toString().trim();
        if (TextUtils.isEmpty(number)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String phone = editText_phone.getText().toString().trim();
        if (TextUtils.isEmpty(phone)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        String Myphone = editText_Myphone.getText().toString().trim();
        if (TextUtils.isEmpty(Myphone)) {
            Toast.makeText(this, "请确认信息无误", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
