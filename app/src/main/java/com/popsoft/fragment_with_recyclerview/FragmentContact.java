package com.popsoft.fragment_with_recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by popso on 4/13/2018.
 */

public class FragmentContact extends Fragment {
    View v;
    private RecyclerView mRecyclerView;
    private List<Contact> listContact;


    public FragmentContact() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_fragment,container,false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.contact_recyclerview_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listContact);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContact = new ArrayList<>();
        listContact.add(new Contact("Ahmed Elsayed","01275868851",R.mipmap.ic_launcher_round));
        listContact.add(new Contact("Salma Ahmed",  "01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Mohamed Elsayed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Olivia Elsayed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Omar Ahmed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Shady ","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Ahmed Gaber","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Omara ","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Ahmed Ahmed",  "01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Sara Ahmed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("hamda Elsayed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Omar Mohamed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Dr.Ahmed ","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
        listContact.add(new Contact("Eng. Ahmed","01xxxxxxxxx",R.drawable.ic_sentiment_very_satisfied));
    }
}
