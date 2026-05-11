package my.work.structural.facade;

public class Battery {

    private boolean isChecked;

    public void check() {
        this.isChecked = true;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

}
