package backjoon.bronze.q1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0;
        double max = 0;

        for (int i = 0; i < N; i++) {
            double score = Double.parseDouble(st.nextToken());
            sum += score;
            if (score > max) {
                max = score;
            }
        }

        double result = (sum / max) * 100 / N;
        System.out.println(result);
    }
}
