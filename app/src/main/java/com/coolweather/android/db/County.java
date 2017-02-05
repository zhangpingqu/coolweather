package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by QZP on 2017/2/5.
 */

public class County extends DataSupport{
    private int id;

    private String countyName;

    private String weatherId;

    private int cityIc;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityIc() {
        return cityIc;
    }

    public void setCityIc(int cityIc) {
        this.cityIc = cityIc;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
