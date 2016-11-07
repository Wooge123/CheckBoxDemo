package com.example.checkboxdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private CheckBox cb1, cb2, cb3;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cb1 = (CheckBox) findViewById(R.id.cb1);
		cb2 = (CheckBox) findViewById(R.id.cb2);
		cb3 = (CheckBox) findViewById(R.id.cb3);
		tv = (TextView) findViewById(R.id.tv);
		tv.setText("所选的项目为：");
		cb1.setOnCheckedChangeListener(mCheckBoxChanged);
		cb2.setOnCheckedChangeListener(mCheckBoxChanged);
		cb3.setOnCheckedChangeListener(mCheckBoxChanged);
	}

	private OnCheckedChangeListener mCheckBoxChanged = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			String str0 = "所选的项目为：";
			String str1 = "泰国机票一张";
			String str2 = "Iphone一台";
			String str3 = "Android整合应用范例集一本";
			String plus = ";";
			String result = "但是超过预算啰!!";
			String result2 = "还可以再多买几本喔!!";

			/* 8 kind of situation */
			if (cb1.isChecked() == true & cb2.isChecked() == true & cb3.isChecked() == true)
				tv.setText(str0 + str1 + plus + str2 + plus + str3 + plus + result);
			else if (cb1.isChecked() == false & cb2.isChecked() == true & cb3.isChecked() == true)
				tv.setText(str0 + str2 + plus + str3 + plus + result);
			else if (cb1.isChecked() == true & cb2.isChecked() == false & cb3.isChecked() == true)
				tv.setText(str0 + str1 + plus + str3 + plus + result);
			else if (cb1.isChecked() == true & cb2.isChecked() == true & cb3.isChecked() == false)
				tv.setText(str0 + str1 + plus + str2 + plus + result);
			else if (cb1.isChecked() == true & cb2.isChecked() == false & cb3.isChecked() == false)
				tv.setText(str0 + str1 + plus);
			else if (cb1.isChecked() == false & cb2.isChecked() == true & cb3.isChecked() == false)
				tv.setText(str0 + str2 + plus);
			else if (cb1.isChecked() == false & cb2.isChecked() == false & cb3.isChecked() == true)
				tv.setText(str0 + str3 + plus + result2 + plus);
			else if (cb1.isChecked() == false & cb2.isChecked() == false & cb3.isChecked() == false)
				tv.setText(str0);
		}

	};
}
