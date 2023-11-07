package java8feature.lambdaexpression;

public class LambdaExpression {


    //without lambda expression
    public  void m1(){
        System.out.println("Hello World");
    }



    /*Note :  lambda Expression don't have
            - Access Modifiers
            - return type
            - method name

           ** lambda only & only working with functional interface .
           * functional interface Having Only one abstract Method

      ex-  () -> { System.out.println("Hello World"); };
            (int a , int b) - > { sopl (a+b); } ;
    */



    public static void main(String[] args) {

        // without lambda
        LambdaExpression lambdaExpression = new LambdaExpression();
        lambdaExpression.m1();

        // with functionalInterface & Implementation class
        FunctionalInterfaceImpl functionalInterface = new FunctionalInterfaceImpl();
        functionalInterface.print();


        // Anonymous Class
        FunctionalInterface f1 = new FunctionalInterface() {
            @Override
            public void print() {
                System.out.println("without creating class- I am calling method By  Anonymous Class ");
            }
        };
        f1.print();


        // using lambda
        FunctionalInterface lambda = () -> {
            System.out.println("first Time I am  Using  lambda ");
        };

        lambda.print();
    }
}
