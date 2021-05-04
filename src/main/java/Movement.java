public class Movement {

    private static int MIN_NO = 0;
    private static int MIN_MOVE_NO = 4;

    public boolean isOverFour(int minNum) {
        if (minNum > MIN_NO && minNum < MIN_MOVE_NO) {
            return false;
        }
        return true;
    }

    public boolean goOrStop(int minNum) {
        if (isOverFour(minNum) == false) {
            return false;
        }
        return true;
    }
}
