package net.digitaliccat.training.di.computer;


import net.digitaliccat.training.di.Container;

public class Computer {

    private Container ioc;

    private Mainboard mainboard;
    private Memory memory;
    private CPU cpu;
    private GraphicModule graphic;
    private Storage storage;

    public Computer(Container ioc) {
        this.ioc = ioc;

        this.mainboard = (Mainboard) this.ioc.get("mainboard");
        this.memory = (Memory) this.ioc.get("memory");
        this.cpu = (CPU) this.ioc.get("cpu");
        this.graphic = (GraphicModule) this.ioc.get("graphic");
        this.storage = (Storage) this.ioc.get("storage");
    }

    public void printSpec() {
        System.out.println("[Mainboard] " + mainboard.getSpec());
        System.out.println("      [CPU] " + cpu.getSpec());
        System.out.println("  [Graphic] " + graphic.getSpec());
        System.out.println("   [Memory] " + memory.getSpec());
        System.out.println("  [Storage] " + storage.getSpec());
    }
}
