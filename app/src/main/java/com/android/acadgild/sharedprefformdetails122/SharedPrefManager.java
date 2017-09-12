package com.android.acadgild.sharedprefformdetails122;

/**
 * Created by Jal on 15-08-2017.
 * Class to Set & Get values to SharedPrefrence & From SharedPreference
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPrefManager {
    public static SharedPreferences getSharedPref(Context mContext) {
        SharedPreferences pref = mContext.getSharedPreferences("settings", Context.MODE_PRIVATE);
        return pref;
    }
    //To set String type of values in SharedPrefernces
    public static void setStringPrefVal(Context mContext, String key, String value) {
        Editor edit = getSharedPref(mContext).edit();
        edit.putString(key, value);
        edit.commit();
    }
    //To set int type of values in SharedPrefernces
    public static void setIntPrefVal(Context mContext, String key, int value) {
        Editor edit = getSharedPref(mContext).edit();
        edit.putInt(key, value);
        edit.commit();
    }
    //To set boolean type of values in SharedPrefernces
    public static void setBooleanPrefVal(Context mContext, String key, boolean value){
        Editor edit = getSharedPref(mContext).edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    //To get boolean type of values from SharedPrefernces
    public static boolean getBooleanPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        boolean val = false;
        if(pref.contains(key))
            val = pref.getBoolean(key,false);
        else
            val = false;
        return val;
    }
    //To get string type of values from SharedPrefernces
    public static String getPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        String val = "";
        if(pref.contains(key))
            val = pref.getString(key, "");
        else
            val = "";
        return val;
    }
    //To get int type of values from SharedPrefernces
    public static int getIntPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        int val = 0;
        if(pref.contains(key)) val = pref.getInt(key, 0);
        return val;
    }
}
