package test.bwie.com.shouquanshu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.smssdk.SMSSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SMSSDK.initSDK(this, "1cfc8f67e3720", "dbe82e103eb31bc9528f0fbfc33ff221");
    }
}
