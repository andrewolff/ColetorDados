package com.example.coletordados;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferencia {
    private Context context;
    private SharedPreferences sharedPref;

    public Preferencia(Context context) {
        this.setContext(context);
        this.initSharedPref();
    }

    private void initSharedPref() {
        this.setSharedPref(this.getContext().getSharedPreferences("temp", Context.MODE_PRIVATE));
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public SharedPreferences getSharedPref() {
        return sharedPref;
    }

    public void setSharedPref(SharedPreferences sharedPref) {
        this.sharedPref = sharedPref;
    }

    public void save(String key, String value) {
        SharedPreferences.Editor editor = getSharedPref().edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String read(String key) {
        return getSharedPref().getString(key, "");
    }
}
