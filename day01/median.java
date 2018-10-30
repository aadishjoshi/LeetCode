/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays.

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

*/
import java.util.*;
import java.lang.*;

class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l3 = l1 + l2;

        int res [] = new int[l3];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < l1 && j<l2){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
                k++;
            }else{
                res[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        while(i != l1){
            res[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j != l2){
            res[k] = nums2[j];
            j++;
            k++;
        }
        

        int mi = (int)(l3/2);
        double medianIndex;
        if(l3 %2 == 1){
            medianIndex = res[mi];            
        }else{
            medianIndex = ((res[mi-1] + res[mi]) /(double) 2);
        }
        return medianIndex;
    }

    public static void main(String args[]){
        int nums1[] = new int[]{1,2};
        int nums2[] = new int[]{3,4};
        System.out.println(" "+findMedianSortedArrays(nums1,nums2));
    }
}