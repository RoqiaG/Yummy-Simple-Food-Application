package com.example.yummy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter2 extends BaseAdapter {

    private Context myContextChaiLatte;
    public int[] imageArray={ R.drawable.latte1,
            R.drawable.latte2,
            R.drawable.latte3,
            R.drawable.latte4
    };

    public imageAdapter2(Context mycontext) {
        this.myContextChaiLatte = mycontext;
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
        ImageView imageView=new ImageView(myContextChaiLatte);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,500));

        return imageView;
    }
}
