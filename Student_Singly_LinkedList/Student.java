package Student_Singly_LinkedList;

public class Student {
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return name + " : " + grade;
    }
}
