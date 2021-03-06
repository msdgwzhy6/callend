package com.jeden.tel.main;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter 
{
	private ArrayList<BaseFragment> list;
	
	public FragmentAdapter(FragmentManager fm, ArrayList<BaseFragment> list)
	{
		super(fm);
		this.list = list;
	}

	@Override
	public Fragment getItem(int arg0) 
	{
		return list.get(arg0);
	}

	@Override
	public int getCount()
	{
		return list.size();
	}

}
