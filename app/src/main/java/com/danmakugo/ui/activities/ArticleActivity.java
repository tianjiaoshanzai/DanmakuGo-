package com.danmakugo.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.danmakugo.R;
import com.danmakugo.base.BaseAppCompatActivity;
import com.danmakugo.model.Article;

import de.hdodenhof.circleimageview.CircleImageView;

public class ArticleActivity extends BaseAppCompatActivity {

    public static final String ARTICLE_ID_STRING = "article_id";

    public static void actionStart(Context context,int articleId){
        Intent intent=new Intent(context,ArticleActivity.class);
        intent.putExtra(ARTICLE_ID_STRING,articleId);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);



        TextView articleContent=(TextView)findViewById(R.id.article_content);
        articleContent.setMovementMethod(ScrollingMovementMethod.getInstance());

        TextView articleTitle=(TextView)findViewById(R.id.article_title);
        TextView author=(TextView)findViewById(R.id.author);
        CircleImageView head=(CircleImageView)findViewById(R.id.circle_image_view_head);


        /**
         * Glide.with(getActivity())
         *                         .load(model)
         *                         .apply(new RequestOptions().placeholder(R.drawable.mytest).error(R.drawable.mytest).dontAnimate().centerCrop())
         *                         .into(itemView);
         */

        //todo  网络处理得到文章具体信息
        Intent intent=getIntent();
        int articleId=intent.getIntExtra(ARTICLE_ID_STRING,-1);
        if(articleId==-1){
            Toast.makeText(ArticleActivity.this,"文章获取失败",Toast.LENGTH_SHORT).show();

        }else{
            //

            articleTitle.setText("批判犬儒主义的现实题材！");
            articleContent.setText("导演揭露和讽刺了社会真相：\n" +
                    "百姓在强权面前，求自保，可以放弃所谓的道德和是非判断，为了自身安稳，不在乎别人死活都可以。在不涉及自身安危时，好管闲事，呼吁追求公平公开公正。在影片中，刚开始接纳外乡人的矛盾轻易化解，因为他们听从当地权威领导。在遇到更强权时，就见风使舵了，畏惧于更大的强权，妥协自己换取平安，也不敢计较是非对错。\n" +
                    "人性历来如此，至今未变，因为他们的基本需求只是想好好过日子，如面馆老板只愿意当喷子而已。\n" +
                    "\n" +
                    "彭演的浪子角色，也是基于过去自己坚持正义给同伴带来灾难而产生心灰意冷和逃避现实不公平的悲情角色，假装冷漠和良心发现之间做着激烈的斗争。后来不想去改变现实，最后受到刘青云角色的鼓励和激发，才涌起了压抑多年的反抗意识。\n" +
                    "吴京演的权力派，是非常务实的，他从过去的人生经验中总结出非得靠自己拥有强权才能去改变现实，他并没有像浪子一样去逃避，于是拥护当权军阀，尽职尽忠，内心的矛盾是兄弟情谊和军人职责之间的激烈斗争。\n" +
                    "古天乐演的军阀公子，滥杀无辜，尽情的嘲讽人性黑暗，觉得没有觉悟的百姓不值得怜悯，权力至上，因此大开杀戒没有丝毫愧疚。也是愤世嫉俗的人，见不得地主的虚伪和见风使舵。杀地主杀的观众很开心。\n" +
                    "结果，当地百姓与当地安保团领导想法不一致时，百姓人心不齐，就不再拥护小领导，反倒更畏惧强权，正好与地主的想法不谋而合，可以看出，松散百姓的犬儒主义，不涉及自身利益时，一种态度，涉及自身利益时，又一种态度，导演阐述的淋漓尽致，在松散和平管理的体制下，大众一直都是这样的做派。\n" +
                    "讽刺归讽刺，批判归批判，那么在现实中到底应该采取什么样的生活态度，导演没有提供思路。这个需要自己去琢磨。");

            author.setText("戳虾子");


        }

        Glide.with(ArticleActivity.this)
                .load("http://img0.imgtn.bdimg.com/it/u=3906463260,2316822376&fm=11&gp=0.jpg")
                .apply(new RequestOptions().placeholder(R.drawable.mytest).error(R.drawable.mytest).dontAnimate().centerCrop())
                .into(head);



    }

    private void articleInit(){

    }
}
