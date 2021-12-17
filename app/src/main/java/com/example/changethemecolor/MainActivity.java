package com.example.changethemecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(R.style.Aptheme_Red);
//        setContentView(R.layout.activity_main);


        SharedPreferences getShare = this.getPreferences(this.MODE_PRIVATE);
        int defaultValue = 100;
        int highScore = getShare.getInt("themeNum", defaultValue);

        if(highScore>10){
            SharedPreferences setsharedPref = this.getPreferences(this.MODE_PRIVATE);
            SharedPreferences.Editor editor = setsharedPref.edit();
            editor.putInt("themeNum", 0);
            editor.commit();
            recreate();
        }else {
            if(highScore == 0){
                setTheme(R.style.Aptheme_Red);
                setContentView(R.layout.activity_main);
            }else if (highScore ==1){
                setTheme(R.style.Aptheme_Yellow);
                setContentView(R.layout.activity_main);
            }else if (highScore ==2) {
                setTheme(R.style.Aptheme_Green);
                setContentView(R.layout.activity_main);
            }else {
                setTheme(R.style.Aptheme_Blue);
                setContentView(R.layout.activity_main);
            }
        }


    }

    public void setClickChangeTheme(View v){
        if(v == findViewById(R.id.button)){
            SharedPreferences setsharedPref = this.getPreferences(this.MODE_PRIVATE);
            SharedPreferences.Editor editor = setsharedPref.edit();
            editor.putInt("themeNum", 0);
            editor.commit();
            recreate();
        }else if (v ==findViewById(R.id.button2)){
            SharedPreferences setsharedPref = this.getPreferences(this.MODE_PRIVATE);
            SharedPreferences.Editor editor = setsharedPref.edit();
            editor.putInt("themeNum", 1);
            editor.commit();
            recreate();
        }else if (v ==findViewById(R.id.button3)) {
            SharedPreferences setsharedPref = this.getPreferences(this.MODE_PRIVATE);
            SharedPreferences.Editor editor = setsharedPref.edit();
            editor.putInt("themeNum", 2);
            editor.commit();
            recreate();
        }else {
            SharedPreferences setsharedPref = this.getPreferences(this.MODE_PRIVATE);
            SharedPreferences.Editor editor = setsharedPref.edit();
            editor.putInt("themeNum", 3);
            editor.commit();
            recreate();
        }
    }
}