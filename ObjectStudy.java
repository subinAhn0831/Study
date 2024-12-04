import java.util.Objects;

public class ObjectStudy {
    private String name;
    private int age;

    public ObjectStudy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        // ObjectPrinter printer = new ObjectPrinter();
        ObjectStudy study = new ObjectStudy("subin", 29);

        System.out.println(ObjectPrinter.printObj(study));

    }

    @Override
    public String toString() {
        return "ObjectStudy{" +
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
