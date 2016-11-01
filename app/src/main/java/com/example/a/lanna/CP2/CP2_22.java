package com.example.a.lanna.CP2;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.a.lanna.PathWithPaint;
import com.example.a.lanna.R;
import com.example.a.lanna.Utils;

import java.util.ArrayList;

public class CP2_22 extends Fragment {

    View mView;
    Utils utils;
    private Paint mPaint;
    MediaPlayer mPlayer;
    private ImageView newButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        utils = new Utils();
        mPaint = utils.preparePaint();
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cp2_22, container, false);

        //restart
        newButton = (ImageView) v.findViewById(R.id.btrestart);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_22 cp222 = new CP2_22();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp222);
                transaction.commit();
            }
        });

        //back
        newButton = (ImageView) v.findViewById(R.id.btback);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2 fm_cp2 = new CP2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fm_cp2);
                transaction.commit();
            }
        });


        newButton = (ImageView) v.findViewById(R.id.btsound);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getActivity(), R.raw.s2_022);
                mPlayer.start();
            }
        });

        FrameLayout layout = (FrameLayout) v.findViewById(R.id.fl_write);
        mView = new DrawingView(getActivity());
        layout.addView(mView, new LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        init();
        mPlayer = MediaPlayer.create(getActivity(), R.raw.s2_022);
        mPlayer.start();


        return v;
    }
    //0xFF # FF FF FF สี
    private void init() {
        utils.preparePaint();

    }

    @Override
    public void onPause() {
        mPlayer.stop();
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        mPlayer.stop();
        super.onDestroyView();
    }

    class DrawingView extends View {
        private Path path;
        private Bitmap mBitmap;
        private Canvas mCanvas;

        public DrawingView(Context context) {
            super(context);
            path = new Path();
            mBitmap = Bitmap.createBitmap(300, 300, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas(mBitmap);
            this.setBackgroundColor(Color.TRANSPARENT);
        }

        private ArrayList<PathWithPaint> _graphics1 = new ArrayList<PathWithPaint>();

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.d("Action Down", " "+ x + ", " + y);
                case MotionEvent.ACTION_MOVE:
                    Log.d("Action Move", " "+ x + ", " + y);
                case MotionEvent.ACTION_UP:
                    Log.d("Action Up", " "+ x + ", " + y);
            }

            PathWithPaint pp = new PathWithPaint();
            mCanvas.drawPath(path, mPaint);
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                path.moveTo(event.getX(), event.getY());
                path.lineTo(event.getX(), event.getY());
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                path.lineTo(event.getX(), event.getY());
                pp.setPath(path);
                pp.setmPaint(mPaint);
                _graphics1.add(pp);
            }
            invalidate();
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (_graphics1.size() > 0) {
                canvas.drawPath(
                        _graphics1.get(_graphics1.size() - 1).getPath(),
                        _graphics1.get(_graphics1.size() - 1).getmPaint());
            }
        }
    }


}
