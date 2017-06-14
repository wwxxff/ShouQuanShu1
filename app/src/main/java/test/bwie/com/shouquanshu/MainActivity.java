package test.bwie.com.shouquanshu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.smssdk.SMSSDK;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText_Log_code;
    private Button button_getLog;
    private EditText editText_Log_name;
    private Button button_Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        SMSSDK.initSDK(this, "1cfc8f67e3720", "dbe82e103eb31bc9528f0fbfc33ff221");
    }

    private void initView() {
        editText_Log_code = (EditText) findViewById(R.id.editText_Log_code);
        button_getLog = (Button) findViewById(R.id.button_getLog);
        editText_Log_name = (EditText) findViewById(R.id.editText_Log_name);
        button_Log = (Button) findViewById(R.id.button_Log);

        button_getLog.setOnClickListener(this);
        button_Log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_getLog:

                break;
            case R.id.button_Log:

                break;
        }
    }

    private void submit() {
        // validate
        String code = editText_Log_code.getText().toString().trim();
        if (TextUtils.isEmpty(code)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        String name = editText_Log_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
