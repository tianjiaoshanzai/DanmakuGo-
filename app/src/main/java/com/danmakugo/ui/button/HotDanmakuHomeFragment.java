package com.danmakugo.ui.button;


import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.danmakugo.R;
import com.danmakugo.adapter.MediaAdapter;
import com.danmakugo.adapter.PostAdapter;
import com.danmakugo.base.BaseFragment;
import com.danmakugo.model.StreamMedia;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotDanmakuHomeFragment extends BaseFragment {

    private List<StreamMedia> streamMediaList =new ArrayList<>();


    public HotDanmakuHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_hot_media, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AppCompatActivity appCompatActivity=(AppCompatActivity)getActivity();

        //影视作品UI处理
        initStreamMedias();
        RecyclerView recyclerView=(RecyclerView)getActivity().findViewById(R.id.hot_medias);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        MediaAdapter adapter=new MediaAdapter(getActivity().getApplicationContext(),streamMediaList);
        recyclerView.setAdapter(adapter);

    }

    private void initStreamMedias(){
        StreamMedia streamMedia1=new StreamMedia();
        streamMedia1.setMediaName("张宇高数1");
        streamMedia1.setMediaHotPoint(32457);
        streamMediaList.add(streamMedia1);

        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);
        streamMediaList.add(streamMedia1);


    }
}
