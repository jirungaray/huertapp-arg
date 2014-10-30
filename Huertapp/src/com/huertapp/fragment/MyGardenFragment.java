package com.huertapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.huertapp.FakeDB;
import com.huertapp.MyCropsActivity;
import com.huertapp.NewGardenDialog;
import com.huertapp.R;
import com.huertapp.adapter.GardenAdapter;
import com.huertapp.task.ListGardensTask;

public class MyGardenFragment extends Fragment {

	private ListView mGardens;
	
	public static MyGardenFragment newInstance() {
		MyGardenFragment fragment = new MyGardenFragment();
        return fragment;
    }
	
	public MyGardenFragment(){ }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
	@Override
	public void onResume() {
		super.onResume();
		
		if(mGardens != null){
			new ListGardensTask(this.getActivity(), mGardens).execute();
		}
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_garden, container, false);

        mGardens = (ListView)view.findViewById(R.id.gardenList);
        new ListGardensTask(this.getActivity(), mGardens).execute();
        mGardens.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				startActivity(new Intent(getActivity(), MyCropsActivity.class));
				
			}
		});
		
		Button btnNew = (Button)view.findViewById(R.id.addGardenButton);
		btnNew.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getActivity(),NewGardenDialog.class));
			}
		});
        
        return view;
    }

}
