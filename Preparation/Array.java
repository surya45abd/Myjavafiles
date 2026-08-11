// public class Array{
//     public static void main(String[] args){
//         int[] nums = {1,2,3,4,5,6,7};
//         int sum = 0;
//         for (int i = 0; i < nums.length; i++){
//             // System.out.println(nums[i]);
//             sum = sum + nums[i];

//         }
//         System.out.println(sum);
//     }
// }


public class Array{
    public static void main(String[] args){
        int[] nums = {07,38,43,36,75,02,32};

        int bignum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > bignum){
                bignum = nums[i];
                // System.out.println(bignum);
            }else{
                // System.out.println(bignum);
            }
        }
        System.out.println("out put is " + bignum);
    }
}


