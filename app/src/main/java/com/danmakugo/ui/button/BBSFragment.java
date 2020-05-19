package com.danmakugo.ui.button;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.danmakugo.R;
import com.danmakugo.adapter.PostAdapter;
import com.danmakugo.base.BaseFragment;
import com.danmakugo.model.Post;
import com.danmakugo.ui.activities.PostActivity;
import com.danmakugo.ui.activities.SendPostActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BBSFragment extends BaseFragment {

    private List<Post> postList=new ArrayList<>();



    public BBSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bbs, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView topPost=(TextView)getActivity().findViewById(R.id.top_post);
        TextView selectdPost=(TextView)getActivity().findViewById(R.id.select_post);

        FloatingActionButton floatingActionButton=(FloatingActionButton)getActivity().findViewById(R.id.send_post);

        topPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"你点击了置顶",Toast.LENGTH_SHORT).show();

            }
        });

        selectdPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"你点击了精选",Toast.LENGTH_SHORT).show();

            }
        });


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"你点击了发帖",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getActivity(), SendPostActivity.class);
                startActivity(intent);
            }
        });

        //帖子UI处理
        initPosts();
        RecyclerView recyclerView=(RecyclerView)getActivity().findViewById(R.id.posts);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        PostAdapter adapter=new PostAdapter(getActivity().getApplicationContext(),postList);
        recyclerView.setAdapter(adapter);

    }

    private void initPosts(){
        Post post1=new Post();
        post1.setTitle("今日我要推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

//        Post post1=new Post();
        post1.setTitle("今日推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

        post1.setTitle("今日推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

        post1.setTitle("今日推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

        post1.setTitle("今日推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

        post1.setTitle("今日推荐我的最爱");
        post1.setAuthor("落雨");
        post1.setReplyNumber(200);
        post1.setLastReplyTime(getTime());
        postList.add(post1);

        postList.add(post1);
        postList.add(post1);
        postList.add(post1);
        postList.add(post1);
        postList.add(post1);
        postList.add(post1);

    }

    private String getTime(){
        Date date=new Date();

        String pattern="yy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);


        return simpleDateFormat.format(date);
    }
}
