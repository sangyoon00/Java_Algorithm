/*
문자열 시간초과일때는 무조건 buffered
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

class Num84 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] a = br.readLine().split(" ");

    int count = 0;
    for (int i = 0; i < Integer.valueOf(a[0]); i++) {
      for (int j = 0; j < Integer.valueOf(a[1]); j++) {
        for (int k = 0; k < Integer.valueOf(a[2]); k++) {
          bw.write(i + " " + j + " " + k + "\n");
          count++;
        }
      }
    }
    bw.write(String.valueOf(count));
    bw.flush();
  }
}