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

import java.util.ArrayList;


public class IndividualChat extends AppCompatActivity {

    // todo API_KEY should not be stored in plain sight
    private static final String API_KEY = "AIzaSyA76E4nlLk0_AVd5XV-L4yIiLGWf7qkz3c";

    TextView textView;
    EditText inputText;
    Button translateButton;
    static ArrayList<Message> messageArray;
    static int messageId = 0;

    public static class Message{
        String username;
        String messageContent;
        int id;

        public Message(String username, String messageContent) {
            this.username = username;
            this.id = messageId;
            messageId++;
            this.messageContent = messageContent;
        }

        public String getUsername() {
            return username;
        }

        public int getMessageId() {
            return messageId;
        }

        public String getMessageContent() {
            return messageContent;
        }
    }

    static void populateMessageArrayList(){
        messageArray.add(new Message("John","this is the first message"));
        messageArray.add(new Message("Sally","this is the second message"));
        messageArray.add(new Message("James","hi there everyone"));
    }

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



    }





    






}
