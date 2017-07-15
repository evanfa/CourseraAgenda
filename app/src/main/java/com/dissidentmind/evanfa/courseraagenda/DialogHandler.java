package com.dissidentmind.evanfa.courseraagenda;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

import java.util.Calendar;

/**
 * Created by Fabio on 5/25/2016.
 */
public class DialogHandler extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DateSetting dateSetting=new DateSetting(getActivity());
        Calendar calendar= Calendar.getInstance();
        int year= calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog;
        dialog=new DatePickerDialog(getActivity(),dateSetting,year,month,day);
        return dialog;
    }
}