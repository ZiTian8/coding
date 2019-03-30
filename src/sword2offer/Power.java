/**
 * @ClassName Power
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/30 10:47
 */
package sword2offer;

import java.util.Scanner;

public class Power {
    private double Power(double base,int e){
        if(base==0&&e<0){
            System.out.println("输入错误");
        }
        boolean flag=false;
        if(e<0){
            flag=true;
            e=-e;
        }
        double result = PowerWithEabs(base,e);
        if(flag){
            result=1/result;
        }
        return result;

    }
    private double PowerWithEabs(double base,int e){
        if(e==0){
            return 1;
        }
        if(e==1){
            return base;
        }
        double result =Power(base,e>>1);
        result=result*result;
        if((e&1)==1){
            result*=base;

        }
        return result;
    }

    public static void main(String[] args) {

        Power p=new Power();
//        System.out.println(2>>1);
//        System.out.println(5&1);


        System.out.println(p.Power(2,-1));
    }
}
