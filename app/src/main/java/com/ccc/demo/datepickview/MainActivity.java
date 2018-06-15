package com.ccc.demo.datepickview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ccc.datepickview.CCCDatePickView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.tv_show = (TextView)findViewById(R.id.tv_show);
        this.tv_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CCCDatePickView pickerPopWin = new CCCDatePickView.Builder(MainActivity.this, new CCCDatePickView.OnDatePickedListener() {
                    @Override
                    public void onDatePickCompleted(int year, int month, int day, String dateDesc) {
                        Toast.makeText(MainActivity.this, dateDesc, Toast.LENGTH_SHORT).show();
                    }
                }).textConfirm("CONFIRM") //text of confirm button
                        .textCancel("CANCEL") //text of cancel button
                        .btnTextSize(16) // button text size
                        .viewTextSize(25) // pick view text size
                        .colorCancel(Color.parseColor("#999999")) //color of cancel button
                        .colorConfirm(Color.parseColor("#009900"))//color of confirm button
                        .minYear(2017) //min year in loop
                        .maxYear(2017) // max year in loop
                        .minMonth(1)
                        .maxMonth(4)
                        .minDay(1)
                        .maxDay(10)
                        .dateChose("2017-4-5") // date chose when init popwindow
                        .build();
                pickerPopWin.showPopWin(MainActivity.this);
            }
        });
    }
}
