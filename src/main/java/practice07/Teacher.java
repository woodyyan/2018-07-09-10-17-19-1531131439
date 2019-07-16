package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.";
    }
}
