package com.pamelahernandez.prueba;


/**
 * Created by pamelahernandez on 18/08/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class OneFragment extends Fragment{



    public OneFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ArrayList<String> cl= new ArrayList<String>();

        Bundle bundle = this.getArguments();
//      String myValue = bundle.getString("message");
        cl = bundle.getStringArrayList("ar");
        System.out.println(Arrays.toString(cl.toArray()));
        View myInflatedView = inflater.inflate(R.layout.fragment_one, container,false);

//        TextView t = (TextView) myInflatedView.findViewById(R.id.lbltext);
//        t.setText(myValue);

        return myInflatedView;

    }

}
