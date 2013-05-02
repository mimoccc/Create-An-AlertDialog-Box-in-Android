package com.androidbegin.alertdialog;
 
import android.os.Bundle;
import android.app.Activity;

 
public class NewActivity extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("New Activity");
        setContentView(R.layout.new_activity); 
    }
}