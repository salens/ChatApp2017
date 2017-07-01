package com.sencanski.stanislav.chatapplicationspring2017.eventbus;

/**
 * Created by Sasa on 5/13/2017.
 */

import com.squareup.otto.Bus;

import org.androidannotations.annotations.EBean;

@EBean(scope = EBean.Scope.Singleton)
public class OttoBus extends Bus {

}

