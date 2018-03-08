package com.example.alex.MapChat;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by alex on 08/03/18.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // references to our images
    private ImageWithUrl[] mImageIds = {
            new ImageWithUrl(R.drawable.united_kingdom_square_icon_640, "LoginActivity")

    };

//    private Integer[] mImageIds = {
//            R.drawable.united_kingdom_square_icon_640, R.drawable.france_square_icon_640,
//            R.drawable.germany_square_icon_640, R.drawable.afghanistan_square_icon_640,
//            R.drawable.american_samoa_square_icon_640, R.drawable.andorra_square_icon_640,
//            R.drawable.angola_square_icon_640, R.drawable.argentina_square_icon_640,
//            R.drawable.barbados_square_icon_640, R.drawable.bosnia_and_herzegovina_square_icon_640,
//            R.drawable.cambodia_square_icon_640, R.drawable.cayman_islands_square_icon_640,
//            R.drawable.central_african_republic_square_icon_640, R.drawable.chad_square_icon_640,
//            R.drawable.china_square_icon_640, R.drawable.gambia_square_icon_640,
//            R.drawable.hong_kong_square_icon_640, R.drawable.hungary_square_icon_640,
//            R.drawable.ireland_square_icon_640, R.drawable.japan_square_icon_640,
//            R.drawable.kenya_square_icon_640, R.drawable.montenegro_square_icon_640
//    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public ImageWithUrl getItem(int position) {
        return mImageIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10, 10, 10, 10);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mImageIds[position].getImageId());
        return imageView;
    }


    protected class ImageWithUrl extends Object {
        private int imageId;
        private String imageUrlString;

        ImageWithUrl(int id, String url) {
            imageId = id;
            imageUrlString = url;
        }
        public int getImageId() {
            return imageId;
        }
        public String getImageUrlString() {
            return imageUrlString;
        }
    }

}