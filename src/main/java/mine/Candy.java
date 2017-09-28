package mine;

/**
 * Created by shen.yang on 2017/9/27.
 */
public class Candy {
    public static   int  minCandy(int [] arr){

        int length =arr.length;
        int[] gaparr =new int[length];

        //这里只统计递增的
        for (int i=0;i<length-1;i++){
            int temp =0 ;
            for (int j=i;j<length-1;j++){
                if (arr[j]<=arr[j+1]){
                    break;
                }else{
                    temp++;
                }
            }
            gaparr[i]=temp;
        }
        //然后计算最小蛋糕数，定义一个数组，存储 统计每个位置的最小值
        int [] minCandy =  new  int[length];
        int result =0;//存储最后的结果
        //第一个值
        minCandy[0]=gaparr[0]+1; //这个是因为有多少递减的最小值
        result +=minCandy[0];

        for (int i=1;i<arr.length;i++){
            int left =1;
            //也就是递增逻辑.取出递增逻辑和递增逻辑的较大值
            if (arr[i]>arr[i-1]){
                left=gaparr[i-1]+1;
            }
            //递减规律
            int right = gaparr[i]+1;
            gaparr[i]=Math.max(right,left);
            result+=gaparr[i];
        }
        return  result;
    }

    public static void main(String[] args) {
        int [] arr =new int[]{1,1,3};
        int result = minCandy(arr);
        System.out.println(result);
    }
}
