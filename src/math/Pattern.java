package math;

public class Pattern {

    public static void main(String[] args) {

        int countFrom = 100;
        int subBy = 1;
        int iteration = 0;
        int i = 0;

        while (countFrom >= 0) {
            if ((i + 1) % 10 == 0) {
                iteration+=1;
            }
            System.out.println(countFrom);
            countFrom = (countFrom - (subBy + iteration));
            i += 1;
        }
    }
}