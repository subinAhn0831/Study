package Nested;

public class nestedMain {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        // 내부중첩클래스가 static 이면 생성 가능
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.print();

        //OuterClass.printMsg();

    }
}
