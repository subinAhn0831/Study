package Object;

import java.util.Objects;

public class ObjectStudy {
    private String name;
    private int age;

    public ObjectStudy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        // Object.ObjectPrinter printer = new Object.ObjectPrinter();
        ObjectStudy study = new ObjectStudy("subin", 29);

        System.out.println(ObjectPrinter.printObj(study));

        ImmutableAddress address = new ImmutableAddress("돈암");
        ImmutableAddress address2 = address.add("동선");
        System.out.println(address.toString());
        System.out.println(address2.toString());


    }

    @Override
    public String toString() {
        return "Object.ObjectStudy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 자동생성 equals() > 동등성 비교
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ObjectStudy study = (ObjectStudy) object;
        return age == study.age && Objects.equals(name, study.name);
    }
}
