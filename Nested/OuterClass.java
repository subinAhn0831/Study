package Nested;

public class OuterClass {

    private int num1 = 1;
    private static int num2 = 2;

    static class InnerClass {
        void print(){
            System.out.println(num2); // num2는 static 이므로 접근 가능
        }
    }

    static void printMsg() {
        System.out.println("statc test");
    }

    static void callMethod() {
        printMsg(); // static은 static 만 호출 가능
    }
}
