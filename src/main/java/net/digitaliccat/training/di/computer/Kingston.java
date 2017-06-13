package net.digitaliccat.training.di.computer;


import net.digitaliccat.training.di.Container;

public class Kingston implements Memory {

    @Override
    public String getSpec() {
        return "Kingston 16GB 2400MHz DDR4";
    }
}
