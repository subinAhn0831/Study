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
}
