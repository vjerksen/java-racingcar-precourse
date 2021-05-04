import java.util.ArrayList;
import java.util.Scanner;

public class PlayRacing {

    private Question question;
    private Scanner scanner;
    private CarName carName;
    private RandomNum randomNum;

    public ArrayList<Car> carList;
    public ArrayList<String> carNameList;
    public ArrayList<Car> answers;

    public PlayRacing() {
        this.question = new Question();
        this.carNameList = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.carList = new ArrayList<>();
        this.carName = new CarName();
        this.randomNum = new RandomNum();
    }

    public void play() {
        question.askPutNameQuery();
        this.carNameList = putName();

        makeCarList();

        question.askPutPlayCountQuery();
        int playCount = putCount();

        question.showResultNotice();

        for (int i = 0; i < playCount; i++) {
            totalPlay();
        }

        showWinners(whoIsWinners());
    }

    private ArrayList<String> putName() {
        this.scanner = new Scanner(System.in);
        String nonseparatedStringName = scanner.next();

        return this.carName.separateNameByComma(nonseparatedStringName);
    }

    public void makeCarList() {
        for (String name : this.carNameList) {
            this.carList.add(new Car(0, name));
        }
    }

    private int putCount() {
        this.scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        return count;
    }

    private void totalPlay() {
        int returnRandomNum;
        for (Car car : this.carList) {
            returnRandomNum = this.randomNum.makeRandomNum();
            car.carMovement(returnRandomNum);
        }
        printResult();
    }

    private void printResult() {
        int index = 0;
        for (Car car : this.carList) {
            System.out.println(car.getCarName() + " : " + printBar(index++));
        }
        System.out.println();
    }

    public String printBar(int index) {
        String bars = "";
        for (int i = 0; i <this.carList.get(index).getCarStatus(); i++) {
            bars += "-";
        }
        return bars;
    }

    public ArrayList<Car> whoIsWinners() {
        int maxValue = 0;
        for (Car car : this.carList) {
            maxValue = isMaxValue(car.getCarStatus(), maxValue);
        }

        for (Car car : this.carList) {
            isEqualMaxValue(car, maxValue);
        }
        return this.answers;
    }

    public int isMaxValue(int firstValue, int secondValue) {
        if (firstValue >= secondValue) {
            return firstValue;
        }
        return secondValue;
    }

    public void isEqualMaxValue(Car car, int maxValue) {
        if (car.getCarStatus() == maxValue) {
            this.answers.add(car);
        }
    }

    public void showWinners(ArrayList<Car> winnerCars) {
        String answerString="";
        for (Car car : winnerCars) {
            answerString = answerString + car.getCarName() + ", ";
        }
        System.out.println(answerString.substring(0, answerString.length() - 2) + "가 최종 우승했습니다.");
    }
}
