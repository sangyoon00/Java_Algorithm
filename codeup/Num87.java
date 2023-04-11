import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

class Num87 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
      if (sum >= num) {
        break;
      }
    }
    System.out.println(sum);

  }
}