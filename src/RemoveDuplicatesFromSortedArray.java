/**
 * Created by dumingyu on 2017-03-25.
 */
public class RemoveDuplicatesFromSortedArray {

        public static int removeDuplicates(int[] nums){
            if(nums.length == 0) return 0;

            int index = 1;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] != nums[index-1])
                    nums[index++] = nums[i];
            }
            return index;
        }

        public static void main(String[] args){
            int[] test = {1,2,3,4,5,6,7,8,9,9,10};/*naive test*/
            System.out.println("The new length is : "+removeDuplicates(test));
            System.out.print("The new array is : ");
            for(int i = 0; i < test.length-1; i++){
                System.out.print(test[i]+" ");
            }

        }

}
