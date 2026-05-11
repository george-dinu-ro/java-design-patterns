package my.work.structural.decorator;

public abstract class CarDecorator implements Car {

    protected CarDecorator(Car car) {
        this.car = car;
    }

    protected final Car car;

    public Car getOriginalCar() {
        return car;
    }

    public abstract void decorate();

}
