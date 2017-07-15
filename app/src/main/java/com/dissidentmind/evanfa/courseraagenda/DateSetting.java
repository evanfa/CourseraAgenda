package com.dissidentmind.evanfa.courseraagenda;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by MUhammad zubair on 4/1/2015.
 */
public class DateSetting implements DatePickerDialog.OnDateSetListener {
    Context context;
    public DateSetting (Context context){
        this.context=context;

    }
    @Override
    public void onDateSet(DatePicker view, int year, int dateSetting, int dayOfMonth) {
        Toast.makeText(context,"Selected date:"+dateSetting+"/"+dayOfMonth+"/"+year,Toast.LENGTH_LONG).show();

    }
}