/*
Firstly i approch in the way, using Array.sort(),arrayscopy(),it increases the Run time complexity of "5ms"
After this approch the RT reduce to "1ms".



*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int n,index=0,n1=nums1.length,n2=nums2.length;
        int arr[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<=n1&&j<=n2){
        if(i==n1){
            while(j<n2){
                arr[k++]=nums2[j++];
            }
            break;
        }else if(j==n2){
            while(i<n1){
                arr[k++]=nums1[i++];
            }
            break;
        }

            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        
        n=arr.length;
        if(n%2==0){
median=(double)(arr[n/2]+arr[n/2-1])/2;
        }else{
median=arr[(int)n/2];
        }


        return median;
    }
}