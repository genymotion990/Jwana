package com.example.hp1.project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class CustomAdapter extends ArrayAdapter<Photo> {

    private int resource;

    public CustomAdapter(Context context, int resource, List<Photo> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(resource, parent, false );

        Photo photo = getItem(position);
        TextView title = (TextView) cuView.findViewById(R.id.tvDescribtion);
        ImageView image = (ImageView) cuView.findViewById(R.id.imageView);

        if(photo.getId()==-1) {
            Bitmap bitmap = BitmapFactory.decodeFile(photo.getFilePath());
            image.setImageBitmap(bitmap);
        }else{
            image.setImageResource(photo.getId());
        }
        title.setText(photo.getDescribtion());

        return cuView;
    }
}
