package com.example.alex.MapChat;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Michael on 08/03/2018.
 */

public class CreateHotspot extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner ownerSpinner;

    Spinner inviteSpinner;

    Bundle bundle = new Bundle();


    //class members
    String owners[] = {"You", "Others"};

    String inviteStyles[] = {"Invite Only", "Open"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.create_hotspot);

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm. widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.9),(int) (height*.9));

        ownerSpinner = (Spinner) findViewById(R.id.spinner1);
        ownerSpinner.setOnItemSelectedListener(this);

        inviteSpinner = (Spinner) findViewById(R.id.spinner2);
        inviteSpinner.setOnItemSelectedListener(this);



        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,owners);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ownerSpinner.setAdapter(aa);

        ArrayAdapter aa2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,inviteStyles);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inviteSpinner.setAdapter(aa2);

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), owners[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }


    public void onSubmit(View  view){

    }


}
