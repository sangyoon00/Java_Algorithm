/*배열과 split 통해서 문자열 처리*/

import java.util.Scanner;
import java.util.*;
class Num19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String time[]=sc.next().split("\\.");
    int a= Integer.parseInt(time[0]);
    int b= Integer.parseInt(time[1]);
    int c= Integer.parseInt(time[2]);
    System.out.print(String.format("%04d",a)+"."+String.format("%02d",b)+"."+String.format("%02d",c));
    
  }
}