

public class Array {

    public static void main(String[] args) 
    {
        int [] A = {0,3,6,4};
        
        int minValue = A[0];

    try{
        

        for (int i= 0; i < A.length; i++)
        {

            if (A[i+1] < minValue)
            {

                minValue = A[i+1];
                
            
            }  

        System.out.println( "Lower Value :"+ minValue);     

        }
    }
    catch (Exception e){
                        System.out.println("\n Exception caught");
                    }
    }

            

            
}

        


           
        

        

        

        
    
