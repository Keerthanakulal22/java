class factorial{
    public int factorial(int n){
     if(n<=1){
         return 1;
     }   
     else{
         return n*factorial(n-1);
     }
    }
}
public class recursion{
    public static void main(String[] args){
        factorial fact=new factorial();
        int number=5;
        int result=fact.factorial(number);
        System.out.println("Factorial of "+ number+" is :"+result);
    }
}