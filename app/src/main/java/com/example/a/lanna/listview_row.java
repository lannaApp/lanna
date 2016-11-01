package com.example.a.lanna;


import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listview_row  extends BaseAdapter {

    Context mContext;
    List<Score> strName;
    List<Score> score;

    public listview_row(Context context, List<Score> strName, List<Score> score) {

        this.mContext = context;
        this.strName = strName;
        this.score = score;
    }

    public int getCount() {
        return strName.size();
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
        textView.setText(strName.get(position).toString());

        TextView textView2 = (TextView)row.findViewById(R.id.textView2);
        textView2.setText(score.get(position).toString());

        return row;

    }
}
