package other.algrithm.sort;

/**
 * @author shkstart
 * @date 7/22/2019 - 8:22 AM
 */
public class BubbleSort {
    public static void main(String[] args) {
 int[] a = {23,1,34,21,46,55,32,43};
 int i,j;
 for(i=0;i<a.length-1;i++){
     for(j=0;j<a.length-i-1;j++){
         if(a[j]>a[j+1]){
             int temp;
             temp = a[j];
             a[j] = a[j+1];
             a[j+1] = temp;
         }
     }
 }
        for (int i1:a
             ) {
            System.out.print(i1+" ");
        }
    }
}

