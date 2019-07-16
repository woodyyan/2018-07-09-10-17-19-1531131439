package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == 0) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.";
    }
}
