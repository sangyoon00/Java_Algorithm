// 문자열을 입력받아서 한글자씩 출력하기
import java.util.Scanner;
import java.util.*;
class Num24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.next();
    int len =s.length();
    for(int i=0;i<len;i++){
      System.out.println("\'"+s.charAt(i)+"\'");
    }
    
  }
}