package com.example.alex.MapChat;

/**
 * Created by alex on 06/03/18.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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

        GridView gridview = (GridView) findViewById(R.id.gridview);
        final ImageAdapter imageAdapter = new ImageAdapter(this);
        gridview.setAdapter(imageAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse(imageAdapter.getItem(position).getImageUrlString()));
                //startActivity(intent);

                //TODO THIS IS NOT WORKING PROPERLY, FIND A WAY TO USE TO ACCESS THE CLASS FROM THE METHOD ABOVE

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }


    /** Called when the user taps the English button */
    public void chooseEnglish(View view) {
        Class test2 = "LoginActivity".getClass();
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