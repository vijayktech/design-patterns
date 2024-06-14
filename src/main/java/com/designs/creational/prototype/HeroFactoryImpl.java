package com.designs.creational.prototype;

import lombok.RequiredArgsConstructor;

/**
 * Concrete factory class.
 */
@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory{

    private final Mage mage;
    private final Beast beast;
    private final Warlord warlord;
    @Override
    public Mage creatMage() {
        return mage.copy();
    }

    @Override
    public Warlord createWarlord() {
        return warlord.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}
