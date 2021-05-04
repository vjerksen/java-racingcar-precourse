import java.util.Random;

public class RandomNum {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 9;

    Random randomMaker = new Random(System.currentTimeMillis());

    public boolean checkRandomNum(int inputNo) {
        return (inputNo >= MIN_VALUE && inputNo <= MAX_VALUE);
    }

    public int makeRandomNum() {
        int num = randomMaker.nextInt(10);
        if (checkRandomNum(num) == false) {
            return -1;
        }
        return num;
    }
}
