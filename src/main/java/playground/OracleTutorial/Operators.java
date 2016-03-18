package playground.OracleTutorial;


public class Operators {

    public static void main(String[] args) {


        double da = 100.0;
        double db = 35.0;

        float fa = 100;
        float fb = 35;

        int a = 100;
        int b = 21;

        byte n = 127; //max
        byte nn = -128; //min
        byte m = 'A';
        byte k = -45;

        short s = 32767;//max
        short ns = -32768; //min

        int ab = a * b; //3500
        int ba = a / b; //2
        float fab = fa / fb; //2.857143
        double dab = da / db; //2.857142857142857
        int mab = a % b; //16
        int z = a + b / mab; //101
        double dz = da + db / mab; //102.1875



        System.out.println(dz);

    }
}
