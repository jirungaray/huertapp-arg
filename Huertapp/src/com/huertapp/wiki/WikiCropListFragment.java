package com.huertapp.wiki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.huertapp.R;
import com.huertapp.WikiCropDetail;

public class WikiCropListFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container, Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.fragment_wiki_crop_list, container, false);
		 
		Spinner type = (Spinner) v.findViewById(R.id.cropTypeSpinner);
		
		type.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, new String[]{"Todo","Hortalizas","Frutales","Legumbres"}));
		
		ListView list = (ListView) v.findViewById(R.id.cropList);
		list.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[]{"Tomate","Lechuga","Albahaca","Batata","Papa","Calabaza","Brocoli","Espinaca","Apio","Acelga","Perejil","Zanahoria","Remolacha","Repollo"}));
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				getActivity().startActivity(new Intent(getActivity(),WikiCropDetail.class));
			}
		});
		return v;
	}
}
