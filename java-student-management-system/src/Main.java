import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> studentList = new ArrayList<>();
    static int id = 1;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            if(studentList.isEmpty()) id = 1;
            printMenu();
            int menu = input.nextInt();


            switch (menu) {
                case 1:
                    String stuName = input.next();
                    int stuClassNum = input.nextInt();
                    int stuScore = input.nextInt();
                    addStudent(stuName, stuClassNum, stuScore);
                    break;
                case 2:
                    int selectStuId = input.nextInt();
                    printStudents(selectStuId);
                    break;
                case 3:
                    int stuId = input.nextInt();
                    deleteStudent(stuId);
                    break;
                case 4:
                    allStudents();
                    break;
                default:
                    int changeId = input.nextInt();
                    editStuInfo(changeId);
                    break;
            }
        }
    }

    public static void addStudent(String name, int classNum, int score) {
        Student student = new Student(name, classNum, score, id);
        studentList.add(student);
        id++;
    }

    public static void printStudents(int id) {
        for(Student student : studentList) {
            if(student.getId() == id) {
                System.out.println(student);
                System.out.println();
            }
        }
    }

    public static void deleteStudent(int id) {
        for(Student student : studentList) {
            if(student.getId() == id) { studentList.remove(student); }
            break;
        }
    }

    public static void allStudents() {
        for(Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void editStuInfo(int id) {
        for(Student student : studentList) {
            if(student.getId() == id) {
                deleteStudent(id);
                String changeName = input.next();
                int changeClassNum = input.nextInt();
                int changeScore = input.nextInt();
                addStudent(changeName, changeClassNum, changeScore);
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. 학생 등록");
        System.out.println("2. 학생 정보 조회");
        System.out.println("3. 학생 정보 삭제");
        System.out.println("4. 모든 학생 목록 출력");
        System.out.println("5. 학생 정보 수정");
    }
}