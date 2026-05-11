package my.work.structural.facade;

public class Water {

    private boolean isChecked;

    public Water() {
        this.isChecked = false;
    }

    public void check() {
        this.isChecked = true;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

}
