package main.java.question7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Question7 {
    public class seven {
        public void readStream()
                throws IOException, URISyntaxException {

            String str = "";
            URLConnection conn
                    = new URL("https://blog.knoldus.com/").openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

            while (br.readLine() != null) {
                str += br.readLine();
            }

        }

    }

}
