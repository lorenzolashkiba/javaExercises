public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array3 = new int[m+n];
        // 1,2,3,0,0,0 ---- 2,5,6
        //1
        for (int i = 0; i <m; i++) {

            for (int j = 0; j < n; j++) {

                if( nums1[i]<nums2[j]){
                    System.out.println("1");
                    array3[i] = nums1[i];

                }else System.out.println("2"); array3[i] = nums2[j];
            }

            printArray(array3);
        }

    }

    private void printArray(int[] arr){
        System.out.println(" ------ inizio array ---- \n");
        for(int i = 0;i<arr.length;i++){

            System.out.println(arr[i]+",");
        }
    }

    private void spostaArray(int[] num){

    }


}
