package org.mani.java8examples.library;

public class CheckTraitHopImpl implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
