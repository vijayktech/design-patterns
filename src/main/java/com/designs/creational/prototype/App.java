package com.designs.creational.prototype;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String args[]){

        var factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfBeast("cleaning"),
                new ElfWarlord("protecting")
                );

        var mage = factory.creatMage();
        var beast = factory.createBeast();
        var warlord = factory.createWarlord();

        log.info(mage.toString());
        log.info(warlord.toString());
        log.info(beast.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcBeast("sword"),
                new OrcWarlord("laser")
        );

        mage = factory.creatMage();
        beast = factory.createBeast();
        warlord = factory.createWarlord();

        log.info(mage.toString());
        log.info(beast.toString());
        log.info(warlord.toString());
    }
}
