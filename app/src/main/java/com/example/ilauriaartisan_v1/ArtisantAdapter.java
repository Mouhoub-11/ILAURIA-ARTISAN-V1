package com.example.ilauriaartisan_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.text.BreakIterator;




public class ArtisantAdapter extends BaseAdapter {
    Context context;
    String listartisant [];
    int Listimage[] ;

    LayoutInflater layoutInflater;
    public ArtisantAdapter(Context context,String[] listartisant,int[] Listimage){
        this.context=context;
        this.listartisant=listartisant;
        this.Listimage=Listimage;
        this.layoutInflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return listartisant.length;
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
        convertView = layoutInflater.inflate(R.layout.activity_custom_list_view, null);
        ImageView imaViewgeart=(ImageView) convertView.findViewById(R.id.imageIcom);
        BreakIterator TextView;

        imaViewgeart.setImageResource(Listimage[ position]);
        return convertView;
    }
}