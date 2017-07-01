package com.sencanski.stanislav.chatapplicationspring2017;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.androidannotations.annotations.EApplication;

/**
 * Created by Sasa on 5/20/2017.
 */

@EApplication
public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
