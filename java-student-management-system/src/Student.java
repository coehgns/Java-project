public class Student {
    private final String name;
    private final int classNum;
    private final int score;
    private final int id;
    public Student(String name, int classNum, int score, int id) {
        this.name = name;
        this.classNum = classNum;
        this.score = score;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classNum=" + classNum +
                ", score=" + score +
                ", id=" + id +
                '}';
    }
}
