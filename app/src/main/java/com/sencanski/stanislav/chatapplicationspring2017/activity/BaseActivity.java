package com.sencanski.stanislav.chatapplicationspring2017.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sencanski.stanislav.chatapplicationspring2017.eventbus.OttoBus;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

/**
 * Created by Sasa on 5/20/2017.
 */

@EActivity
public class BaseActivity extends AppCompatActivity {

    @Bean
    OttoBus bus;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        bus.register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }


}
