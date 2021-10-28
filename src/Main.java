import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] cars = new String[2];
        cars[0] = "bmw";
        cars[1] = "audi";
        ArrayList<String> carsList = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            carsList.add(cars[i]);
        }

        System.out.println(carsList.size());
    }
}
