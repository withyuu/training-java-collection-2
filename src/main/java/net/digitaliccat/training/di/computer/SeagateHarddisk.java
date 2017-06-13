package net.digitaliccat.training.di.computer;


public class SeagateHarddisk implements Storage {
    @Override
    public String getSpec() {
        return "Seagate 240GB SSD, 1TB HDD";
    }
}
