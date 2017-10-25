package origin;
/* Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
/* TLE
 * 
 */
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr ={0,1,1};
       Long start =System.currentTimeMillis();
        boolean b = containsDuplicate(arr);
        System.out.println(System .currentTimeMillis()-start);
        System.out.println(b);
    }

}
