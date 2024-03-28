package com.example.fragmentstudy;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.fragmentstudy.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {
    private Fragment2Binding binding;

    final String LOG_TAG = "myLogs";

    @Override
    //when fragment is attached to Activity
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(LOG_TAG, "Fragment2 onAttach");
    }

    @Override
    //when fragment is created (without UI access)
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Fragment2 onCreate");
    }

    @Nullable
    @Override
    //creating view (content) fragment and transferring it to the system
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Fragment2 onCreateView");
        binding = Fragment2Binding.inflate(inflater,container,false);
        return binding.getRoot();
        //return inflater.inflate(R.layout.fragment2, container, false);
    }

    //After that onCreate method activates (for Activity)
    //Tells fragment, that view fragment is created (now we can work with it)

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG_TAG, "Fragment2 onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(LOG_TAG, "Fragment2 onViewStateRestored");
    }

    //then method Activity - onStart, after that fragment method onStart - Activity's method analog
    //fragment is visible for interaction

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Fragment2 onStart");
    }

    //then Activity method - onResume, after that fragment method onResume - Activity's method analog
    //fragment is available for interaction
    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Fragment2 onResume");
    }

    //onPause and onStop methods for fragments and Activities - fragments and Activity are no longer available
    //For interaction, and then not visible to the user
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Fragment2 onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Fragment2 onStop");
    }

    //View, which was created in onCreateView, is no longer available
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG, "Fragment2 onDestroyView");
    }

    //onDestroy method analog taken from Activity
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Fragment2 onDestroy");
    }

    //fragment is detached from Activity
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "Fragment2 onDetach");
    }
}