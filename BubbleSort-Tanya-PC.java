// Lowest value to highest value

public class BubbleSort {

    public static void main(String[] args) {
        
        int [] a = {5,9,7,4,6};
         
        try{
            for (int i =0; i<a.length-1; i++){
                for (int j=0; j<a.length-i-1; j++){
                    if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    



                }
            
            }
                 
        }} 
        catch (Exception e){
            System.out.println("\n Exception caught");
        }
        System.out.print("Sorted array is- ");
        for (int i = 0; i < a.length; i++){
            System.out.print( a[i] + " ");

        }
        System.out.println();
        

        

    }
    
}
