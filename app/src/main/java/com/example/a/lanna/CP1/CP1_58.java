package com.example.a.lanna.CP1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.a.lanna.CPstar;
import com.example.a.lanna.CPstar2;
import com.example.a.lanna.CPstar3;
import com.example.a.lanna.PathWithPaint;
import com.example.a.lanna.R;
import com.example.a.lanna.Utils;

import java.util.ArrayList;
import java.util.List;


public class CP1_58 extends Fragment {

    Utils utils;
    private Paint mPaint;
    MediaPlayer mPlayer;
    DrawingView mView;
    private ImageView okButton;
    private ImageView btrestart;
    private ImageView bt_back;
    private ImageView bt_sound;

    Point p1 = new Point(190,258);
    Point p2 = new Point(175,333);
    Point p3 = new Point(339,215);
    Point p4 = new Point(320,73);


    private List<Point> mPoints = new ArrayList<Point>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        utils = new Utils();
        mPaint = utils.preparePaint();
        mPoints.add(p1);
        mPoints.add(p2);
        mPoints.add(p3);
        mPoints.add(p4);


        init();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cp1_58, container, false);

        //restart
        btrestart = (ImageView) v.findViewById(R.id.btrestart);
        btrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_58 re = new CP1_58();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, re);
                transaction.commit();
            }
        });

        //back
        bt_back = (ImageView) v.findViewById(R.id.btback);
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP111 bk = new CP111();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, bk);
                transaction.commit();
            }
        });


        bt_sound = (ImageView) v.findViewById(R.id.btsound);
        bt_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getActivity(), R.raw.s1_058);
                mPlayer.start();
            }
        });

        FrameLayout layout = (FrameLayout) v.findViewById(R.id.fl_write);
        mView = new CP1_58.DrawingView(getActivity(),mPoints);
        layout.addView(mView, new ViewGroup.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        init();
        mPlayer = MediaPlayer.create(getActivity(), R.raw.s1_058);
        mPlayer.start();

        okButton = (ImageView)v.findViewById(R.id.btok);
        okButton.setOnClickListener(new View.OnClickListener() {
            int[] sc = mView.getScore();
            @Override
            public void onClick(View view) {
                int count = 0;
                for(int i = 0; i < sc.length; i++) {
                    if (sc[i]!=0){
                        count++;
                    }
                }

                if(count <= 2){
                    //1
                    CPstar star1 = CPstar.newInstance("1","3");;
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, star1);
                    transaction.commit();

                }else if (count <= 3){

                    CPstar2 star2 = CPstar2.newInstance("1","3");;
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, star2);
                    transaction.commit();
                    //2
                }else {

                    CPstar3 star3 = CPstar3.newInstance("1","3");;
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, star3);
                    transaction.commit();
                }


            }
        });


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
        public int width;
        public int height;
        private Bitmap mBitmap;
        private Canvas mCanvas;
        private Path mPath;
        private Paint mBitmapPaint;
        Context context;
        private Paint circlePaint;
        private Path circlePath;
        private int mTouchTolerance;
        private List<Point> points;
        int[] score;

        public DrawingView(Context c, List<Point> p) {
            super(c);
            context = c;
            points = p;
            score = new int[points.size()];
            mPath = new Path();
            mTouchTolerance = dp2px(20);
            mBitmapPaint = new Paint(Paint.DITHER_FLAG);
            circlePaint = new Paint();
            circlePath = new Path();
            circlePaint.setAntiAlias(true);
            circlePaint.setColor(Color.BLUE);
            circlePaint.setStyle(Paint.Style.STROKE);
            circlePaint.setStrokeJoin(Paint.Join.MITER);
            circlePaint.setStrokeWidth(4f);
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas(mBitmap);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
            canvas.drawPath(mPath, mPaint);
            canvas.drawPath(circlePath, circlePaint);
        }

        private float mX, mY;
        private static final float TOUCH_TOLERANCE = 1;

        private void touch_start(float x, float y) {
            mPath.reset();
            mPath.moveTo(x, y);
            okButton.setVisibility(VISIBLE);
            bt_sound.setVisibility(INVISIBLE);
            mX = x;
            mY = y;
        }

        private void touch_move(float x, float y) {


            float dx = Math.abs(x - mX);
            float dy = Math.abs(y - mY);
            mPath.moveTo(x,y);
            if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
                mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
                mX = x;
                mY = y;
//                circlePath.reset();
//                circlePath.addCircle(mX, mY, 30, Path.Direction.CW);
            }

            for (int i = 0;i<points.size();i++){
                Point tp = points.get(i);
// -----------------------------------------------------------------------------------------
                if ((tp.x-10 <= x) && (tp.y-10 <= y) && (tp.x+10 >= x) && (tp.y+10 >= y)){
                    score[i]++;
                    Log.d("KKK", score[i]+"");
                }
            }

        }

        private void touch_up() {
            mPath.lineTo(mX, mY);
            circlePath.reset();
            // commit the path to our offscreen
            mCanvas.drawPath(mPath, mPaint);
            // kill this so we don't double draw
            mPath.reset();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    touch_start(x, y);
                    Log.d("Action Down", " "+ x + ", " + y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_MOVE:
                    touch_move(x, y);
                    Log.d("Action Move", " "+ x + ", " + y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_UP:
                    touch_up();
                    Log.d("Action Up", " "+ x + ", " + y);
                    invalidate();
                    break;
            }
            return true;
        }
        private int dp2px(int dp) {
            Resources r = getContext().getResources();
            float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
            return (int) px;
        }
        public int[] getScore(){
            return score;
        }
    }
}
