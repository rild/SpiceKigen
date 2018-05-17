package com.lifeistech.android.schoolseventeen.junjun.spicekigen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by junekelectric on 2017/01/27.
 */

public class foodAdapter extends ArrayAdapter<Food> {
    List<Food> FoodList;
    private LayoutInflater inflater;


    public foodAdapter (Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        FoodList = new ArrayList<Food>();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount () {
        return FoodList.size();
    }

    @Override
    public Food getItem (int position) {
        return FoodList.get(position);
    }

    @Override
    public void add (Food position) {
        FoodList.add(position);
    }


    public void remove (Food position) {
        FoodList.remove(position);
    }

    private class ViewHolder {
        //継承前のitem.xmlの中身を書きます
        //get instance
        TextView titleTv;
        TextView daysTv;
        TextView diffTv;
        TextView contentTv;

    }

    @Override
    public View getView (final int position, View convertView, ViewGroup parent){
        final ViewHolder viewHolder;

        if (convertView == null) {
            inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, null);

            TextView titleitem = (TextView) convertView.findViewById(R.id.titleitem);
            TextView dateitem = (TextView) convertView.findViewById(R.id.dateitem);
            TextView diffitem = (TextView) convertView.findViewById(R.id.diff);
            TextView contentitem = (TextView) convertView.findViewById(R.id.contentitem);

            viewHolder = new ViewHolder();
            viewHolder.titleTv = titleitem;
            viewHolder.daysTv = dateitem;
            viewHolder.diffTv = diffitem;
            viewHolder.contentTv = contentitem;

            convertView.setTag(viewHolder);
            //ここでtagを設定しないと落ちる　by単語帳教科書
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

//        final Card item = getItem(position);
        final Food item = getItem(position);

        if (item != null){
            //set data

            viewHolder.titleTv.setText(item.getMtitle());
            viewHolder.daysTv.setText(item.getMdate());
            viewHolder.contentTv.setText(item.getMcontent());
        }
        return convertView;
    }
}