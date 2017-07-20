package com.mobiversal.practica.biaflatalking;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ChatsFragment extends Fragment {

    private FirebaseListAdapter adapter;
    private DatabaseReference dbRef;
    FloatingActionButton fab;
    public View mMyView;
    public ListView listOfMessage;


    public ChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mMyView = inflater.inflate(R.layout.fragment_chats, container, false);

        // Inflate the layout for this fragment
        fab = (FloatingActionButton) mMyView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = (EditText) mMyView.findViewById(R.id.input);
                FirebaseDatabase.getInstance().getReference().child("group").push().setValue(new ChatMessage(input.getText().toString(),
                        FirebaseAuth.getInstance().getCurrentUser().getEmail()));
                input.setText("");
                listOfMessage.smoothScrollToPosition(adapter.getCount()-1);

            }
        });
        displayChatMessage();
        return mMyView;

    }

    private void displayChatMessage() {
        listOfMessage = (ListView) mMyView.findViewById(R.id.list_of_message);
        adapter = new FirebaseListAdapter<ChatMessage>((Activity) getContext(), ChatMessage.class, R.layout.list_item, FirebaseDatabase.getInstance().getReference().child("group")) {
            @Override
            protected void populateView(View v, ChatMessage model, int position) {
                TextView messageText, messageUser, messageTime;
                messageText = (TextView) v.findViewById(R.id.message_text);
                messageUser = (TextView) v.findViewById(R.id.message_user);
                messageTime = (TextView) v.findViewById(R.id.message_time);

                messageText.setText(model.getMessageText());
                messageUser.setText(model.getMessageUser());
                messageTime.setText(DateFormat.format("dd-MM-yyyy (HH:mm:ss)", model.getMessageTime()));
            }
        };
        listOfMessage.setAdapter(adapter);
    }
}
