package teamtreehouse.com.stormy.weather;

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
}
