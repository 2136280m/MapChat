package com.example.alex.MapChat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
=======
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;
>>>>>>> b9a72d0c93e8d99a0e532de7cc51c53aba2bdadb

public class ChatFragment extends ListFragment implements AdapterView.OnItemClickListener {

    // FOR NOW ALL THIS DOES IS TAKE YOU TO THE DEMO CHAT

    /* TODO each user will have an array of Chats, this fragment should iterate through them and
    * display them on the screen like facebook messenger does, showing a picture and the start
    * of the last message (can all be hardcoded in), would be good to implement a scroller function*/
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_fragment2, container, false);
<<<<<<< HEAD

/*        mDemoButton = (Button) view.findViewById(R.id.demo_button);
        mDemoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    Intent intent = new Intent(getActivity(), IndividualChat.class);
                    getActivity().startActivity(intent);
            }
        });*/

        ListView listView = (ListView) view.findViewById(R.id.listView);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(imageAdapter.getItem(position).getImageUrlString()));
                //startActivity(intent);

                //TODO THIS IS NOT WORKING PROPERLY, FIND A WAY TO USE TO ACCESS THE CLASS FROM THE METHOD ABOVE

                Intent intent = new Intent(getActivity(), IndividualMessage.class);
                startActivity(intent);
            }
        });


=======
>>>>>>> b9a72d0c93e8d99a0e532de7cc51c53aba2bdadb
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