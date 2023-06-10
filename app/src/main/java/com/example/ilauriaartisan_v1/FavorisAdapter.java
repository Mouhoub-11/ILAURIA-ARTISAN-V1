package com.example.ilauriaartisan_v1;


import android.content.Context;
import android.view.LayoutInflater;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FavorisAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> FavoriList;

    LayoutInflater layoutInflater;

    public FavorisAdapter(Context context, ArrayList<String> FavoriList){






        this.context = context;
        this.FavoriList = FavoriList;
        this.layoutInflater=LayoutInflater.from(context);


    }


    @Override
    public int getCount() {
        return FavoriList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.favoris_item_layout, null);
        TextView textview=(TextView) convertView.findViewById(R.id.item_artisant_title);
        textview.setText(FavoriList.get(position));

        return convertView;
    }



}


