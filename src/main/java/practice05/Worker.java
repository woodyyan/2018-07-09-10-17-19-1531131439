package practice05;

public class Worker {
    private String name;
    private int age;

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

    public Worker(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Worker. I have a job.";
    }
}
