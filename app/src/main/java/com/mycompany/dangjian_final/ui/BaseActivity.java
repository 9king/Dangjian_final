package com.mycompany.dangjian_final.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 项目名： Dangjian_final
 * 包名：com.mycompany.dangjian_final.ui
 * 文件名:BaseActivity
 * 创建者：zhuli
 * 创建时间: 2017/11/17
 * 描述:  Activity的一个基类
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
