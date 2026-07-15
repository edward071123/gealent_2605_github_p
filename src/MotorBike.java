public class MotorBike {
    private String plate;
    private String model;

    public MotorBike(String plate, String model) {
        setPlate(plate);
        setModel(model);
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
