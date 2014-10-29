package com.huertapp.fragment;

import java.util.LinkedList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.huertapp.R;
import com.huertapp.adapter.ReminderAdapter;
import com.huertapp.model.Reminder;
import com.huertapp.task.GetWeatherTask;

public class HomeFragment extends Fragment {

	public static HomeFragment newInstance() {
		HomeFragment fragment = new HomeFragment();
        return fragment;
    }
	
	public HomeFragment(){ }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*if (getArguments() != null) {
            mType = getArguments().getInt(ARG_PARAM_TYPE);
        }*/
    }
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        new GetWeatherTask(getActivity()).execute("Buenos%20Aires,Argentina");
        
        List<Reminder> remindersData = new LinkedList<Reminder>();
        remindersData.add(new Reminder("Regar Tomates - (Terraza)", "Hoy"));
        remindersData.add(new Reminder("Regar - Albahaca - (Balcón)", "Dentro de 2 Días"));
        remindersData.add(new Reminder("Cosechar - Albahaca - (Balcón)", "Dentro de 3 Días"));
        remindersData.add(new Reminder("Insecticida Tomates- (Balcón)", "Dentro de 5 Días"));
        remindersData.add(new Reminder("Regar Tomates - (Terraza)", "Dentro de 2 Días"));

        ListView reminders = (ListView)view.findViewById(R.id.reminderList);
        reminders.setAdapter(new ReminderAdapter(getActivity(), remindersData));
        
        return view;
    }
}
