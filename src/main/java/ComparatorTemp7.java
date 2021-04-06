import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTemp7 implements Comparable<ComparatorTemp7> {
    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public ComparatorTemp7(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(ComparatorTemp7 o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return model + " " + manufactureYear + " " + maxSpeed;
    }

    public static void main(String[] args) {
        List<ComparatorTemp7> cars = new ArrayList<>();

        ComparatorTemp7 ferrari = new ComparatorTemp7(1990, "Ferrari 360 Spider", 310);
        ComparatorTemp7 lambo = new ComparatorTemp7(2012, "Lamborghini Gallardo", 290);
        ComparatorTemp7 bugatti = new ComparatorTemp7(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Collections.sort(cars);
        System.out.println(cars);
    }
}