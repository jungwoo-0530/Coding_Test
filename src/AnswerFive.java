import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * fileName     : AnswerFive
 * author       : jungwoo
 * description  :
 */
public class AnswerFive {
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, -1, 1};
  public static int n = 10, m = 10;
  public static int[][] map;
  public static boolean[][] visited;


  public static int[][] bfs(int x, int y) {
    int[][] temp = new int[n][m];
    for(int i = 0; i < map.length; i++){ // 반복문 + ArrayCopy
      System.arraycopy(map[i], 0, temp[i], 0, temp[i].length);
    }
    Queue<Integer> qX = new LinkedList<>();
    Queue<Integer> qY = new LinkedList<>();
    qX.add(x);
    qY.add(y);

    while(!qX.isEmpty() && !qY.isEmpty()) {
      x = qX.poll();
      y = qY.poll();

      boolean flag = true;
      visited[x][y] = true;

      for(int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if(nx >= 0 && ny >= 0 && nx < n && ny < m ) {
          if(!visited[nx][ny]){
            qX.add(nx);
            qY.add(ny);
          }
          if (temp[x][y] > temp[nx][ny] || temp[nx][ny] == 0) {
            flag = false;
          }
        }
      }
      if (flag) {
        temp[x][y] += 1;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    map = new int[n][m];
    visited = new boolean[n][m];

    for(int i = 0; i < n; i++) {
      String temp = sc.nextLine();
      String[] node = temp.split("\\s");
      for(int j = 0; j < m; j++) {
        map[i][j] = node[j].charAt(0)-48;
      }
    }


    while (true) {
      int[][] arr = bfs(0,0);
      if(Arrays.deepEquals(map, arr)){
        break;
      }
      for(int i = 0; i<map.length; i++){
        Arrays.fill(visited[i], false);
      }
      map = arr;

    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }

  }
}

