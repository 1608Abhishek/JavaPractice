import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int a[]={5,8,3,1};
        //bubble sort 
        for (int i=0;i<a.length-1;i++)
        {
        for (int j=0;j<a.length-1-i;j++){
            if (a[j]>a[j+1]) {
               int temp= a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
