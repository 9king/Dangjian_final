package com.mycompany.dangjian_final.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mycompany.dangjian_final.R;

/**
 * 项目名： Dangjian_final
 * 包名：com.mycompany.dangjian_final.fragment
 * 文件名:UserFragment
 * 创建者：zhuli
 * 创建时间: 2017/11/17
 * 描述:  TODO
 */
public class UserFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user,container,false);
        return view;
    }
}
