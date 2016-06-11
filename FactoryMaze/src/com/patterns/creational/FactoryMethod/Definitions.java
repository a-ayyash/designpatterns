package com.patterns.creational.FactoryMethod;

enum Spells {
    WATER_SHIELD("Water Shield");

    private final String description;

    Spells(final String key) {
        this.description = key;
    }
    public String getString() {
        return description;
    }
}

