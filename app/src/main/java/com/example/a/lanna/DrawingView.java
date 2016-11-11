//public class PaintView extends View {
//
//    private Bitmap mBitmap;
//    private Canvas mCanvas;
//    private Path mPath;
//    private Paint mPaint;
//    private static final int TOUCH_TOLERANCE_DP = 20;
//    private static final int BACKGROUND = 0xFFDDDDDD;
//    private List<Point> mPoints = new ArrayList<Point>();
//    private int mLastPointIndex = 0;
//    private int mTouchTolerance;
//    private boolean isPathStarted = false;
//
//    public PaintView(Context context) {
//        super(context);
//        mCanvas = new Canvas();
//        mPath = new Path();
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setDither(true);
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeWidth(12);
//        mTouchTolerance = dp2px(TOUCH_TOLERANCE_DP);
//
//        // TODO just test points
//        Point p1 = new Point(133, 123);
//        Point p2 = new Point(149, 136);
//        Point p3 = new Point(182, 136);
//        Point p4 = new Point(206, 118);
//        Point p5 = new Point(208, 87);
//        Point p6 = new Point(187, 71);
//        Point p7 = new Point(144, 78);
//        Point p8 = new Point(124, 101);
//        Point p9 = new Point(113, 128);
//        Point p10 = new Point(112, 157);
//        Point p11 = new Point(119, 188);
//        Point p12 = new Point(134, 209);
//        Point p13 = new Point(162, 228);
//        Point p14 = new Point(194, 238);
//        Point p15 = new Point(232, 240);
//        Point p16 = new Point(263, 237);
//        Point p17 = new Point(289, 224);
//        Point p18 = new Point(315, 204);
//        Point p19 = new Point(332, 174);
//        Point p20 = new Point(339, 128);
//        Point p21 = new Point(329, 95);
//        Point p22 = new Point(304, 73);
//        Point p23 = new Point(280, 69);
//        Point p24 = new Point(254, 87);
//        Point p25 = new Point(248, 116);
//        Point p26 = new Point(259, 143);
//        Point p27 = new Point(278, 153);
//        Point p28 = new Point(241, 157);
//        Point p29 = new Point(192, 160);
//        Point p30 = new Point(150, 159);
//        mPoints.add(p1);
//        mPoints.add(p2);
//        mPoints.add(p3);
//        mPoints.add(p4);
//        mPoints.add(p5);
//        mPoints.add(p6);
//        mPoints.add(p7);
//        mPoints.add(p8);
//        mPoints.add(p9);
//        mPoints.add(p10);
//        mPoints.add(p11);
//        mPoints.add(p12);
//        mPoints.add(p13);
//        mPoints.add(p14);
//        mPoints.add(p15);
//        mPoints.add(p16);
//        mPoints.add(p17);
//        mPoints.add(p18);
//        mPoints.add(p19);
//        mPoints.add(p20);
//        mPoints.add(p21);
//        mPoints.add(p22);
//        mPoints.add(p23);
//        mPoints.add(p24);
//        mPoints.add(p25);
//        mPoints.add(p26);
//        mPoints.add(p27);
//        mPoints.add(p28);
//        mPoints.add(p29);
//        mPoints.add(p30);
//    }
//
//    public PaintView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        mCanvas = new Canvas();
//        mPath = new Path();
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setDither(true);
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeWidth(12);
//        mTouchTolerance = dp2px(TOUCH_TOLERANCE_DP);
//
//        // TODO just test points
//        Point p1 = new Point(133, 123);
//        Point p2 = new Point(149, 136);
//        Point p3 = new Point(182, 136);
//        Point p4 = new Point(206, 118);
//        Point p5 = new Point(208, 87);
//        Point p6 = new Point(187, 71);
//        Point p7 = new Point(144, 78);
//        Point p8 = new Point(124, 101);
//        Point p9 = new Point(113, 128);
//        Point p10 = new Point(112, 157);
//        Point p11 = new Point(119, 188);
//        Point p12 = new Point(134, 209);
//        Point p13 = new Point(162, 228);
//        Point p14 = new Point(194, 238);
//        Point p15 = new Point(232, 240);
//        Point p16 = new Point(263, 237);
//        Point p17 = new Point(289, 224);
//        Point p18 = new Point(315, 204);
//        Point p19 = new Point(332, 174);
//        Point p20 = new Point(339, 128);
//        Point p21 = new Point(329, 95);
//        Point p22 = new Point(304, 73);
//        Point p23 = new Point(280, 69);
//        Point p24 = new Point(254, 87);
//        Point p25 = new Point(248, 116);
//        Point p26 = new Point(259, 143);
//        Point p27 = new Point(278, 153);
//        Point p28 = new Point(241, 157);
//        Point p29 = new Point(192, 160);
//        Point p30 = new Point(150, 159);
//        mPoints.add(p1);
//        mPoints.add(p2);
//        mPoints.add(p3);
//        mPoints.add(p4);
//        mPoints.add(p5);
//        mPoints.add(p6);
//        mPoints.add(p7);
//        mPoints.add(p8);
//        mPoints.add(p9);
//        mPoints.add(p10);
//        mPoints.add(p11);
//        mPoints.add(p12);
//        mPoints.add(p13);
//        mPoints.add(p14);
//        mPoints.add(p15);
//        mPoints.add(p16);
//        mPoints.add(p17);
//        mPoints.add(p18);
//        mPoints.add(p19);
//        mPoints.add(p20);
//        mPoints.add(p21);
//        mPoints.add(p22);
//        mPoints.add(p23);
//        mPoints.add(p24);
//        mPoints.add(p25);
//        mPoints.add(p26);
//        mPoints.add(p27);
//        mPoints.add(p28);
//        mPoints.add(p29);
//        mPoints.add(p30);
//    }
//
//    public PaintView(Context context, AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//        mCanvas = new Canvas();
//        mPath = new Path();
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setDither(true);
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeWidth(12);
//        mTouchTolerance = dp2px(TOUCH_TOLERANCE_DP);
//    }
//
//    @Override
//    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
//        super.onSizeChanged(width, height, oldWidth, oldHeight);
//        clear();
//
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        canvas.drawColor(BACKGROUND);
//        canvas.drawBitmap(mBitmap, 0, 0, null);
//        canvas.drawPath(mPath, mPaint);
//
//        // TODO remove if you dont want points to be drawn
//        for (Point point : mPoints) {
//            canvas.drawPoint(point.x, point.y, mPaint);
//        }
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        float x = event.getX();
//        float y = event.getY();
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                touch_start(x, y);
//                invalidate();
//                break;
//            case MotionEvent.ACTION_MOVE:
//                touch_move(x, y);
//                invalidate();
//                break;
//            case MotionEvent.ACTION_UP:
//                touch_up(x, y);
//                invalidate();
//                break;
//        }
//        return true;
//    }
//
//    private void touch_start(float x, float y) {
//
//        if (checkPoint(x, y, mLastPointIndex)) {
//            mPath.reset();
//            // user starts from given point so path can beis started
//            isPathStarted = true;
//        } else {
//            // user starts move from point which doen's belongs to mPinst list
//            isPathStarted = false;
//        }
//
//    }
//
//    //ADDED WITH LAST EDIT
//    private void touch_move(float x, float y) {
//        // draw line with finger move
//        if (isPathStarted) {
//            mPath.reset();
//            Point p = mPoints.get(mLastPointIndex);
//            mPath.moveTo(p.x, p.y);
//            if (checkPoint(x, y, mLastPointIndex + 1)) {
//                p = mPoints.get(mLastPointIndex + 1);
//                mPath.lineTo(p.x, p.y);
//                mCanvas.drawPath(mPath, mPaint);
//                mPath.reset();
//                ++mLastPointIndex;
//            } else {
//                mPath.lineTo(x, y);
//            }
//        }
//    }
//
//    /**
//     * Draws line.
//     */
//    private void touch_up(float x, float y) {
//        mPath.reset();
//        if (checkPoint(x, y, mLastPointIndex + 1) && isPathStarted) {
//            // move finished at valid point so draw whole line
//
//            // start point
//            Point p = mPoints.get(mLastPointIndex);
//            mPath.moveTo(p.x, p.y);
//            // end point
//            p = mPoints.get(mLastPointIndex + 1);
//            mPath.lineTo(p.x, p.y);
//            mCanvas.drawPath(mPath, mPaint);
//            mPath.reset();
//            // increment point index
//            ++mLastPointIndex;
//            isPathStarted = false;
//        }
//
//    }
//
//    /**
//     * Sets paint
//     *
//     * @param paint
//     */
//    public void setPaint(Paint paint) {
//        this.mPaint = paint;
//    }
//
//    /**
//     * Returns image as bitmap
//     *
//     * @return
//     */
//    public Bitmap getBitmap() {
//        return mBitmap;
//    }
//
//    /**
//     * Clears canvas
//     */
//    public void clear() {
//        mBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
//        mBitmap.eraseColor(BACKGROUND);
//        mCanvas.setBitmap(mBitmap);
//        invalidate();
//    }
//
//    /**
//     * Checks if user touch point with some tolerance
//     */
//    private boolean checkPoint(float x, float y, int pointIndex) {
//        if (pointIndex == mPoints.size()) {
//            // out of bounds
//            return false;
//        }
//        Point point = mPoints.get(pointIndex);
//        if (x > (point.x - mTouchTolerance) && x < (point.y + mTouchTolerance)) {
//            if (y > (point.y - mTouchTolerance) && y < (point.y + mTouchTolerance)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public List<Point> getPoints() {
//        return mPoints;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.mPoints = points;
//    }
//
//    private int dp2px(int dp) {
//        Resources r = getContext().getResources();
//        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
//        return (int) px;
//    }
//}