package com.example.alex.myapplication;

/**
 * Created by alex on 06/03/18.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseLanguageActivity extends Activity {

    //public static final String LANGUAGE_CHOSEN= "com.mapchat.mapchat.MESSAGE";
    public static final String LANGUAGE_CHOSEN= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);
    }


    /** Called when the user taps the English button */
    public void chooseEnglish(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("language", "English");
        this.startActivity(intent);
    }

}