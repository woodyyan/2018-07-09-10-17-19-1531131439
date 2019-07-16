package practice10;

public class Student extends Person {
    private Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.getKlass() != null && this.getKlass().getLeader() != null && this.getKlass().getLeader().equals(this)) {
            return "My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.";
        }
        return "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
    }
}
