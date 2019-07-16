package practice09;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass != null && klass.getLeader() != null && this.equals(klass.getLeader())) {
            return "My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.";
        }
        return "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
    }
}
