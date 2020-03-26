package com.example.zahran.spinnerslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ConcurrentModificationException;

/**
 * Created by zahran on 3/26/2020.
 */

public class ImageAdapter extends PagerAdapter {
    private Context mcontext;
    private int[] mImageIDs =new int[]{R.drawable.d1,R.drawable.d2,R.drawable.image4s,R.drawable.images2,R.drawable.jhnload};

    ImageAdapter (Context context)
    {
        mcontext =context;
    }
    @Override
    public int getCount() {
        return mImageIDs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView imageView =new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIDs[position]);
        container.addView(imageView,0);
        return  imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }
}
