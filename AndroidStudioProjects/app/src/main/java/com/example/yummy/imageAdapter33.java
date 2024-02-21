package com.example.yummy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter33 extends BaseAdapter {

    private Context myContextSmoothie;
    public int[] imageArray={ R.drawable.smo1,
            R.drawable.smo2,
            R.drawable.smo3,
            R.drawable.smo4
    };

    public imageAdapter33(Context mycontext) {
        this.myContextSmoothie = mycontext;
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
        ImageView imageView=new ImageView(myContextSmoothie);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,500));

        return imageView;
    }
}
