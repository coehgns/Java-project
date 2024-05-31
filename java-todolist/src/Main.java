import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Todo> todoList = new ArrayList<>();
    static int id = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            printMenu();
            int menu = input.nextInt();
            switch (menu) {
                case 1 :
                    printToDos();
                    break;

                case 2:
                    String des = input.next();
                    addToDo(des);
                    break;

                case 3:
                    int completeId = input.nextInt();
                    completeToDo(completeId);
                    break;
                default:
                    int deleteId = input.nextInt();
                    delToDo(deleteId);
                    break;
            }
        }
    }

    public static void printToDos() {
        for(Todo todo : todoList) {
            System.out.println(todo.toString());
            System.out.println();
        }
    }

    public static void addToDo(String description) {
        Todo todo = new Todo("채도훈", description, id);
        todoList.add(todo);
        id++;
    }

    public static void completeToDo(int id) {
        for(Todo todo : todoList) {
            if(todo.getId() == id) {
                todo.complete();
            }
        }
    }

    public static void delToDo(int id) {
        for(Todo todo : todoList) {
            if(todo.getId() == id) {
                todoList.remove(todo);
                break;
            }
        }
    }



    public static void printMenu() {
        System.out.println("1. todo 출력하기");
        System.out.println("2. todo 추가하기");
        System.out.println("3. todo 완료하기");
        System.out.println("4. todo 삭제하기");
    }
}