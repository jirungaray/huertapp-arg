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

public class WikiPlagueListFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container, Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.fragment_wiki_plague_list, container, false);
		 
			Spinner type = (Spinner) v.findViewById(R.id.plagueTypeSpinner);
			
			type.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, new String[]{"Todo","PArásitos","Hongos","Bacterias","Virus"}));
			
			Spinner crops = (Spinner) v.findViewById(R.id.CropSpinner);
			
			crops.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, new String[]{"Todos los cultivos","Tomate","Lechuga","Albahaca","Batata","Papa","Calabaza","Brocoli","Espinaca","Apio","Acelga","Perejil","Zanahoria","Remolacha","Repollo"}));
			
			ListView list = (ListView) v.findViewById(R.id.plagueList);
			list.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[]{"Pulgón","Mosca Blanca","Araña Roja","Trips","Nematodos","Oidio","Mildiu","Negrilla","Roya","Chancro Bacteriano"}));
			return v;
	}
}
