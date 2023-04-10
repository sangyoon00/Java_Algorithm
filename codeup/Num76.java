//문자 하나 입력 받아서 거기까지 알파벳 출력
import java.util.Scanner;
import java.util.*;
class Num76 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    int num = Integer.valueOf(c);

    for(int i=97;i<=num;i++){
      System.out.println((char)i);
    }
    
    
    
    
  }
}