package com.alevel.homework5.Builder;

public interface SofaBuilder {
    Sofa build();
    SofaBuilder setWood(String wood);
    SofaBuilder setFabric(String fabric);
    SofaBuilder setFoam(String foam);
}
