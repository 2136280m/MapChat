package com.example.alex.MapChat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by alex on 09/03/18.
 */

public class MessageAdapter extends BaseAdapter {
    private Context mContext;

    public MessageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public TextView getView(int position, View convertView, ViewGroup parent) {

        TextView view;

        if (AllMessages.allMessagesArray.get(position).getMessageId() == 0) {
            //put message on the right
            view = new TextView(mContext);
            view.setText(AllMessages.allMessagesArray.get(position).getMessageContent());
        } else {
            //put message on the left
            view = new TextView(mContext);
            view.setText(AllMessages.allMessagesArray.get(position).getMessageContent());
        }


        return view;
    }

}
