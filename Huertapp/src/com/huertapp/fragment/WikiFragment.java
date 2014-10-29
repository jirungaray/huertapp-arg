package com.huertapp.fragment;

import java.util.Locale;

import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;

import com.huertapp.R;
import com.huertapp.wiki.WikiCropListFragment;
import com.huertapp.wiki.WikiGardenListFragment;
import com.huertapp.wiki.WikiInfoListFragment;
import com.huertapp.wiki.WikiPlagueListFragment;


public class WikiFragment extends Fragment implements ActionBar.TabListener {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v13.app.FragmentStatePagerAdapter}.
	 */
	SectionPagerAdapter mSectionPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	
	public static WikiFragment newInstance() {
		WikiFragment fragment = new WikiFragment();
        return fragment;
    }
	
	public WikiFragment(){ }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wiki, container, false);

        ViewPager vpPager = (ViewPager)view.findViewById(R.id.pager);
        mSectionPagerAdapter = new SectionPagerAdapter(getChildFragmentManager());
        vpPager.setAdapter(mSectionPagerAdapter);
        
        return view;
    }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	

	public static class SectionPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {

		private static int NUM_ITEMS = 4;
		
		public SectionPagerAdapter(FragmentManager fragmentManager) {
			super(fragmentManager);
			// TODO Auto-generated constructor stub
		}

			// Returns total number of pages
	        @Override
	        public int getCount() {
	            return NUM_ITEMS;
	        }

	        // Returns the fragment to display for that page
	        @Override
	        public Fragment getItem(int position) {
	            switch (position) {
	            case 0:
					return new WikiCropListFragment();
				case 1:
					return new WikiPlagueListFragment();
				case 2:
					return new WikiGardenListFragment();
				case 3:
					return new WikiInfoListFragment();
	            default:
	                return null;
	            }
	        }

	        // Returns the page title for the top indicator
			@Override
			public CharSequence getPageTitle(int position) {
				Locale l = Locale.getDefault();
				switch (position) {
				case 0:
					return "Cultivos";
				case 1:
					return "Plagas";
				case 2:
					return "Huertas";
				case 3:
					return "Info Gral";
				}
				return null;
			}

	    }
	
	
}
