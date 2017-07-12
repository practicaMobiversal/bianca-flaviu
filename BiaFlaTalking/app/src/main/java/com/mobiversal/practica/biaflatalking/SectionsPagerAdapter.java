package com.mobiversal.practica.biaflatalking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            case 1:
                ConversationsFragment conversationsFragment = new ConversationsFragment();
                return conversationsFragment;

            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {

        return 3;
    }
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return"REQUESTS";
            case 1:
                return"CONVERSATIONS";
            case 2:
                return"CONTACTS";
            default:
                return null;
        }
    }

}
