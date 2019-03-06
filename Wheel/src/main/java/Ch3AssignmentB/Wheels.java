package Ch3AssignmentB;

public class Wheels {
    int wheelCount;
    int tyreSize;


    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }

    public Wheels(int wheelCount, int tyreSize) {
        this.wheelCount = wheelCount;
        this.tyreSize = tyreSize;
    }
    public double pressure() {
        double bar = 0;
        if (tyreSize < 15) {
            bar = 2.5;
        } else {
            bar = 3.0;
        }
        return bar;

    }

}

