package com.huertapp.wiki;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.huertapp.R;

public class WikiGardenListFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container, Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.fragment_wiki_garden_list, container, false);
		
			
			ListView list = (ListView) v.findViewById(R.id.gardenList);
			list.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[]{"Interna","Externa","Almacágo","Hidropónica","Invernadero","Tierra Libre"}));
			return v;
	}
}
