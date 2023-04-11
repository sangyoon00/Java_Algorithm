import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W=sc.nextInt();
    int H=sc.nextInt();
    int[][] arr = new int[H+1][W+1];
    int n=sc.nextInt();
    
    for(int i=0;i<n;i++){

      //input 데이터 입력
      int l=sc.nextInt();
      int d=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();


      for (int j=0; j<l; j++) {
				if (d == 0) // 가로
					arr[x][y+j] = 1;
				else
					arr[x+j][y] = 1;
			}
    }
    
    for(int i=1;i<H+1;i++){
      for(int j=1;j<W+1;j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}