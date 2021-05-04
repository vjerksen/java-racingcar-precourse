import java.util.ArrayList;

public class CarName {

    private static final int MAX_LENGTH = 5;
    private static final int MIN_LENGTH = 0;

    public boolean isNameLengthUnderFive(String carName) {
        if (isUnderFive(carName.length()) == false) {
            return false;
        }
        return true;
    }

    public boolean isUnderFive(int carNameLength) {
        if (carNameLength > MAX_LENGTH || carNameLength < MIN_LENGTH) {
            return false;
        }
        return true;
    }

    public ArrayList<String> separateNameByComma(String carName) {
        String[] stringArray = carName.split(",");
        ArrayList<String> carNameArrayList = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            carNameArrayList.add(stringArray[i]);
        }

        return carNameArrayList;
    }
}