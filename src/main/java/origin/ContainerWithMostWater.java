package origin;

/* Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container.
 */
public class ContainerWithMostWater {

	/**
	 * 这个是障碍物的体积，也就是所有数字之和
	 * @param height
	 * @return
	 */
	public static int maxArea(int[] height) {
		int len = height.length, low = 0, high = len - 1;
		int maxArea = 0;
		while (low < high) {
			maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));
			if (height[low] < height[high]) {
				low++;
			} else {
				high--;
			}
		}
		return maxArea;
	}

	/**
	 * 求水池容积
	 *  坐标的最大左右边相减就是该坐标点容积
	 1. 从左到右扫描，找出每个坐标的最大左值
	 2. 从右到左扫描，找出每个坐标最大右值
	 3. 累加每个容积。
	 * @param A
	 * @return
	 */
	public static int trap(int[] A) {
		if(A.length<2) return 0;
		int len = A.length;
		int []maxL = new int [len];
		int maxLR = A[0];
		maxL[0] = 0;
		for(int i=1;i<len;i++){
			maxL[i] = maxLR;
			if(A[i]>maxLR)
				maxLR = A[i];
		}
		maxLR = A[len-1];
		int []maxR = new int[len];
		maxR[len-1] = 0;
		int trap = 0;
		for(int i=len-2;i>=0;i--){
			maxR[i] = maxLR;
			int ctrap = Math.min(maxL[i], maxR[i])-A[i];
			if(ctrap>0) trap+=ctrap;
			if(A[i]>maxLR)
				maxLR = A[i];
		}
		return trap;
	}

	public static void main(String[] args) {
		int [] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
		int result = trap(arr);
		System.out.println(result);

	}
}
