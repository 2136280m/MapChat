package com.example.alex.MapChat;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;


public class IndividualChat extends ListActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems=new ArrayList<String>();


    //ArrayList of messages created
    //AllMessages returnsArrayNeeded = new AllMessages();
    //ArrayList<IndividualMessage> arrayNeeded = returnsArrayNeeded.getAllMessagesArray();
    //arrayNeeded not has the arraylist we need for the rest of this

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;
    //final MessageAdapter messageAdapter = new MessageAdapter(this);
    EditText inputText;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        listItems.add("Hi guys!");
        listItems.add("This festival is so cool");
        listItems.add("Can't wait to see the headliner tonight!");
        listItems.add("Such a great atmostphere here");
        listItems.add("Anyone want some beer ;) ");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_chat);
        inputText = (EditText) findViewById(R.id.inputText);
        adapter=new ArrayAdapter<String>(this,R.layout.message_layout,listItems);
        setListAdapter(adapter);

        //setListAdapter(messageAdapter);

    }

    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void addItems(View v) {
        String translated = Translator.translate((inputText.getText().toString()),"fr","en");
        listItems.add(translated);
        adapter.notifyDataSetChanged();
        //AllMessages.allMessagesArray.add(new IndividualMessage(0,inputText.getText().toString(), "en"));
        //messageAdapter.notifyDataSetChanged();
    }
}


//translateButton.setOnClickListener(
//        new View.OnClickListener() {
//public void onClick(View view){
//        String translated  = Translator.translate("hello","en","de");
//        textView.setText(translated);
//        }
//        }
//        );