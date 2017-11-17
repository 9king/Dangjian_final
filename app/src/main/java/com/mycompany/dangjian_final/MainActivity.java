package com.mycompany.dangjian_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mycompany.dangjian_final.fragment.DActionFragment;
import com.mycompany.dangjian_final.fragment.DVedioFragment;
import com.mycompany.dangjian_final.fragment.NewsFragment;
import com.mycompany.dangjian_final.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private List<String>mTitle;
    private  List<Fragment> mFragment;

    private FloatingActionButton mfab_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    //初始化数据
    private void initData(){
        mTitle=new ArrayList<>();
        mTitle.add("新闻时事");
        mTitle.add("党建视频");
        mTitle.add("党员活动");
        mTitle.add("个人中心");

        mFragment=new ArrayList<>();
        mFragment.add(new NewsFragment());
        mFragment.add(new DVedioFragment());
        mFragment.add(new DActionFragment());
        mFragment.add(new UserFragment());



    }
    //初始化控件
    private void initView() {
        mfab_setting= (FloatingActionButton) findViewById(R.id.fab_setting);
        mfab_setting.setOnClickListener(this);
        mTabLayout= (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager= (ViewPager) findViewById(R.id.mViewPager);
        mViewPager.setOffscreenPageLimit(mFragment.size());
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_setting:
               startActivity(new Intent(this,SettingActivity.class));
                break;
        }
    }
}
