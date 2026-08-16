

public class MethodCalling{
    int Addition(int a , int b ){
        return a+b;
    }
    int multiply(int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
        MethodCalling  obj = new MethodCalling();
        int sum = obj.Addition(10, 5);
        int product = obj.multiply(10, 5);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        

    }
}
