package com.ismailhakkiaydin.datepickerdialog;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public class DateHandler implements DatePickerDialog.OnDateSetListener {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
            int m= monthOfYear+1;
            MainActivity.this.setTitle(dayOfMonth + "/" + m + "/" + year);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DatePickerDialog dlg = new DatePickerDialog(this, new DateHandler(),1938,10,10);
        dlg.setTitle("Information");
        dlg.show();

    }
}
