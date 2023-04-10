import java.util.Scanner;
import java.util.*;
class Num27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s[]= sc.next().split("\\.");
    int year = Integer.parseInt(s[0]);
    int month = Integer.parseInt(s[1]);
    int day = Integer.parseInt(s[2]);
    
    System.out.printf("%02d-%02d-%04d",day,month,year);

  }
}