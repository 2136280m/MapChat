package com.example.alex.MapChat;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    TextView textView;

    EditText inputText;

    Button translateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_chat);

         textView = findViewById(R.id.translatedText);

         inputText = findViewById(R.id.inputToTranslate);

         translateButton = findViewById(R.id.translateButton);

         translateButton.setOnClickListener(
                 new View.OnClickListener() {
                     public void onClick(View view){
                         String translated  = Translator.translate("hello","en","de");

                         textView.setText(translated);

                     }

                 }
         );

        final Handler textViewHandler = new Handler();

    }





    






}
