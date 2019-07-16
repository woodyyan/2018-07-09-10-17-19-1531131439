package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.";
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
    }
}
