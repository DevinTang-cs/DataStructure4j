package array_and_linkedList;

import java.util.*;

public class list {
    public static void main(String[] args) {

//        List<Integer> nums1 = new ArrayList<>();

        Integer[] numbers = new Integer[] {1,3,2,5,4,8};
        List<Integer> nums = new ArrayList<>(Arrays.asList(numbers));

        int num = nums.get(1);
        System.out.println(num);

        nums.set(2,4);
        System.out.println(nums);

        nums.clear();
        System.out.println(nums);

        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        System.out.println(nums);

        nums.add(2,3);
        System.out.println(nums);

        nums.remove(3);
        System.out.println(nums);

        for (int i=0;i<nums.size();i++){
            System.out.print(nums.get(i));
        }

        System.out.println();

        for (int n : nums){
            System.out.print(n);
        }

        System.out.println();

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,5,9,6,7));
        System.out.println(nums.addAll(nums1));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
