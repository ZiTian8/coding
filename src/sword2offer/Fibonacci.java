/**
 * @ClassName Fibonacci
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/28 19:41
 */
package sword2offer;

public class Fibonacci {
    public int Fibonacci(int n) {
        if(n<2){
            return n;
        }else{
            int i=n-1;
            int a=0;
            int b=1;
            while(i!=0){
                int temp=a;
                a=b;
                b=b+temp;
                i--;
            }
            return b;

        }
    }

    public static void main(String[] args) {
        Fibonacci f= new Fibonacci();
        System.out.println(f.Fibonacci(4));
    }
}
