package club.vescure.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpUtils {
    public static String getIP() throws IOException {
        URL var0 = new URL("http://checkip.amazonaws.com");
        BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.openStream()));
        return var1.readLine();
    }
}
