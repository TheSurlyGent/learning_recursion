import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        
        
        
        
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       
        
        
       int Total = myrecursivefuncion(n);
        
        System.out.println("the total number of pins is " + Total);
        
    }

    public static int myrecursivefuncion(int n) {
        if (n == 1){
           return n;
        }
        else{
            return n + myrecursivefuncion(n-1);
            
        }
    }
  
    
}
