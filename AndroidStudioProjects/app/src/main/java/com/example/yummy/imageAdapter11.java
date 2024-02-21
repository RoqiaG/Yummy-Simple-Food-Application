package com.example.yummy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter11 extends BaseAdapter {

    private Context myContextLemonade;
    public int[] imageArray={ R.drawable.lem1,
            R.drawable.lem2,
            R.drawable.lem3,
            R.drawable.lem4
    };

    public imageAdapter11(Context mycontext) {
        this.myContextLemonade = mycontext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(myContextLemonade);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,500));

        return imageView;
    }
}
