package com.mobiversal.practica.biaflatalking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FriendsFragment extends Fragment {


    public FriendsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

}











//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//
//
//public class FriendsFragment extends Fragment {
//
//
//   // private RecyclerView mFriendsList;
//    private DatabaseReference mFriendsDatabase;
//    private FirebaseAuth mAuth;
//    private String mCurrent_user_id;
//    private View mMainView;
//
//
//
//
//
//
//    public FriendsFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        mMainView=inflater.inflate(R.layout.fragment_friends,container,false);
//        mFriendsList=(RecyclerView) mMainView.findViewById(R.id.friends_list);
//        mAuth=FirebaseAuth.getInstance();
//        mCurrent_user_id=mAuth.getCurrentUser().getUid();
//        mFriendsDatabase= FirebaseDatabase.getInstance().getReference().child("Friends").child(mCurrent_user_id);
//
//       mFriendsList.setHasFixedSize(true);
//       mFriendsList.setLayoutManager(new LinearLayoutManager(getContext()));
//
//
//         Inflate the layout for this fragment
//        return mMainView;
//    }
//
//    public static class FriendsViewHolder extends RecyclerView.ViewHolder {
//       TextView mView;
//        TextView nameView;
//       CircleImageView circleImageView;
//    }
////
////
////
////
////
////    @Override
////    public void onStart() {
////        super.onStart();
////
////
////        final FirebaseRecyclerAdapter<Friends,FriendsViewHolder> friendsRecyclerAdapter =new FirebaseRecyclerAdapter<Friends, FriendsViewHolder> (
////
////                Friends.class,
////                R.layout.users_single_layout,
////                FriendsViewHolder.class,
////                mFriendsDatabase
////
////        ){
////
////
////
////            public FriendsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////                FriendsViewHolder viewHolder = super.onCreateViewHolder(parent, viewType);
////
////
////
////
////
////
////
////
////
////
////                    protected void populateViewHolder(FriendsViewHolder friendsViewHolder,Friends friends,int i){
////                        friendsViewHolder.setDate(friends.getDate());
////                    }
////                };
////
////                mFriendsList.setAdapter(friendsRecyclerViewAdapter);
////        }
////        public static class
////
////
////    }
////}
