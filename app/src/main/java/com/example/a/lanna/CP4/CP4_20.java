package com.example.a.lanna.CP4;


import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
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
import android.support.v4.app.Fragment;

import com.example.a.lanna.PathWithPaint;
import com.example.a.lanna.R;
import com.example.a.lanna.Utils;

public class CP4_20 extends Fragment {

    View mView;
    private Paint mPaint;
    MediaPlayer mPlayer;
    private ImageView newButton;
    private Utils utils;

    Point p1 = new Point(95,196);
    Point p2 = new Point(252,76);
    Point p3 = new Point(300,245);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        utils = new Utils();
        mPaint = utils.preparePaint();
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cp4_20, container, false);

        //restart
        newButton = (ImageView) v.findViewById(R.id.btrestart);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_20 re = new CP4_20();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, re);
                transaction.commit();
            }
        });

        //back
        newButton = (ImageView) v.findViewById(R.id.btback);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4 fm_cp4 = new CP4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fm_cp4);
                transaction.commit();
            }
        });

        // sound
        newButton = (ImageView) v.findViewById(R.id.btsound);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getActivity(), R.raw.s4_010);
                mPlayer.start();
            }
        });

        FrameLayout layout = (FrameLayout) v.findViewById(R.id.fl_write);

        //เสียงตอนเริ่ม
        mView = new DrawingView(getActivity());
        layout.addView(mView, new LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        init();
        mPlayer = MediaPlayer.create(getActivity(), R.raw.s4_010);
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
