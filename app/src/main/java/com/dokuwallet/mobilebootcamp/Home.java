package com.dokuwallet.mobilebootcamp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    private View view;
    private HomeAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<HomeModel> dataList = new ArrayList<>();
        HomeModel mItem1 = new HomeModel();

        mItem1.setdataTitle("Title 1");
        mItem1.setdataContent("Content 1");
        dataList.add(mItem1);

        HomeModel mItem2 = new HomeModel();
        mItem2.setdataTitle("Title 2");
        mItem2.setdataContent("Content 2");
        dataList.add(mItem2);

        RecyclerView recyclerviewHomeMain = view.findViewById(R.id.recyclerview_home_main);

        recyclerviewHomeMain.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new HomeAdapter(dataList);
        recyclerviewHomeMain.setAdapter(adapter);
    }
}
