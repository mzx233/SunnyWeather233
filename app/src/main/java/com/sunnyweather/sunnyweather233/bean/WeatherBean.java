package com.sunnyweather.sunnyweather233.bean;

import java.util.List;

public class WeatherBean {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : -25200
     * timezone : America/Los_Angeles
     * server_time : 1620032724
     * location : [37.7648,-122.463]
     * result : {"realtime":{"status":"ok","temperature":10.88,"humidity":0.84,"cloudrate":0,"skycon":"CLEAR_NIGHT","visibility":24.13,"dswrf":0,"wind":{"speed":2.83,"direction":303.86},"pressure":100755.97,"apparent_temperature":10.3,"precipitation":{"local":{"status":"ok","datasource":"gfs","intensity":0}},"air_quality":{"pm25":13.6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":19,"usa":54},"description":{"chn":"优","usa":"良"}},"life_index":{"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":8,"desc":"很冷"}}},"primary":0}
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
         * realtime : {"status":"ok","temperature":10.88,"humidity":0.84,"cloudrate":0,"skycon":"CLEAR_NIGHT","visibility":24.13,"dswrf":0,"wind":{"speed":2.83,"direction":303.86},"pressure":100755.97,"apparent_temperature":10.3,"precipitation":{"local":{"status":"ok","datasource":"gfs","intensity":0}},"air_quality":{"pm25":13.6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":19,"usa":54},"description":{"chn":"优","usa":"良"}},"life_index":{"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":8,"desc":"很冷"}}}
         * primary : 0
         */

        private RealtimeBean realtime;
        private int primary;

        public RealtimeBean getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeBean realtime) {
            this.realtime = realtime;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public static class RealtimeBean {
            /**
             * status : ok
             * temperature : 10.88
             * humidity : 0.84
             * cloudrate : 0.0
             * skycon : CLEAR_NIGHT
             * visibility : 24.13
             * dswrf : 0.0
             * wind : {"speed":2.83,"direction":303.86}
             * pressure : 100755.97
             * apparent_temperature : 10.3
             * precipitation : {"local":{"status":"ok","datasource":"gfs","intensity":0}}
             * air_quality : {"pm25":13.6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":19,"usa":54},"description":{"chn":"优","usa":"良"}}
             * life_index : {"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":8,"desc":"很冷"}}
             */

            private String status;
            private double temperature;
            private double humidity;
            private double cloudrate;
            private String skycon;
            private double visibility;
            private double dswrf;
            private WindBean wind;
            private double pressure;
            private double apparent_temperature;
            private PrecipitationBean precipitation;
            private AirQualityBean air_quality;
            private LifeIndexBean life_index;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public String getSkycon() {
                return skycon;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getDswrf() {
                return dswrf;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getApparent_temperature() {
                return apparent_temperature;
            }

            public void setApparent_temperature(double apparent_temperature) {
                this.apparent_temperature = apparent_temperature;
            }

            public PrecipitationBean getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(PrecipitationBean precipitation) {
                this.precipitation = precipitation;
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

            public static class WindBean {
                /**
                 * speed : 2.83
                 * direction : 303.86
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

            public static class PrecipitationBean {
                /**
                 * local : {"status":"ok","datasource":"gfs","intensity":0}
                 */

                private LocalBean local;

                public LocalBean getLocal() {
                    return local;
                }

                public void setLocal(LocalBean local) {
                    this.local = local;
                }

                public static class LocalBean {
                    /**
                     * status : ok
                     * datasource : gfs
                     * intensity : 0.0
                     */

                    private String status;
                    private String datasource;
                    private double intensity;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }
                }
            }

            public static class AirQualityBean {
                /**
                 * pm25 : 13.6
                 * pm10 : 0.0
                 * o3 : 0.0
                 * so2 : 0.0
                 * no2 : 0.0
                 * co : 0.0
                 * aqi : {"chn":19,"usa":54}
                 * description : {"chn":"优","usa":"良"}
                 */

                private double pm25;
                private double pm10;
                private double o3;
                private double so2;
                private double no2;
                private double co;
                private AqiBean aqi;
                private DescriptionBean description;

                public double getPm25() {
                    return pm25;
                }

                public void setPm25(double pm25) {
                    this.pm25 = pm25;
                }

                public double getPm10() {
                    return pm10;
                }

                public void setPm10(double pm10) {
                    this.pm10 = pm10;
                }

                public double getO3() {
                    return o3;
                }

                public void setO3(double o3) {
                    this.o3 = o3;
                }

                public double getSo2() {
                    return so2;
                }

                public void setSo2(double so2) {
                    this.so2 = so2;
                }

                public double getNo2() {
                    return no2;
                }

                public void setNo2(double no2) {
                    this.no2 = no2;
                }

                public double getCo() {
                    return co;
                }

                public void setCo(double co) {
                    this.co = co;
                }

                public AqiBean getAqi() {
                    return aqi;
                }

                public void setAqi(AqiBean aqi) {
                    this.aqi = aqi;
                }

                public DescriptionBean getDescription() {
                    return description;
                }

                public void setDescription(DescriptionBean description) {
                    this.description = description;
                }

                public static class AqiBean {
                    /**
                     * chn : 19.0
                     * usa : 54.0
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

                public static class DescriptionBean {
                    /**
                     * chn : 优
                     * usa : 良
                     */

                    private String chn;
                    private String usa;

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

                    public String getUsa() {
                        return usa;
                    }

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }
                }
            }

            public static class LifeIndexBean {
                /**
                 * ultraviolet : {"index":0,"desc":"无"}
                 * comfort : {"index":8,"desc":"很冷"}
                 */

                private UltravioletBean ultraviolet;
                private ComfortBean comfort;

                public UltravioletBean getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(UltravioletBean ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public ComfortBean getComfort() {
                    return comfort;
                }

                public void setComfort(ComfortBean comfort) {
                    this.comfort = comfort;
                }

                public static class UltravioletBean {
                    /**
                     * index : 0.0
                     * desc : 无
                     */

                    private double index;
                    private String desc;

                    public double getIndex() {
                        return index;
                    }

                    public void setIndex(double index) {
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
                     * index : 8
                     * desc : 很冷
                     */

                    private int index;
                    private String desc;

                    public int getIndex() {
                        return index;
                    }

                    public void setIndex(int index) {
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
        }
    }
}
