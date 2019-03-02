public class calFeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double foot, double inch) {
        if (foot >= 0 && (inch >= 0 && inch <= 12)) {
            double cm = foot * 12 * 2.54 + inch * 2.54;
            System.out.println(foot + " feet, " + inch + " inches = " + cm + " cm");
            return cm;

        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inch) {
        if (inch >= 0) {
            double foot = (int) inch / 12;
            double remainingInches = (int) inch % 12;
            System.out.println(inch + " inches is equal " + foot + "feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(foot, remainingInches);
        } else {
            return -1;
        }
    }
    // public static double calcFeetAndInchesToCentimeteres(int feetInInch){

    //}

}
