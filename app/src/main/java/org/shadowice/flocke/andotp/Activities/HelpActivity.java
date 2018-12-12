package org.shadowice.flocke.andotp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import org.shadowice.flocke.andotp.R;

public class HelpActivity extends BaseActivity implements OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("新手引导");
        setContentView(R.layout.activity_container);

        Toolbar toolbar = findViewById(R.id.container_toolbar);
        setSupportActionBar(toolbar);
        ViewStub stub = findViewById(R.id.container_stub);
        stub.setLayoutResource(R.layout.component_help);
        stub.inflate();

        // 获取ListView对象，并设置单击动作的监听器
        ListView lv = (ListView) findViewById(R.id.help_listview);
        lv.setOnItemClickListener(this);
    }

    // Go back to the main activity
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
        Intent detailIntent = new Intent(this, HelpdetailsActivity.class);
        Bundle bundle=new Bundle();
        //传递name参数
        bundle.putInt("No", i);
        detailIntent.putExtras(bundle);
        startActivity(detailIntent);
    }
}
