package org.shadowice.flocke.andotp.Activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewStub;
import org.shadowice.flocke.andotp.R;

public class HelpdetailsActivity extends BaseActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("新手引导详情");
        setContentView(R.layout.activity_container);

        Toolbar toolbar = findViewById(R.id.container_toolbar);
        setSupportActionBar(toolbar);
        ViewStub stub = findViewById(R.id.container_stub);
         //新页面接收数据
         Bundle bundle = this.getIntent().getExtras();
         //接收No值
        int no = bundle.getInt("No");
        switch(no) {
            case 0:
                stub.setLayoutResource(R.layout.component_help_details1);
                break;
            case 1:
                stub.setLayoutResource(R.layout.component_help_details2);
                break;
            case 2:
                stub.setLayoutResource(R.layout.component_help_details3);
                break;
        }
        stub.inflate();
    }
    // Go back to last activity
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
}
