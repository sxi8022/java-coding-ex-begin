package backjoon.bronze.q11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            br.readLine();
            str = br.readLine();
        } catch ( IOException e) {
           throw new RuntimeException("test");
        }

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char chNum = str.charAt(i);
            sum += Character.getNumericValue(chNum);
        }

        System.out.println(sum);
    }
}
