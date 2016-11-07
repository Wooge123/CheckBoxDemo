package com.example.checkboxdemo;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		String packageName = getPackageName();
		Log.d("TAG", "package name is " + packageName);
	}

}
