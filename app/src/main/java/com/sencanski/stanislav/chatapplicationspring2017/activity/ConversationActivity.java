package com.sencanski.stanislav.chatapplicationspring2017.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sencanski.stanislav.chatapplicationspring2017.R;
import com.sencanski.stanislav.chatapplicationspring2017.adapter.MessageAdapter;
import com.sencanski.stanislav.chatapplicationspring2017.fragment.CreateMessageFragment;
import com.sencanski.stanislav.chatapplicationspring2017.model.Conversation;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.FragmentByTag;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_conversation)
public class ConversationActivity extends AppCompatActivity {

    @Extra
    Conversation conversation;

    @FragmentByTag
    CreateMessageFragment createMessageFragment;

    @ViewById
    RecyclerView recyclerView;

    @Bean
    MessageAdapter messageAdapter;

    @AfterViews
    void init() {
        createMessageFragment.initFor(conversation);

        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));

        recyclerView.setAdapter(messageAdapter);
        messageAdapter.initFor(conversation);

    }

}
