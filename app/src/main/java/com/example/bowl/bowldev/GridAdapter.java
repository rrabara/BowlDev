package com.example.bowl.bowldev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class GridAdapter extends BaseAdapter {

    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater = null;

    public GridAdapter(Context mainActivity, String [] osNameList,
                       int [] osImages) {
        result = osNameList;
        context = mainActivity;
        imageId = osImages;
        inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class GridItem
    {
        TextView item_text;
        ImageView item_image;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        GridItem gridItem = new GridItem();
        View rowView = null;

        rowView = inflater.inflate(R.layout.grid_layout, null);
        gridItem.item_text = (TextView) rowView.findViewById(R.id.grid_item_texts);
        gridItem.item_image = (ImageView) rowView.findViewById(R.id.grid_item_images);

        gridItem.item_text.setText(result[position]);
        gridItem.item_image.setImageResource(imageId[position]);

        return rowView;
    }
}
