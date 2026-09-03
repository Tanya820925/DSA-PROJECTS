public class Fibonacci{
// static used for memory management and share the same variable or method of a given class.
    
    
    public static void main(String[] args) {

        int prev1 = 1;
        int prev2 = 0;
        int count;
        int prev3;

       System.out.println(prev2);
       System.out.println(prev1);

       for( count = 0 ; count <20 ; count ++)
       {
        prev3 = prev1+prev2;
        System.out.println(prev3);
        
        prev2 = prev1;
        prev1 = prev3;
        

          }
          
        
      
        
       


        
    }
}
