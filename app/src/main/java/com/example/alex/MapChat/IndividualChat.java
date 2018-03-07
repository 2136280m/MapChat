package com.example.alex.MapChat;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;


import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class IndividualChat extends AppCompatActivity {

    /* //Trying to get the API key from metadata
    try {
        ApplicationInfo ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
        Bundle bundle = ai.metaData;
        String myApiKey = bundle.getString("com.google.android.geo.API_KEY");
    } catch (Exception e) {
        Log.e(TAG, "Dear developer. Don't forget to configure <meta-data android:name=\"my_test_metagadata\" android:value=\"testValue\"/> in your AndroidManifest.xml file.");
    }
    */

    // todo API_KEY should not be stored in plain sight
    private static final String API_KEY = "AIzaSyA76E4nlLk0_AVd5XV-L4yIiLGWf7qkz3c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.translatedText);
        final Handler textViewHandler = new Handler();

        TranslateOptions options = TranslateOptions.newBuilder()
                .setApiKey(API_KEY)
                .build();
        /*
        Translate translate = options.getService();

        final Translation translation = translate.translate("Hello", Translate.TranslateOption.targetLanguage("de"));
        Toast.makeText(this, translation.getTranslatedText(), Toast.LENGTH_LONG).show();
        /*
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                TranslateOptions options = TranslateOptions.newBuilder()
                        .setApiKey(API_KEY)
                        .build();
                Translate translate = options.getService();
                final Translation translation =
                        translate.translate("Hello World",
                                Translate.TranslateOption.targetLanguage("de"));
                textViewHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (textView != null) {
                            textView.setText(translation.getTranslatedText());
                        }
                    }
                });
                return null;
            }
        }.execute();
        */
    }
}
