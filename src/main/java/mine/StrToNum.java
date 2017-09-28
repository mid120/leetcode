package mine;

import java.util.HashMap;

/**
 * Created by shen.yang on 2017/9/7.
 */
public class StrToNum {
    public static int strToNum(String str) {
        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char chr = str.charAt(i);
            int value = (chr - '0') * power(10, length - i - 1);
            result += value;
        }
        return result;
    }

    public static int power(int a, int b) {
        int power = 1;
        for (int c = 0; c < b; c++) {
            power *= a;
        }
        return power;
    }

//    public static void main(String[] args) {
////        int result = strToNum("10250") + strToNum("10");
////        System.out.println(result);
//
//        int [] arr =new int[]{1,1};
//        int  a =++arr[0];
//        System.out.println(arr[0]);
//        System.out.println(a);
//    }

    public static void main(String[] args) throws InterruptedException {

        // get the HashMap object from the method init()
        HashMap<Integer, String> map = init();
        // replace the id 18975 with a new student
        boolean b = map.replace(73654, "Shyra Travis", "123");
        System.out.println(b);
        System.out.println(map.get(73654));
//        if (result != null) {
//            System.out.println("Student " + result
//                    + " has been replaced on the student database");
//        } else {
//            System.out.println("Specified student not found");
//        }

    }

    private static HashMap<Integer, String> init() {
        // declare the HashMap
        HashMap<Integer, String> mapStudent = new HashMap<Integer,String>();
        // put contents to our HashMap
        mapStudent.put(73654, "Shyra Travis");
        mapStudent.put(98712, "Sharon Wallace");
        mapStudent.put(71245, "Leo Batista");
        return mapStudent;
    }
}
