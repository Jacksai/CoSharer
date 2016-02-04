package com.jacksai.cosher;

import com.jacksai.cosher.model.NightOut;
import com.jacksai.cosher.model.Person;
import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person tomek = new Person("Tomasz", "K");
        Person damian = new Person("Damian", "K");
        Person dominik = new Person("Dominik", "W");

        Set<Person> personSet = new HashSet<>();
        personSet.add(tomek);
        personSet.add(dominik);
        personSet.add(damian);

        NightOut nightOut = new NightOut(new LocalDate(2016, 2, 2), personSet);

        CostCalculator costCalculator = new CostCalculator(nightOut);
        costCalculator.calculate();

        System.out.println(costCalculator.getDebtMap());
    }
}
