package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass(int number) {

        this.number = number;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public Klass() {
        super();
    }

    public void assignLeader(Student student) {
        if (!members.contains(student)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = members.get(0);
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
    }
}
