**java.lang**

- 자바의 기본 라이브러리
- 래퍼클래스, System, Object 등이 있음
- 클래스에 import 문을 쓰지 않아도 자동으로 import 됨

**Object class**

- 자바 모든 클래스의 최상위 클래스
- 부모클래스를 상속받지 않는 클래스들은 자동으로 Object 클래스를 상속받음
- 그래서 클래스의 부모, 부모로 올라가다 보면  최상위는 무조건 Object 클래스임
- 객체 인스턴스가 생성될 때, 한 메모리에 상속중인 클래스도 같이 할당됨(→Object class가 무조건 할당되는것)
- 다형적 참조 가능
    - Object는 모든 객체를 담을 수 있는 클래스이기 때문에 다양한 클래스 객체를 함께 담을 수 있음
    - ex) 하나의 Object 배열에 address class, student class, teacher class 를 같이 담을 수 있음
- 메소드 오버라이딩 활용 불가
    - 각 객체의 기능 활용을 위해서는 다운캐스팅을 해야 함
        
        ex)
        
        ```java
        Dog dog = new Dog();  
        if(obj instance if Dog dog) dog.bark();
        ```
        
자바에서 메소드를 찾을 때, 자식에서부터 먼저 찾으면서 부모로 올라감 → 자식에 오버라이딩 되어있는 메소드가 있을 경우 자식꺼가 출력됨!

**toString()**

- 객체의 인스턴스 정보, 참조값
    
    → 이 값으로는 객체안에 어떤 값이 들어있는지 모름
    
    → 그래서 보통은 toString()을 재정의(오버라이딩) 해서 사용함
