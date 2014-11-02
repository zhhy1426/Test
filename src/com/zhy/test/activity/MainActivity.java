package com.zhy.test.activity;

import android.app.Activity;
import android.os.Bundle;

import com.loopj.android.image.SmartImageView;
import com.zhy.test.R;

public class MainActivity extends Activity {
	private SmartImageView imgTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initUI();
        initData();
    }

	private void initData() {
		String path = "http://s1.sns.maimaicha.com/images/2013/04/18/b0a9fed6aaef278fb5061b194c63d088.jpg";
		imgTest.setImageUrl(path, R.drawable.ic_launcher, R.drawable.ic_launcher);
	}

	private void initUI() {
		imgTest = (SmartImageView) findViewById(R.id.img_test);
	}
}
