package practice06;

public class Student {
    private String name;
    private int age;
    private int klass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {

        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
    }
}
