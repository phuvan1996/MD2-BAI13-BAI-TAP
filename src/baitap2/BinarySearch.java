package baitap2;

public class BinarySearch {
    public int getMid(int array[],int low,int high,int key){
        if (high>low){
            int mid =low+(high-low)/2;
            if (array[mid]==key)
                return mid;
            if (array[mid]>key)
                return getMid(array,key,low,mid - 1);
            return getMid(array,key,mid+1,high);
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        int arr[] = {2,3,4,5,6,7,8,9};
        int n = arr.length;
        int x =55;
        int result = bs.getMid(arr,0,n-1,x);
        if (result==-1)
            System.out.println("phan tu khong ton tai");
        else
            System.out.println("phan tu duoc tim thay tai vi tri: "+result);
    }
}
