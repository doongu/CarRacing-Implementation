package CarRacing;
import java.util.Scanner;
import java.util.ArrayList;

public GameConsole implements GameConsoleInterface{

    @Override
    public void startGame(){
        ArrayList<String> carList = carListScanner();
        String playCount = playCountScanner();
    }

    private ArrayList<String> carListScanner(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carString = scanner.nextLine();
        scanner.close();

        ArrayList<String> carList = carStringToList(carString);

        return carList;
    }

    private ArrayList<String> carStringToList(String carString){
        ArrayList<String> carList = new ArrayList<>();
        String[] carString = carString.split(",");

        carList.addAll(Arrays.asList(carString));
        return carList;
    }

    private Integer playCountScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        Integer playCount = scanner.nextInt();
        scanner.close();

        return playCount;
        }
}