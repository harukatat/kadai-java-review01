
public class Clock {

    public static void main(String[]args) {
        int seconds = getSeconds (18,32, 47);
        System.out.println(seconds);

    }


    private static int getSeconds (int h, int m, int s) {
        int result =  h * 60 * 60 + m * 60 + s;
        return result;
    }

}
