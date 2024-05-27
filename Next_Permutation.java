class Solution {
    public void nextPermutation(int[] arr) {
       int i,j;
        //find lowest
        i=arr.length-2;
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }
        //find imediate larger
       j=arr.length-1;
        if(i>=0){
        while(arr[i]>=arr[j])
        j--;
        
        //swap
        System.out.println(i);
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        }
        i++;
        j=arr.length-1;
        while(i<j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++;
        j--;
        }
        
    }
}