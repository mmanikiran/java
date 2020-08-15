package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Animal {
    private String species;
    private boolean hop;
    private boolean swim;

    public boolean canHop() {
        return this.hop;
    }
    public boolean canSwim() {
        return this.swim;
    }
    public String toString(){
        return species + ":" + hop + ":" + swim;
    }
}
