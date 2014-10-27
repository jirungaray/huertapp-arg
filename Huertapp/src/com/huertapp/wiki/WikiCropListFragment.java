package com.huertapp.wiki;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.huertapp.R;

public class WikiCropListFragment extends Fragment {

	

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container, Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.fragment_wiki_crop_list, container, false);
		 
		Spinner type = (Spinner) v.findViewById(R.id.cropTypeSpinner);
		
		type.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, new String[]{"Todo","Hortalizas","Frutales","Legumbres"}));
		
		ListView list = (ListView) v.findViewById(R.id.cropList);
		list.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[]{"Tomate","Lechuga","Albahaca","Batata","Papa","Calabaza","Brocoli","Espinaca","Apio","Acelga","Perejil","Zanahoria","Remolacha","Repollo"}));
		return v;
	}
}
