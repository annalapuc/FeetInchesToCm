public class Main {
    public static void main(String[] args) {
        double cm = calFeetAndInches.calcFeetAndInchesToCentimeters(6, 0);
        if (cm < 0.0) {
            System.out.println("Invalid parameters");
        }
        calFeetAndInches.calcFeetAndInchesToCentimeters(100);
    }
}
