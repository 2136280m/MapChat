package com.example.alex.MapChat;

/**
 * Created by alex on 06/03/18.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tomer.fadingtextview.FadingTextView;

public class ChooseLanguageActivity extends Activity {

    //public static final String LANGUAGE_CHOSEN= "com.mapchat.mapchat.MESSAGE";
    public static final String LANGUAGE_CHOSEN= "";
    FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        fadingTextView = (FadingTextView)findViewById(R.id.fadingTextView);
        fadingTextView.setTimeout(FadingTextView.SECONDS,2);
    }


    /** Called when the user taps the English button */
    public void chooseEnglish(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("language", "English");
        this.startActivity(intent);
    }

    /** Called when the user taps the French button */
    public void chooseFrench(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("language", "French");
        this.startActivity(intent);
    }

    /** Called when the user taps the German button */
    public void chooseGerman(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("language", "German");
        this.startActivity(intent);
    }

}