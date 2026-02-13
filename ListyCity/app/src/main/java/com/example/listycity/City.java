package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Creates a new city
     * @param city
     * @param province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name
     * @return
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the province name
     * @return
     */
    String getProvinceName(){
        return this.province;

    }

    /**
     * Two Cities are compared to see if they are the same
     * Two cities are considered the same if they share the same name and province
     * @param o
     * @return
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Hash code
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
