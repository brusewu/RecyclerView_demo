package com.example.demo.criminalinten;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bruse on 2019/5/22.
 */

public class CrimeActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//
//        if (fragment == null){
//            fragment = new CrimeFragment();
//            fm.beginTransaction()
//                    .add(R.id.fragment_container,fragment)
//                    .commit();
//        }
//    }

    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }



}
