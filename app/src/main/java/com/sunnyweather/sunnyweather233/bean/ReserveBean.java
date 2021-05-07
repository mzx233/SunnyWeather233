package com.sunnyweather.sunnyweather233.bean;

import java.util.List;

public class ReserveBean {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : -25200
     * timezone : America/Los_Angeles
     * server_time : 1620098329
     * location : [37.7648,-122.463]
     * result : {"daily":{"status":"ok","astro":[{"date":"2021-05-03T00:00-07:00","sunrise":{"time":"06:11"},"sunset":{"time":"20:02"}},{"date":"2021-05-04T00:00-07:00","sunrise":{"time":"06:09"},"sunset":{"time":"20:03"}},{"date":"2021-05-05T00:00-07:00","sunrise":{"time":"06:08"},"sunset":{"time":"20:04"}},{"date":"2021-05-06T00:00-07:00","sunrise":{"time":"06:07"},"sunset":{"time":"20:05"}},{"date":"2021-05-07T00:00-07:00","sunrise":{"time":"06:06"},"sunset":{"time":"20:05"}}],"precipitation":[{"date":"2021-05-03T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-04T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-05T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-06T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-07T00:00-07:00","max":0,"min":0,"avg":0}],"temperature":[{"date":"2021-05-03T00:00-07:00","max":17.16,"min":10.64,"avg":13.34},{"date":"2021-05-04T00:00-07:00","max":16,"min":10.79,"avg":13.42},{"date":"2021-05-05T00:00-07:00","max":15.31,"min":9.73,"avg":11.91},{"date":"2021-05-06T00:00-07:00","max":14.54,"min":10.1,"avg":11.89},{"date":"2021-05-07T00:00-07:00","max":14.7,"min":9.05,"avg":11.7}],"wind":[{"date":"2021-05-03T00:00-07:00","max":{"speed":23.39,"direction":279.92},"min":{"speed":0.75,"direction":335.52},"avg":{"speed":8.7,"direction":271.35}},{"date":"2021-05-04T00:00-07:00","max":{"speed":17.42,"direction":263.98},"min":{"speed":0.64,"direction":216.62},"avg":{"speed":9.74,"direction":258.52}},{"date":"2021-05-05T00:00-07:00","max":{"speed":23.83,"direction":246.95},"min":{"speed":7.31,"direction":194.68},"avg":{"speed":14.68,"direction":234.15}},{"date":"2021-05-06T00:00-07:00","max":{"speed":27.01,"direction":287.67},"min":{"speed":9.01,"direction":246.44},"avg":{"speed":18.88,"direction":265.88}},{"date":"2021-05-07T00:00-07:00","max":{"speed":35.14,"direction":293.56},"min":{"speed":1.51,"direction":305.88},"avg":{"speed":17.25,"direction":295.52}}],"humidity":[{"date":"2021-05-03T00:00-07:00","max":0.85,"min":0.5,"avg":0.72},{"date":"2021-05-04T00:00-07:00","max":0.87,"min":0.63,"avg":0.73},{"date":"2021-05-05T00:00-07:00","max":0.93,"min":0.65,"avg":0.81},{"date":"2021-05-06T00:00-07:00","max":0.86,"min":0.7,"avg":0.79},{"date":"2021-05-07T00:00-07:00","max":0.91,"min":0.55,"avg":0.74}],"cloudrate":[{"date":"2021-05-03T00:00-07:00","max":1,"min":0,"avg":0.57},{"date":"2021-05-04T00:00-07:00","max":0.34,"min":0,"avg":0.06},{"date":"2021-05-05T00:00-07:00","max":0.33,"min":0,"avg":0.13},{"date":"2021-05-06T00:00-07:00","max":1,"min":0,"avg":0.17},{"date":"2021-05-07T00:00-07:00","max":1,"min":0,"avg":0.22}],"pressure":[{"date":"2021-05-03T00:00-07:00","max":100968.26,"min":100735.36,"avg":100785.91},{"date":"2021-05-04T00:00-07:00","max":100984.13,"min":100735.36,"avg":100856.26},{"date":"2021-05-05T00:00-07:00","max":101055.36,"min":100755.27,"avg":100836.08},{"date":"2021-05-06T00:00-07:00","max":101459.4,"min":101059.4,"avg":101314.05},{"date":"2021-05-07T00:00-07:00","max":101540.1,"min":101139.4,"avg":101328.44}],"visibility":[{"date":"2021-05-03T00:00-07:00","max":24.13,"min":18.14,"avg":21.27},{"date":"2021-05-04T00:00-07:00","max":24.13,"min":8.96,"avg":18.05},{"date":"2021-05-05T00:00-07:00","max":24.13,"min":7.37,"avg":13.47},{"date":"2021-05-06T00:00-07:00","max":23.12,"min":9.29,"avg":13.87},{"date":"2021-05-07T00:00-07:00","max":24.13,"min":7.69,"avg":16.6}],"dswrf":[{"date":"2021-05-03T00:00-07:00","max":962.2,"min":0,"avg":181.2},{"date":"2021-05-04T00:00-07:00","max":926.2,"min":0,"avg":320.3},{"date":"2021-05-05T00:00-07:00","max":918.2,"min":0,"avg":313.1},{"date":"2021-05-06T00:00-07:00","max":951.7,"min":0,"avg":328.5},{"date":"2021-05-07T00:00-07:00","max":966.3,"min":0,"avg":333.5}],"air_quality":{"aqi":[{"date":"2021-05-03T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-04T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-05T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-06T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-07T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}}],"pm25":[{"date":"2021-05-03T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-04T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-05T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-06T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-07T00:00-07:00","max":0,"avg":0,"min":0}]},"skycon":[{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}],"skycon_08h_20h":[{"date":"2021-05-03T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}],"skycon_20h_32h":[{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-07T00:00-07:00","value":"CLEAR_NIGHT"}],"life_index":{"ultraviolet":[{"date":"2021-05-03T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-04T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-05T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-06T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"中等"}],"carWashing":[{"date":"2021-05-03T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-04T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-05T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-06T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-07T00:00-07:00","index":"1","desc":"适宜"}],"dressing":[{"date":"2021-05-03T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-06T00:00-07:00","index":"6","desc":"冷"},{"date":"2021-05-07T00:00-07:00","index":"6","desc":"冷"}],"comfort":[{"date":"2021-05-03T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-06T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-07T00:00-07:00","index":"9","desc":"寒冷"}],"coldRisk":[{"date":"2021-05-03T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-04T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-05T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-06T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"易发"}]}},"primary":0}
     */

    private String status;
    private String api_version;
    private String api_status;
    private String lang;
    private String unit;
    private int tzshift;
    private String timezone;
    private int server_time;
    private ResultBean result;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultBean {
        /**
         * daily : {"status":"ok","astro":[{"date":"2021-05-03T00:00-07:00","sunrise":{"time":"06:11"},"sunset":{"time":"20:02"}},{"date":"2021-05-04T00:00-07:00","sunrise":{"time":"06:09"},"sunset":{"time":"20:03"}},{"date":"2021-05-05T00:00-07:00","sunrise":{"time":"06:08"},"sunset":{"time":"20:04"}},{"date":"2021-05-06T00:00-07:00","sunrise":{"time":"06:07"},"sunset":{"time":"20:05"}},{"date":"2021-05-07T00:00-07:00","sunrise":{"time":"06:06"},"sunset":{"time":"20:05"}}],"precipitation":[{"date":"2021-05-03T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-04T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-05T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-06T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-07T00:00-07:00","max":0,"min":0,"avg":0}],"temperature":[{"date":"2021-05-03T00:00-07:00","max":17.16,"min":10.64,"avg":13.34},{"date":"2021-05-04T00:00-07:00","max":16,"min":10.79,"avg":13.42},{"date":"2021-05-05T00:00-07:00","max":15.31,"min":9.73,"avg":11.91},{"date":"2021-05-06T00:00-07:00","max":14.54,"min":10.1,"avg":11.89},{"date":"2021-05-07T00:00-07:00","max":14.7,"min":9.05,"avg":11.7}],"wind":[{"date":"2021-05-03T00:00-07:00","max":{"speed":23.39,"direction":279.92},"min":{"speed":0.75,"direction":335.52},"avg":{"speed":8.7,"direction":271.35}},{"date":"2021-05-04T00:00-07:00","max":{"speed":17.42,"direction":263.98},"min":{"speed":0.64,"direction":216.62},"avg":{"speed":9.74,"direction":258.52}},{"date":"2021-05-05T00:00-07:00","max":{"speed":23.83,"direction":246.95},"min":{"speed":7.31,"direction":194.68},"avg":{"speed":14.68,"direction":234.15}},{"date":"2021-05-06T00:00-07:00","max":{"speed":27.01,"direction":287.67},"min":{"speed":9.01,"direction":246.44},"avg":{"speed":18.88,"direction":265.88}},{"date":"2021-05-07T00:00-07:00","max":{"speed":35.14,"direction":293.56},"min":{"speed":1.51,"direction":305.88},"avg":{"speed":17.25,"direction":295.52}}],"humidity":[{"date":"2021-05-03T00:00-07:00","max":0.85,"min":0.5,"avg":0.72},{"date":"2021-05-04T00:00-07:00","max":0.87,"min":0.63,"avg":0.73},{"date":"2021-05-05T00:00-07:00","max":0.93,"min":0.65,"avg":0.81},{"date":"2021-05-06T00:00-07:00","max":0.86,"min":0.7,"avg":0.79},{"date":"2021-05-07T00:00-07:00","max":0.91,"min":0.55,"avg":0.74}],"cloudrate":[{"date":"2021-05-03T00:00-07:00","max":1,"min":0,"avg":0.57},{"date":"2021-05-04T00:00-07:00","max":0.34,"min":0,"avg":0.06},{"date":"2021-05-05T00:00-07:00","max":0.33,"min":0,"avg":0.13},{"date":"2021-05-06T00:00-07:00","max":1,"min":0,"avg":0.17},{"date":"2021-05-07T00:00-07:00","max":1,"min":0,"avg":0.22}],"pressure":[{"date":"2021-05-03T00:00-07:00","max":100968.26,"min":100735.36,"avg":100785.91},{"date":"2021-05-04T00:00-07:00","max":100984.13,"min":100735.36,"avg":100856.26},{"date":"2021-05-05T00:00-07:00","max":101055.36,"min":100755.27,"avg":100836.08},{"date":"2021-05-06T00:00-07:00","max":101459.4,"min":101059.4,"avg":101314.05},{"date":"2021-05-07T00:00-07:00","max":101540.1,"min":101139.4,"avg":101328.44}],"visibility":[{"date":"2021-05-03T00:00-07:00","max":24.13,"min":18.14,"avg":21.27},{"date":"2021-05-04T00:00-07:00","max":24.13,"min":8.96,"avg":18.05},{"date":"2021-05-05T00:00-07:00","max":24.13,"min":7.37,"avg":13.47},{"date":"2021-05-06T00:00-07:00","max":23.12,"min":9.29,"avg":13.87},{"date":"2021-05-07T00:00-07:00","max":24.13,"min":7.69,"avg":16.6}],"dswrf":[{"date":"2021-05-03T00:00-07:00","max":962.2,"min":0,"avg":181.2},{"date":"2021-05-04T00:00-07:00","max":926.2,"min":0,"avg":320.3},{"date":"2021-05-05T00:00-07:00","max":918.2,"min":0,"avg":313.1},{"date":"2021-05-06T00:00-07:00","max":951.7,"min":0,"avg":328.5},{"date":"2021-05-07T00:00-07:00","max":966.3,"min":0,"avg":333.5}],"air_quality":{"aqi":[{"date":"2021-05-03T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-04T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-05T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-06T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-07T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}}],"pm25":[{"date":"2021-05-03T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-04T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-05T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-06T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-07T00:00-07:00","max":0,"avg":0,"min":0}]},"skycon":[{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}],"skycon_08h_20h":[{"date":"2021-05-03T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}],"skycon_20h_32h":[{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-07T00:00-07:00","value":"CLEAR_NIGHT"}],"life_index":{"ultraviolet":[{"date":"2021-05-03T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-04T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-05T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-06T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"中等"}],"carWashing":[{"date":"2021-05-03T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-04T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-05T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-06T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-07T00:00-07:00","index":"1","desc":"适宜"}],"dressing":[{"date":"2021-05-03T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-06T00:00-07:00","index":"6","desc":"冷"},{"date":"2021-05-07T00:00-07:00","index":"6","desc":"冷"}],"comfort":[{"date":"2021-05-03T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-06T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-07T00:00-07:00","index":"9","desc":"寒冷"}],"coldRisk":[{"date":"2021-05-03T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-04T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-05T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-06T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"易发"}]}}
         * primary : 0
         */

        private DailyBean daily;
        private int primary;

        public DailyBean getDaily() {
            return daily;
        }

        public void setDaily(DailyBean daily) {
            this.daily = daily;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public static class DailyBean {
            /**
             * status : ok
             * astro : [{"date":"2021-05-03T00:00-07:00","sunrise":{"time":"06:11"},"sunset":{"time":"20:02"}},{"date":"2021-05-04T00:00-07:00","sunrise":{"time":"06:09"},"sunset":{"time":"20:03"}},{"date":"2021-05-05T00:00-07:00","sunrise":{"time":"06:08"},"sunset":{"time":"20:04"}},{"date":"2021-05-06T00:00-07:00","sunrise":{"time":"06:07"},"sunset":{"time":"20:05"}},{"date":"2021-05-07T00:00-07:00","sunrise":{"time":"06:06"},"sunset":{"time":"20:05"}}]
             * precipitation : [{"date":"2021-05-03T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-04T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-05T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-06T00:00-07:00","max":0,"min":0,"avg":0},{"date":"2021-05-07T00:00-07:00","max":0,"min":0,"avg":0}]
             * temperature : [{"date":"2021-05-03T00:00-07:00","max":17.16,"min":10.64,"avg":13.34},{"date":"2021-05-04T00:00-07:00","max":16,"min":10.79,"avg":13.42},{"date":"2021-05-05T00:00-07:00","max":15.31,"min":9.73,"avg":11.91},{"date":"2021-05-06T00:00-07:00","max":14.54,"min":10.1,"avg":11.89},{"date":"2021-05-07T00:00-07:00","max":14.7,"min":9.05,"avg":11.7}]
             * wind : [{"date":"2021-05-03T00:00-07:00","max":{"speed":23.39,"direction":279.92},"min":{"speed":0.75,"direction":335.52},"avg":{"speed":8.7,"direction":271.35}},{"date":"2021-05-04T00:00-07:00","max":{"speed":17.42,"direction":263.98},"min":{"speed":0.64,"direction":216.62},"avg":{"speed":9.74,"direction":258.52}},{"date":"2021-05-05T00:00-07:00","max":{"speed":23.83,"direction":246.95},"min":{"speed":7.31,"direction":194.68},"avg":{"speed":14.68,"direction":234.15}},{"date":"2021-05-06T00:00-07:00","max":{"speed":27.01,"direction":287.67},"min":{"speed":9.01,"direction":246.44},"avg":{"speed":18.88,"direction":265.88}},{"date":"2021-05-07T00:00-07:00","max":{"speed":35.14,"direction":293.56},"min":{"speed":1.51,"direction":305.88},"avg":{"speed":17.25,"direction":295.52}}]
             * humidity : [{"date":"2021-05-03T00:00-07:00","max":0.85,"min":0.5,"avg":0.72},{"date":"2021-05-04T00:00-07:00","max":0.87,"min":0.63,"avg":0.73},{"date":"2021-05-05T00:00-07:00","max":0.93,"min":0.65,"avg":0.81},{"date":"2021-05-06T00:00-07:00","max":0.86,"min":0.7,"avg":0.79},{"date":"2021-05-07T00:00-07:00","max":0.91,"min":0.55,"avg":0.74}]
             * cloudrate : [{"date":"2021-05-03T00:00-07:00","max":1,"min":0,"avg":0.57},{"date":"2021-05-04T00:00-07:00","max":0.34,"min":0,"avg":0.06},{"date":"2021-05-05T00:00-07:00","max":0.33,"min":0,"avg":0.13},{"date":"2021-05-06T00:00-07:00","max":1,"min":0,"avg":0.17},{"date":"2021-05-07T00:00-07:00","max":1,"min":0,"avg":0.22}]
             * pressure : [{"date":"2021-05-03T00:00-07:00","max":100968.26,"min":100735.36,"avg":100785.91},{"date":"2021-05-04T00:00-07:00","max":100984.13,"min":100735.36,"avg":100856.26},{"date":"2021-05-05T00:00-07:00","max":101055.36,"min":100755.27,"avg":100836.08},{"date":"2021-05-06T00:00-07:00","max":101459.4,"min":101059.4,"avg":101314.05},{"date":"2021-05-07T00:00-07:00","max":101540.1,"min":101139.4,"avg":101328.44}]
             * visibility : [{"date":"2021-05-03T00:00-07:00","max":24.13,"min":18.14,"avg":21.27},{"date":"2021-05-04T00:00-07:00","max":24.13,"min":8.96,"avg":18.05},{"date":"2021-05-05T00:00-07:00","max":24.13,"min":7.37,"avg":13.47},{"date":"2021-05-06T00:00-07:00","max":23.12,"min":9.29,"avg":13.87},{"date":"2021-05-07T00:00-07:00","max":24.13,"min":7.69,"avg":16.6}]
             * dswrf : [{"date":"2021-05-03T00:00-07:00","max":962.2,"min":0,"avg":181.2},{"date":"2021-05-04T00:00-07:00","max":926.2,"min":0,"avg":320.3},{"date":"2021-05-05T00:00-07:00","max":918.2,"min":0,"avg":313.1},{"date":"2021-05-06T00:00-07:00","max":951.7,"min":0,"avg":328.5},{"date":"2021-05-07T00:00-07:00","max":966.3,"min":0,"avg":333.5}]
             * air_quality : {"aqi":[{"date":"2021-05-03T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-04T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-05T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-06T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}},{"date":"2021-05-07T00:00-07:00","max":{"chn":0,"usa":0},"avg":{"chn":0,"usa":0},"min":{"chn":0,"usa":0}}],"pm25":[{"date":"2021-05-03T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-04T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-05T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-06T00:00-07:00","max":0,"avg":0,"min":0},{"date":"2021-05-07T00:00-07:00","max":0,"avg":0,"min":0}]}
             * skycon : [{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}]
             * skycon_08h_20h : [{"date":"2021-05-03T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_DAY"},{"date":"2021-05-06T00:00-07:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2021-05-07T00:00-07:00","value":"PARTLY_CLOUDY_DAY"}]
             * skycon_20h_32h : [{"date":"2021-05-03T00:00-07:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2021-05-04T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-05T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-06T00:00-07:00","value":"CLEAR_NIGHT"},{"date":"2021-05-07T00:00-07:00","value":"CLEAR_NIGHT"}]
             * life_index : {"ultraviolet":[{"date":"2021-05-03T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-04T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-05T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-06T00:00-07:00","index":"4","desc":"强"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"中等"}],"carWashing":[{"date":"2021-05-03T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-04T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-05T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-06T00:00-07:00","index":"1","desc":"适宜"},{"date":"2021-05-07T00:00-07:00","index":"1","desc":"适宜"}],"dressing":[{"date":"2021-05-03T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"5","desc":"凉爽"},{"date":"2021-05-06T00:00-07:00","index":"6","desc":"冷"},{"date":"2021-05-07T00:00-07:00","index":"6","desc":"冷"}],"comfort":[{"date":"2021-05-03T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-04T00:00-07:00","index":"6","desc":"凉爽"},{"date":"2021-05-05T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-06T00:00-07:00","index":"9","desc":"寒冷"},{"date":"2021-05-07T00:00-07:00","index":"9","desc":"寒冷"}],"coldRisk":[{"date":"2021-05-03T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-04T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-05T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-06T00:00-07:00","index":"3","desc":"易发"},{"date":"2021-05-07T00:00-07:00","index":"3","desc":"易发"}]}
             */

            private String status;
            private AirQualityBean air_quality;
            private LifeIndexBean life_index;
            private List<AstroBean> astro;
            private List<PrecipitationBean> precipitation;
            private List<TemperatureBean> temperature;
            private List<WindBean> wind;
            private List<HumidityBean> humidity;
            private List<CloudrateBean> cloudrate;
            private List<PressureBean> pressure;
            private List<VisibilityBean> visibility;
            private List<DswrfBean> dswrf;
            private List<SkyconBean> skycon;
            private List<Skycon08h20hBean> skycon_08h_20h;
            private List<Skycon20h32hBean> skycon_20h_32h;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public AirQualityBean getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityBean air_quality) {
                this.air_quality = air_quality;
            }

            public LifeIndexBean getLife_index() {
                return life_index;
            }

            public void setLife_index(LifeIndexBean life_index) {
                this.life_index = life_index;
            }

            public List<AstroBean> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroBean> astro) {
                this.astro = astro;
            }

            public List<PrecipitationBean> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBean> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureBean> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBean> temperature) {
                this.temperature = temperature;
            }

            public List<WindBean> getWind() {
                return wind;
            }

            public void setWind(List<WindBean> wind) {
                this.wind = wind;
            }

            public List<HumidityBean> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBean> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateBean> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBean> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<PressureBean> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureBean> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityBean> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityBean> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfBean> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfBean> dswrf) {
                this.dswrf = dswrf;
            }

            public List<SkyconBean> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBean> skycon) {
                this.skycon = skycon;
            }

            public List<Skycon08h20hBean> getSkycon_08h_20h() {
                return skycon_08h_20h;
            }

            public void setSkycon_08h_20h(List<Skycon08h20hBean> skycon_08h_20h) {
                this.skycon_08h_20h = skycon_08h_20h;
            }

            public List<Skycon20h32hBean> getSkycon_20h_32h() {
                return skycon_20h_32h;
            }

            public void setSkycon_20h_32h(List<Skycon20h32hBean> skycon_20h_32h) {
                this.skycon_20h_32h = skycon_20h_32h;
            }

            public static class AirQualityBean {
                private List<AqiBean> aqi;
                private List<Pm25Bean> pm25;

                public List<AqiBean> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiBean> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25Bean> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25Bean> pm25) {
                    this.pm25 = pm25;
                }

                public static class AqiBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * max : {"chn":0,"usa":0}
                     * avg : {"chn":0,"usa":0}
                     * min : {"chn":0,"usa":0}
                     */

                    private String date;
                    private MaxBean max;
                    private AvgBean avg;
                    private MinBean min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public MaxBean getMax() {
                        return max;
                    }

                    public void setMax(MaxBean max) {
                        this.max = max;
                    }

                    public AvgBean getAvg() {
                        return avg;
                    }

                    public void setAvg(AvgBean avg) {
                        this.avg = avg;
                    }

                    public MinBean getMin() {
                        return min;
                    }

                    public void setMin(MinBean min) {
                        this.min = min;
                    }

                    public static class MaxBean {
                        /**
                         * chn : 0
                         * usa : 0
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }

                    public static class AvgBean {
                        /**
                         * chn : 0.0
                         * usa : 0.0
                         */

                        private double chn;
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }

                    public static class MinBean {
                        /**
                         * chn : 0
                         * usa : 0
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                public static class Pm25Bean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * max : 0
                     * avg : 0.0
                     * min : 0
                     */

                    private String date;
                    private int max;
                    private double avg;
                    private int min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public int getMax() {
                        return max;
                    }

                    public void setMax(int max) {
                        this.max = max;
                    }

                    public double getAvg() {
                        return avg;
                    }

                    public void setAvg(double avg) {
                        this.avg = avg;
                    }

                    public int getMin() {
                        return min;
                    }

                    public void setMin(int min) {
                        this.min = min;
                    }
                }
            }

            public static class LifeIndexBean {
                private List<UltravioletBean> ultraviolet;
                private List<CarWashingBean> carWashing;
                private List<DressingBean> dressing;
                private List<ComfortBean> comfort;
                private List<ColdRiskBean> coldRisk;

                public List<UltravioletBean> getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(List<UltravioletBean> ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public List<CarWashingBean> getCarWashing() {
                    return carWashing;
                }

                public void setCarWashing(List<CarWashingBean> carWashing) {
                    this.carWashing = carWashing;
                }

                public List<DressingBean> getDressing() {
                    return dressing;
                }

                public void setDressing(List<DressingBean> dressing) {
                    this.dressing = dressing;
                }

                public List<ComfortBean> getComfort() {
                    return comfort;
                }

                public void setComfort(List<ComfortBean> comfort) {
                    this.comfort = comfort;
                }

                public List<ColdRiskBean> getColdRisk() {
                    return coldRisk;
                }

                public void setColdRisk(List<ColdRiskBean> coldRisk) {
                    this.coldRisk = coldRisk;
                }

                public static class UltravioletBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * index : 4
                     * desc : 强
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class   CarWashingBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * index : 1
                     * desc : 适宜
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class DressingBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * index : 5
                     * desc : 凉爽
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ComfortBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * index : 6
                     * desc : 凉爽
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ColdRiskBean {
                    /**
                     * date : 2021-05-03T00:00-07:00
                     * index : 3
                     * desc : 易发
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }

            public static class AstroBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * sunrise : {"time":"06:11"}
                 * sunset : {"time":"20:02"}
                 */

                private String date;
                private SunriseBean sunrise;
                private SunsetBean sunset;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunriseBean getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseBean sunrise) {
                    this.sunrise = sunrise;
                }

                public SunsetBean getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetBean sunset) {
                    this.sunset = sunset;
                }

                public static class SunriseBean {
                    /**
                     * time : 06:11
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunsetBean {
                    /**
                     * time : 20:02
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class PrecipitationBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 0.0
                 * min : 0.0
                 * avg : 0.0
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class TemperatureBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 17.16
                 * min : 10.64
                 * avg : 13.34
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class WindBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : {"speed":23.39,"direction":279.92}
                 * min : {"speed":0.75,"direction":335.52}
                 * avg : {"speed":8.7,"direction":271.35}
                 */

                private String date;
                private MaxBeanX max;
                private MinBeanX min;
                private AvgBeanX avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxBeanX getMax() {
                    return max;
                }

                public void setMax(MaxBeanX max) {
                    this.max = max;
                }

                public MinBeanX getMin() {
                    return min;
                }

                public void setMin(MinBeanX min) {
                    this.min = min;
                }

                public AvgBeanX getAvg() {
                    return avg;
                }

                public void setAvg(AvgBeanX avg) {
                    this.avg = avg;
                }

                public static class MaxBeanX {
                    /**
                     * speed : 23.39
                     * direction : 279.92
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class MinBeanX {
                    /**
                     * speed : 0.75
                     * direction : 335.52
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class AvgBeanX {
                    /**
                     * speed : 8.7
                     * direction : 271.35
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }
            }

            public static class HumidityBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 0.85
                 * min : 0.5
                 * avg : 0.72
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class CloudrateBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 1.0
                 * min : 0.0
                 * avg : 0.57
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class PressureBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 100968.26
                 * min : 100735.36
                 * avg : 100785.91
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class VisibilityBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 24.13
                 * min : 18.14
                 * avg : 21.27
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class DswrfBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * max : 962.2
                 * min : 0.0
                 * avg : 181.2
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class SkyconBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * value : PARTLY_CLOUDY_NIGHT
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon08h20hBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * value : CLEAR_DAY
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon20h32hBean {
                /**
                 * date : 2021-05-03T00:00-07:00
                 * value : PARTLY_CLOUDY_NIGHT
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
