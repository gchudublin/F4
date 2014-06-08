package com.gregchu.f4.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.zip.Inflater;

/**
 * Created by greg on 6/8/2014.
 */
public class FragmentA extends Fragment {
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_a,container,false);
list = (ListView) view.findViewById(R.id.listView);

        return view;
    }
}

