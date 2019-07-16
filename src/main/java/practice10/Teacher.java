package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Collection<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public boolean isTeaching(Student student) {
        return this.getClasses().contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        if (this.getClasses().contains(student.getKlass())) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
        }
    }

    @Override
    public String introduce() {
        if (this.getClasses().size() > 0)
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.";
        return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
    }
}
