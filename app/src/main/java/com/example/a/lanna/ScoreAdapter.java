package com.example.a.lanna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by phatthanapong on 2/11/2559.
 */
public class ScoreAdapter extends BaseAdapter{
    Context mContext;
    List<Score> scores;

    public ScoreAdapter(Context context, List<Score> scores) {
        this.mContext= context;
        this.scores = scores;
    }

    public int getCount() {
        return scores.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView nameText = (TextView)view.findViewById(R.id.textName);
        nameText.setText(scores.get(position).getName());

        TextView scoreText = (TextView)view.findViewById(R.id.textScore);
        scoreText.setText(scores.get(position).getScore());

        return view;
    }

}
