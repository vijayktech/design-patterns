package com.designs.creational.prototype;

public interface HeroFactory {
    Mage creatMage();
    Warlord createWarlord();
    Beast createBeast();
}
