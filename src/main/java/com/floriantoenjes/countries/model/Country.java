package com.floriantoenjes.countries.model;

public class Country {
    private String name;
    private int population;
    private String capital;
    private String[] languages;

    public Country(String name, int population, String capital, String[] languages) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String[] getLanguages() {
        return languages;
    }
}
