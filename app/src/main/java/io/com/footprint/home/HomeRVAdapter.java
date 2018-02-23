package io.com.footprint.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.com.footprint.R;

/**
 * Created by saipratap on 2/23/18.
 */

public class HomeRVAdapter  extends RecyclerView.Adapter<HomeRVAdapter.HomeViewHolder> {
    private Context mContext;
    private List<String> list;

    public HomeRVAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_rv_item, parent, false);
        return new HomeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        String item = list.get(position);
        holder.mName.setText(item);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.home_rv_item_name)
        TextView mName;
        public HomeViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);

        }
    }
}
