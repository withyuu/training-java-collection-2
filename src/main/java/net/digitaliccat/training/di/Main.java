package net.digitaliccat.training.di;


import net.digitaliccat.training.di.computer.*;

public class Main {

    public static void main(String... args) {

        // Define dependencies here
        Container ioc = new Container();
        ioc
                .add("cpu", new IntelCoreI7())
                .add("mainboard", new Z270())
                .add("memory", new Kingston())
                .add("graphic", new GeForceGTX1070())
                .add("storage", new SeagateHarddisk());

        // Also add the computer to the IoC
        ioc.addAsSingleton("computer", new Computer(ioc));

        Computer myCom = (Computer) ioc.get("computer");
        myCom.printSpec();

    }
}
