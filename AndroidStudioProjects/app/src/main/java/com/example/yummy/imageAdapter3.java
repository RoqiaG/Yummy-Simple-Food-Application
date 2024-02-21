package com.example.yummy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter3 extends BaseAdapter {

    private Context myContextChocoLatte;
    public int[] imageArray={ R.drawable.choco1,
            R.drawable.choco2,
            R.drawable.choco3,
            R.drawable.choco4
    };

    public imageAdapter3(Context mycontext) {
        this.myContextChocoLatte = mycontext;
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
        ImageView imageView=new ImageView(myContextChocoLatte);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,500));

        return imageView;
    }
}
