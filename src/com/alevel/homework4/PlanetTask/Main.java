package com.alevel.homework4.PlanetTask;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet();
        Mercury mercury = new Mercury();
        Venus venus = new Venus();
        Earth earth = new Earth();
        Mars mars = new Mars();

        planet.info();
        mercury.info();
        venus.heat();
        mars.lifeOnPlanet();
        earth.lifeOnPlanet();
        System.out.println(venus.showFFA());
    }
}
