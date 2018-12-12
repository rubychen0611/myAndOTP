package org.shadowice.flocke.andotp.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import org.shadowice.flocke.andotp.R;
import org.shadowice.flocke.andotp.Utilities.ImageListArray;
import org.shadowice.flocke.andotp.View.ImageListAdapter;

import java.util.ArrayList;
import java.util.List;

public class LinksActivity extends BaseActivity implements OnItemClickListener{

    private List<ImageListArray> onePieceList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("快捷链接");
        setContentView(R.layout.activity_container);

        Toolbar toolbar = findViewById(R.id.container_toolbar);
        setSupportActionBar(toolbar);
        ViewStub stub = findViewById(R.id.container_stub);
        stub.setLayoutResource(R.layout.component_links);
        stub.inflate();

        addingData(); //初始化数据
        //创建适配器，在适配器中导入数据 1.当前类 2.list_view一行的布局 3.数据集合
        ImageListAdapter imageListAdapter = new ImageListAdapter(LinksActivity.this,R.layout.component_linkitem,onePieceList);
        // 获取ListView对象，并设置单击动作的监听器
        ListView lv = (ListView) findViewById(R.id.links_listview);
        lv.setAdapter(imageListAdapter);
        lv.setOnItemClickListener(this);

    }

    public void addingData(){
        ImageListArray amazon =new ImageListArray("Amazon",R.drawable.thumb_amazon);
        onePieceList.add(amazon);
        ImageListArray gitHub =new ImageListArray("GitHub",R.drawable.thumb_github);
        onePieceList.add(gitHub);
        ImageListArray google =new ImageListArray("Google",R.drawable.thumb_google);
        onePieceList.add(google);
        ImageListArray reddit =new ImageListArray("Reddit",R.drawable.thumb_reddit);
        onePieceList.add(reddit);
        ImageListArray apple=new ImageListArray("Apple",R.drawable.thumb_apple);
        onePieceList.add(apple);
        ImageListArray facebook=new ImageListArray("FaceBook",R.drawable.thumb_facebook);
        onePieceList.add(facebook);
        ImageListArray evernote=new ImageListArray("Evernote",R.drawable.thumb_evernote);
        onePieceList.add(evernote);
        ImageListArray microsoft=new ImageListArray("Microsoft",R.drawable.thumb_microsoft);
        onePieceList.add(microsoft);
        ImageListArray steam=new ImageListArray("Steam",R.drawable.thumb_steam);
        onePieceList.add(steam);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i)
        {
            case 0: {
                Uri uri=Uri.parse("https://www.amazon.cn/a/settings/approval/appbackup");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 1: {
                Uri uri=Uri.parse("https://github.com/settings/two_factor_authentication/intro");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 2: {

                Uri uri=Uri.parse("https://myaccount.google.com/signinoptions/two-step-verification/enroll-welcome");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 3: {
                Uri uri=Uri.parse("https://www.reddit.com/prefs/update");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 4:{
                Uri uri=Uri.parse("https://support.apple.com/zh-cn/HT204152");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 5:{
                Uri uri=Uri.parse("https://www.facebook.com/security/2fac/setup/intro/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 6:{
                Uri uri=Uri.parse("https://www.evernote.com/secure/SecuritySettings.action");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 7:{
                Uri uri=Uri.parse("https://account.live.com/proofs/Manage");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            case 8:{
                Uri uri=Uri.parse("https://support.steampowered.com/kb_article.php?ref=4440-RTUI-9218");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                return;
            }
            default: return;
        }
    }

    public List<ImageListArray> getOnePieceList() {
        return onePieceList;
    }
}

