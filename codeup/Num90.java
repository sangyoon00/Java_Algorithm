/*
제곱근 계산 pow(밑, 지수);
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

class Num90 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();
    long result=0;
    result=(long)(a* Math.pow(r,n-1));
    System.out.println(result);
  }
}