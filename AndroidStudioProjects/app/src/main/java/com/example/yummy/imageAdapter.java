package com.example.yummy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {

    private Context myContextHotCocoa;
    public int[] imageArray={ R.drawable.creamy1,
            R.drawable.creamy2,
            R.drawable.creamy3,
            R.drawable.creamy4
    };

    public imageAdapter(Context mycontext) {
        this.myContextHotCocoa = mycontext;
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
        ImageView imageView=new ImageView(myContextHotCocoa);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,500));

        return imageView;
    }
}
