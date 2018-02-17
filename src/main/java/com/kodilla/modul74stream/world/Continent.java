package com.kodilla.modul74stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String name;
    List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}
