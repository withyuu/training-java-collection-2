package net.digitaliccat.training.di.computer;

import net.digitaliccat.training.di.Container;


public class IntelCoreI7 implements CPU {

    @Override
    public String getSpec() {
        return "Intel Core i7-7700 Quad-Core Processor, Liquid Cooled";
    }

}
