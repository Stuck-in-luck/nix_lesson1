package com.alevel.homework5.Builder;

public class Main {
    public static void main(String[] args) {

        Sofa sofa = new SofaBuilderImpl().setWood("oack").setFabric("Velvet").setFoam("HighDensityFoam").build();
        System.out.println(sofa.toString());    // Creating new sofa and print it out using Builder pattern
    }
}
