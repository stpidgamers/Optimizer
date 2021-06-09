package club.vescure;

public class Optimizer {

    public static String CYAN = "\033[96m";
    public static String GREEN = "\033[92m";
    public static String GRAY = "\033[90m";
    public static String RED = "\033[91m";
    public static String WHITE = "\033[0m";

    public static boolean debug = true;

    public Optimizer(){
        if (debug) {
            System.out.println(CYAN + "Starting The Optimizer (Rat)");
        }
    }
}
