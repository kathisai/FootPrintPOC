package io.com.footprint.view_footprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.com.footprint.R;
import io.com.footprint.base.BaseActivity;

public class ViewFootPrintActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_foot_print);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fab_home)
    void navigateBack(){
        finish();
    }
}
