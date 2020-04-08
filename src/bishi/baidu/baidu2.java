/**
 * @ClassName baidu2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/24 20:41
 */
package bishi.baidu;

import java.math.BigInteger;
import java.util.Scanner;

public class baidu2 {

    public static BigInteger karatsuba(BigInteger num1, BigInteger num2) {
        if (num1.compareTo(BigInteger.valueOf(10)) < 0 || num2.compareTo(BigInteger.valueOf(10)) < 0) {
            return num1.multiply(num2);
        }

        int n = Math.max(num1.toString().length(), num2.toString().length());
        int halfN = n / 2 + n % 2;  //另一种划分方法

        //返回num1 / halfN 和 num1 % halfN
        BigInteger[] a_b = num1.divideAndRemainder(BigInteger.valueOf(10).pow(halfN));
        BigInteger a = a_b[0];
        BigInteger b = a_b[1];
        BigInteger[] c_d = num2.divideAndRemainder(BigInteger.valueOf(10).pow(halfN));
        BigInteger c = c_d[0];
        BigInteger d = c_d[1];

        BigInteger step1 = karatsuba(a, c);
        BigInteger step2 = karatsuba(b, d);
        BigInteger step3 = karatsuba(a.add(b), c.add(d));
        BigInteger step4 = step3.subtract(step2).subtract(step1);   //step3-step2-step1
        BigInteger res = step1.multiply(BigInteger.valueOf(10).pow(2*halfN)).add(step2)
                .add(step4.multiply(BigInteger.valueOf(10).pow(halfN)));

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in=sc.nextLine();
        String[] str= in.split(" ");
        BigInteger num1=new BigInteger(str[0]);
        BigInteger num2=new BigInteger(str[1]);
        BigInteger num3=new BigInteger(str[2]);

        BigInteger num=karatsuba(num1,num2);
        num=karatsuba(num,num3);
        String s = String.valueOf(num);
        BigInteger out=new BigInteger("0");
        for (int i = 0; i < s.length(); i++) {

            out=out.add(new BigInteger(String.valueOf(s.charAt(i)-48)));
        }
        System.out.println(out);
    }

}
