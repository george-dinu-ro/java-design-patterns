package my.work.structural.facade;

public class CarFacade {

    private final Engine engine;

    private final Battery battery;

    private final Oil oil;

    private final Water water;

    public CarFacade(Engine engine, Battery battery, Oil oil, Water water) {
        this.engine = engine;
        this.battery = battery;
        this.oil = oil;
        this.water = water;
    }

    public void rotateKey() {
        battery.check();
        oil.check();
        water.check();

        if (canBeStarted(battery, oil, water)) {
            engine.start();
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public Oil getOil() {
        return oil;
    }

    public Water getWater() {
        return water;
    }

    private boolean canBeStarted(Battery battery, Oil oil, Water water) {
        return (battery.isChecked()
                && oil.isChecked()
                && water.isChecked());
    }

}
