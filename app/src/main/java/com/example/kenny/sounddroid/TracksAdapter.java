package com.example.kenny.sounddroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kenny.sounddroid.com.example.kenny.sounddroid.soundcloud.Track;

import java.util.List;

/**
 * Created by Kenny on 15-05-19.
 */
public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView titleTextView;

        ViewHolder(View v){
            super(v);
            titleTextView = (TextView) v.findViewById(R.id.track_title);
        }
    }

    private List<Track> mTracks;

    TracksAdapter (List<Track> tracks){
        mTracks = tracks;
    }

    @Override
    public int getItemCount() {
        return mTracks.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Track track = mTracks.get(i);
        viewHolder.titleTextView.setText(track.getTitle());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.track_row, viewGroup, false);
        return new ViewHolder(v);
    }
}
