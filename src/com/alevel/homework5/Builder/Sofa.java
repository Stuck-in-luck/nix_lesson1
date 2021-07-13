package com.alevel.homework5.Builder;

public class Sofa {
    public String wood;
    public String fabric;
    public String foam;


    public Sofa() {
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setFoam(String foam) {
        this.foam = foam;
    }

    @Override
    public String toString() {
        return "Sofa[wood = " + wood + ", fabric = " + fabric + ", foam = " + foam + "]";
    }
}
