package array_and_linkedList;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class array {
    /**
     * 随机取一个数
     * @param nums
     * @return
     */
    static int randomAccess(int[] nums){
        int randomIndex = ThreadLocalRandom.current().nextInt(0,nums.length);
        return nums[randomIndex];
    }

    /**
     * 插入一个数据
     * @param nums
     * @param num
     * @param index
     */
    static void insert(int[] nums,int num,int index){
        for (int i = nums.length-1; i > index; i--){
            nums[i] = nums[i-1];
        }
        nums[index] = num;
    }

    /**
     * 删除元素
     * @param nums
     * @param index
     */
    static void remove(int[] nums,int index){
        for (int i = index; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
    }

    /**
     * 查找元素
     * @param nums
     * @param target
     * @return
     */
    static int find(int[] nums,int target){
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    /**
     * 扩容数组
     * @param nums
     * @param enlarge
     * @return
     */
    static int[] extend(int[] nums, int enlarge) {
        int[] res = new int[nums.length + enlarge];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,9,7,5};
        System.out.println(randomAccess(arr));
        System.out.println(randomAccess(arr));

        insert(arr,11,2);
        System.out.println(Arrays.toString(arr));

        remove(arr,2);
        System.out.println(Arrays.toString(arr));

        System.out.println(find(arr, 7));
        System.out.println(find(arr, 8));

        System.out.println(Arrays.toString(extend(arr, 5)));
    }
}
