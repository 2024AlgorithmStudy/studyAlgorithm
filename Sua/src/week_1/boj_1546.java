package week_1;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class boj_1546 {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//
//        double arr[] = new double[in.nextInt()];
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextDouble();
//        }
//        in.close();
//
//        double sum = 0;
//        Arrays.sort(arr);
//
//        for(int i = 0; i < arr.length; i++) {
//            sum += ((arr[i] / arr[arr.length-1]) * 100);
//        }
//        System.out.print(sum / arr.length);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.print(sum / arr.length);
    }}


