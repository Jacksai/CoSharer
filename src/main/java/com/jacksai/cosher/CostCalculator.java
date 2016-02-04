package com.jacksai.cosher;

import com.jacksai.cosher.model.NightOut;
import com.jacksai.cosher.model.Person;

import java.util.HashMap;
import java.util.Map;

public class CostCalculator {

    private NightOut nightOut;
    private Map<Person, Map<Person, Double>> debtMap = new HashMap<>();

    public CostCalculator(NightOut nightOut) {
        this.nightOut = nightOut;
    }

    public Map<Person, Map<Person, Double>> getDebtMap() {
        return debtMap;
    }

    public void calculate() {

    }

}
