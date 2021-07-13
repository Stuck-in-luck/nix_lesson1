package com.alevel.homework5.Builder;

import com.alevel.homework5.Builder.Sofa;
import com.alevel.homework5.Builder.SofaBuilder;

public class SofaBuilderImpl implements SofaBuilder {
    Sofa sofa = new Sofa();
    @Override
    public SofaBuilder setWood(String wood) {
        sofa.wood = wood;
        return this;
    }

    @Override
    public SofaBuilder setFabric(String fabric) {
        sofa.fabric = fabric;
        return this;
    }

    @Override
    public SofaBuilder setFoam(String foam) {
        sofa.foam = foam;
        return this;
    }

    @Override
    public Sofa build() {
        return  sofa;
    }
}
