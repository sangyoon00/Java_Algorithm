import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

class Num91 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();
    long result = a;
    for(int i=1;i<n;i++){
      result=result*m+d;
    }
    System.out.println(result);
  }
}