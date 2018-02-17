package com.kodilla.modul74stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given

        //new countries
        Country poland = new Country("Poland", new BigDecimal("111111"));
        Country sweden = new Country("Sweden", new BigDecimal("111111"));
        Country holand = new Country("Holand", new BigDecimal("111111"));

        Country china = new Country("China", new BigDecimal("111111"));
        Country thailand = new Country("Thailand", new BigDecimal("111111"));

        Country egypt = new Country("Egypt", new BigDecimal("111111"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("111111"));
        Country somalia = new Country("Somalia", new BigDecimal("111111"));

        //new continents
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(sweden);
        europe.addCountry(holand);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(thailand);

        Continent africa = new Continent("Africa");
        africa.addCountry(egypt);
        africa.addCountry(ethiopia);
        africa.addCountry(somalia);

        //new world
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("888888"), result);
    }
}
