package com.example.alex.MapChat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class ChatFragment extends ListFragment implements AdapterView.OnItemClickListener {

    // FOR NOW ALL THIS DOES IS TAKE YOU TO THE DEMO CHAT

    /* TODO each user will have an array of Chats, this fragment should iterate through them and
    * display them on the screen like facebook messenger does, showing a picture and the start
    * of the last message (can all be hardcoded in), would be good to implement a scroller function*/
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_fragment2, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.ListOfChats, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Intent intent = new Intent(getContext(), IndividualChat.class);
        startActivity(intent);
    }

}