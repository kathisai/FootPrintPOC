package io.com.footprint.home;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.com.footprint.R;
import io.com.footprint.base.BaseActivity;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.home_recycler_view)
    RecyclerView mCameraRecyclerView;
    HomeRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setRecyclerView();

    }

    private void setRecyclerView() {
        adapter = new HomeRVAdapter(this,getItemsList());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        mCameraRecyclerView.setLayoutManager(mLayoutManager);
        mCameraRecyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        mCameraRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mCameraRecyclerView.setAdapter(adapter);
    }

    private List<String> getItemsList() {
        return Arrays.asList(getResources().getStringArray(R.array.Home_Items));
    }


    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
