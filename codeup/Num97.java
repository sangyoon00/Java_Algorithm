import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

class Num97 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[19][19];
    for (int i = 0; i < arr[0].length; i++) {
      for (int j = 0; j < arr[1].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    // 몇개 골라
    int num = sc.nextInt();
    // 고정 좌표 정하기
    for (int i = 0; i < num; i++) {
      // -1 꼭 해줘야한다. 왜냐면 배열은 0부터 인덱스가 들어가기 때문에 ㅇㅋ?
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;

      // X좌표 고정
      for (int j = 0; j < arr.length; j++) {
        if (arr[x][j] == 0)
          arr[x][j] = 1;
        else
          arr[x][j] = 0;
      }
      // Y좌표 고정
      for (int k = 0; k < arr.length; k++) {
        if (arr[k][y] == 0)
          arr[k][y] = 1;
        else
          arr[k][y] = 0;
      }
    }

    // 출력
    for (int a = 0; a < arr.length; a++) {
      for (int b = 0; b < arr.length; b++) {
        System.out.print(arr[a][b] + " ");
      }
      System.out.println();
    }

  }
}
