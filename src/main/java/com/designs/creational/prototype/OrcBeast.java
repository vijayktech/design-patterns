package com.designs.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
//@ToString
public class OrcBeast extends Beast{

    private final String weapon;

    public OrcBeast(OrcBeast orcBeast){
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }
}
