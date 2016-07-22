package com.floriantoenjes.countries.data;

import com.floriantoenjes.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = new ArrayList<>(Arrays.asList(
            new Country("Albania", 2_800_138, "Tirana", new String[]{"Albanian"}),
            new Country("Cameroon", 20_549_221, "Yaoundé", new String[]{"French", "English"}),
            new Country("Italy", 60_665_551, "Rome", new String[]{"Italian"}),
            new Country("Malaysia", 28_334_135, "Kuala Lumpur", new String[]{"Malaysian"}),
            new Country("Romania", 19_870_000, "Bukarest", new String[]{"Romanian"})
            ));

    public static List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public static Country findByName(String name) {
        return ALL_COUNTRIES.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }
}
