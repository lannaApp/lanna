package com.example.a.lanna;


import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

public class listview_row  extends BaseAdapter {

    Context mContext;
    String[] strName;
    String[] score;

    public listview_row(Context context, String[] strName, String[] score) {

        this.mContext = context;
        this.strName = strName;
        this.score = score;
    }

    public int getCount() {
        return strName.length;
    }

    public Object getItem(int arg0) {
        return null;
    }

    public long getItemId(int arg0) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        View row = mInflater.inflate(R.layout.fragment_listview_row, parent, false);

        TextView textView = (TextView)row.findViewById(R.id.textView1);
        textView.setText(strName[position]);

        TextView textView2 = (TextView)row.findViewById(R.id.textView2);
        textView2.setText(score[position]);
        return row;

    }
}
