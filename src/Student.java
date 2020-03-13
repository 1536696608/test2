public class Student {
    private int num;
    private  String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
