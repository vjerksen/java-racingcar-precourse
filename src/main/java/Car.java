public class Car {

    private int carStatus;
    private String carName;

    private Movement movement;

    public Car(int carStatus, String carName) {
        this.carStatus = carStatus;
        this.carName = carName;
        this.movement = new Movement();
    }

    public void carMovement(int inputNo) {
        if (movement.goOrStop(inputNo) == true) {
            this.carStatus++;
        }
    }

    public int getCarStatus() {
        return this.carStatus;
    }

    public String getCarName() {
        return carName;
    }
}
