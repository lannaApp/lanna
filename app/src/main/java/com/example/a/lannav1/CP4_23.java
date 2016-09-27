package com.example.a.lannav1;


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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.support.v4.app.Fragment;

public class CP4_23 extends Fragment {

    View mView;
    private Paint mPaint;
    MediaPlayer mPlayer;
    private Button newButton;
    private Utils utils;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cp4_23, container, false);

        //restart
        newButton = (Button) v.findViewById(R.id.btrestart);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_23 re = new CP4_23();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, re);
                transaction.commit();
            }
        });

        //back
        newButton = (Button) v.findViewById(R.id.btback);
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
        newButton = (Button) v.findViewById(R.id.btsound);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getActivity(), R.raw.s4_003);
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
        mPlayer = MediaPlayer.create(getActivity(), R.raw.s4_003);
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
