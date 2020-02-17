package com.example.yourownevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mLayout = (LinearLayout) findViewById(R.id.mLayout);
        mLayout.setBackgroundColor(Color.WHITE);

        Gallery mainGallery = (Gallery) findViewById(R.id.MainGallery);
        MyGalleryAdapter mGalleryAdapter = new MyGalleryAdapter(this);
        mainGallery.setAdapter(mGalleryAdapter);


    }
    public class MyGalleryAdapter extends BaseAdapter {
        Context context;
        Integer[] mGalleryImg = {R.drawable.game1, R.drawable.game2, R.drawable.game3};
        public MyGalleryAdapter(Context c) {
            context = c;
        }
        @Override
        public int getCount() {
            return mGalleryImg.length;
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
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new Gallery.LayoutParams(500,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(mGalleryImg[position]);
            return imageView;
        }
    }
}
