package teamtreehouse.com.stormy.weather;

import teamtreehouse.com.stormy.R;

/**
 * Created by tiany on 2017/8/7.
 */

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Current getmCurrent() {
        return mCurrent;
    }

    public void setmCurrent(Current mCurrent) {
        this.mCurrent = mCurrent;
    }

    public Hour[] getmHourlyForecast() {
        return mHourlyForecast;
    }

    public void setmHourlyForecast(Hour[] mHourlyForecast) {
        this.mHourlyForecast = mHourlyForecast;
    }

    public Day[] getmDailyForecast() {
        return mDailyForecast;
    }

    public void setmDailyForecast(Day[] mDailyForecast) {
        this.mDailyForecast = mDailyForecast;
    }

    public static int getIconId(String iconString){
        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night.
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (iconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }
}
