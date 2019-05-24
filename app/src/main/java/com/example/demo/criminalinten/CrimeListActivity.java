package com.example.demo.criminalinten;

import android.support.v4.app.Fragment;

/**
 * Created by bruse on 2019/5/22.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
