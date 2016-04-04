package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by hbsong on 2016/4/3.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
