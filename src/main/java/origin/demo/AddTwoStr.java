package origin.demo;

/**
 * Created by shen.yang on 2017/9/7.
 */
public class AddTwoStr {
   public static String addTwoStr(String str1,String str2){
       //需要一个下标
       int index=0;
       //是否进一位
       int advance =0;
       //每一步输出的结果
       String result="";
       int length1=  str1.length();
       int length2=  str2.length();
       while (index<length1&&index<length2){
          int temp1 = str1.charAt(length1-index-1)-'0';
          int temp2 = str2.charAt(length2-index-1)-'0';
          int temp =temp1+temp2+advance;
          if (temp>=10){
               advance=1;
               temp =temp%10;
           }else {
               advance=0;
           }

           result=temp+result;
           if (length1==length2 && advance==1){
               result="1"+result;
           }
           index++;
       }
       if (index<=length1){
           while (index<length1){
               int temp =str1.charAt(length1-index-1)-'0'+advance;
               if (temp>=10){
                   advance=1;
                   temp =temp%10;
               }else{
                   advance=0;
               }
               result=temp+result;
               if (advance==1&&index==length1){
                   result ="1"+result;
               }
               index++;
           }
       }
       if(index<=length2){
           while (index<length2){
               int temp =str2.charAt(length2-index-1)-'0'+advance;
               if (temp>=10){
                   advance=1;
                   temp =temp%10;
               }else{
                   advance=0;
               }
               result=temp+result;
               if (advance==1&&index==length2){
                   result ="1"+result;
               }
               index++;
           }
       }
       return result;
   }

    public static void main(String[] args) {
        String s = addTwoStr("1", "199");
        System.out.println(s);
    }
}
