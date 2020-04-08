/**
 * @ClassName baidu
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/24 20:05
 */
package bishi.baidu;

import java.util.Scanner;

public class baidu {
    //棋盘迷宫
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] temp1 = line1.split(" ");
        int n =Integer.valueOf(temp1[0]);
        int m =Integer.valueOf(temp1[1]);
        char[][] pan=new char[n][m];
        for (int i = 0; i < n; i++) {

            pan[i]=sc.nextLine().toCharArray();
        }
        String line2 = sc.nextLine();
        String[] temp2 = line2.split(" ");
        int x =Integer.valueOf(temp2[0])-1;
        int y =Integer.valueOf(temp2[1])-1;
        int out=0;
        char last='0';
        while(x>=0&&x<n&&y>=0&&y<m){

            switch (pan[x][y]){
                case 'N':
                    pan[x][y]='0';
                    x=x-1;
                    last='N';
                    out++;
                    break;
                case 'S':
                    pan[x][y]='0';
                    x=x+1;
                    last='S';
                    out++;
                    break;
                case 'W':
                    pan[x][y]='0';
                    y=y-1;
                    last='W';
                    out++;
                    break;
                case 'E':
                    pan[x][y]='0';
                    y=y+1;
                    last='E';
                    out++;
                    break;
                case '0':
                    pan[x][y]=last;

                    break;
            }

        }
        System.out.println(out);
    }


}
