package leetcode.demo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/10/18.
 * �򵥵ļ������Ӽ�д��
 */
public class Calculate {

   public static void main(String[] args) {
       Calculate cal = new Calculate();
       cal.handle();

   }

    public  void handle(){
        Scanner sc = new Scanner(System.in);
        String in = sc.next().trim();
        while (!in.equalsIgnoreCase("end")){
           if(in.length()>0){
               BigInteger i =cal(in);
               System.out.println(i);
           }
          in=sc.next().trim();
        }

    }


    private BigInteger cal(String in) {
        BigInteger res=BigInteger.ZERO;
        char opt='+';
        String num ="";//��ϵ�����
        char[] chars = in.toCharArray();
        for (char c :chars){
            //char ���͵�ֵ�Ƚϣ���int������
            if(c>='0'&&c<='9'){
                num+=c;
            }else{
                opt=c;
                if(opt=='+'){
                    res = res.add(new BigInteger(num));
                }else{
                    res = res.subtract(new BigInteger(num));
                }
                num="";
            }
        }
        //��βû�в�����
        if (opt == '+') {
            res = res.add(new BigInteger(num));
        } else {
            res = res.subtract(new BigInteger(num));
        }

        return res;
    }

}
