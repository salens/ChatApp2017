package com.sencanski.stanislav.chatapplicationspring2017.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.sencanski.stanislav.chatapplicationspring2017.R;
import com.sencanski.stanislav.chatapplicationspring2017.dao.ConversationDao;
import com.sencanski.stanislav.chatapplicationspring2017.model.Conversation;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_create_conversation)
public class CreateConversationActivity extends AppCompatActivity {

    @ViewById
    EditText conversationName;

    @Bean
    ConversationDao conversationDao;

    /**
     * Called when button with id=createConversation is clicked.
     */
    @Click
    void createConversation() {
        final String name = conversationName.getText().toString();
        if (name.isEmpty()) {
            return;
        }

        final Conversation conversation = new Conversation(null, name);
        conversationDao.write(conversation);

        finish();   // close activity after conversation is created
    }

}
