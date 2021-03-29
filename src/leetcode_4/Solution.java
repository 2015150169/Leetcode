package leetcode_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:Solution
 * @DATE:2021/3/2821:19
 **/
public class Solution {

    public static void main(String[] args) {
        int[] arr = {3};
        int[] arr1 = {-2,-1};

        System.out.println(findMedianSortedArrays(arr,arr1));
    }

    public static void merge(int[] arr,int low,int mid,int high,int[] tmp){
        int i = 0;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= high){
            if(arr[j] < arr[k]){
                tmp[i++] = arr[j++];
            }else{
                tmp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = arr[j++];
        }

        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }

    public static void mergeSort(int[] arr,int low,int high,int[] tmp){
        if(low<high){
            int mid = (low+high)/2;
            merge(arr,low,mid,high,tmp);    //合并两个有序序列
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        integers.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        int[] num3 =  integers.stream().mapToInt(i->i).toArray();
        int[] tmp = new int[num3.length];    //新建一个临时数组存放
        mergeSort(num3,0,num3.length-1,tmp);
        System.out.println(num3[num3.length/2]);
        return num3.length % 2 == 0 ? (double)(num3[num3.length/2 - 1] + num3[num3.length/2]) / 2 : (double)num3[num3.length/2];
    }

}
