package com.sunnyweather.sunnyweather233.bean;

import java.util.List;

public class AdressBean {

    /**
     * status : ok
     * query : a
     * places : [{"id":"country.9654124497801190","location":{"lat":-36.252002,"lng":-63.954193},"place_id":"mb-country.9654124497801190","name":"阿根廷","formatted_address":"阿根廷"},{"id":"country.9968792518346070","location":{"lat":-25.7349684916,"lng":134.489562607},"place_id":"mb-country.9968792518346070","name":"澳大利亚","formatted_address":"澳大利亚"},{"id":"region.11450320215359250","location":{"lat":32.828865808,"lng":-86.7892920871},"place_id":"mb-region.11450320215359250","name":"美国亚拉巴马州","formatted_address":"亚拉巴马州"},{"id":"region.9522999891724140","location":{"lat":34.2202611707,"lng":-111.4221279891},"place_id":"mb-region.9522999891724140","name":"美国亚利桑那州","formatted_address":"亚利桑那州"},{"id":"place.7559383632856290","location":{"lat":39.86667,"lng":32.86667},"place_id":"mb-place.7559383632856290","name":"土耳其安卡拉","formatted_address":"安卡拉"}]
     */

    private String status;
    private String query;
    private List<PlacesBean> places;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<PlacesBean> getPlaces() {
        return places;
    }

    public void setPlaces(List<PlacesBean> places) {
        this.places = places;
    }

    public static class PlacesBean {
        /**
         * id : country.9654124497801190
         * location : {"lat":-36.252002,"lng":-63.954193}
         * place_id : mb-country.9654124497801190
         * name : 阿根廷
         * formatted_address : 阿根廷
         */

        private String id;
        private LocationBean location;
        private String place_id;
        private String name;
        private String formatted_address;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public static class LocationBean {
            /**
             * lat : -36.252002
             * lng : -63.954193
             */

            private double lat;
            private double lng;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }
        }
    }
}
