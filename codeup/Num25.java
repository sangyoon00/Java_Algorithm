// C언어 별찍기라고 보면됨
import java.util.Scanner;
import java.util.*;
class Num25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.next();
    int len =s.length();
    for(int i=0;i<len;i++){
      System.out.print("["+s.charAt(i));
      for(int j =s.length()-1; j>i;j-- ){
        System.out.print("0");
      }
      System.out.println("]");
    }
  }
}