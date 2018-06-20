// Implementing the remote interface 
public class ImplExample implements Hello {  
   
   // Implementing the interface method 
   public Bean printMsg() {   
      Bean b = new Bean();
      b.tuples.add("hello");
      System.out.println("This is an example RMI program"+b.tuples.get(0)); 
      
      return b;
   }  
}