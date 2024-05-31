import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<PhoneNumber> phoneNumbers = new ArrayList<>();
    static int id = 1;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while(true) {
            if(phoneNumbers.isEmpty()) id = 1;
            printMenu();

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("이름, 연락처, 이메일 순서로 입력해주세요.");
                    String named = input.next();
                    int telNum = input.nextInt();
                    String mail = input.next();
                    System.out.println("id " + id + "번의 연락처 정보가 추가되었습니다.");
                    System.out.println();
                    addPhoneNum(named, telNum, mail);
                    break;
                case 2:
                    System.out.println("조회할 연락처의 id를 입력해주세요.");
                    int selectId = input.nextInt();
                    System.out.println("id " + selectId + "번의 연락처 정보입니다.");
                    selectPhoneNums(selectId);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("수정할 연락처의 id를 입력해주세요.");
                    int editId = input.nextInt();
                    editPhoneNum(editId);
                    System.out.println("id " + editId + "번의 연락처가 수정되었습니다.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("삭제할 연락처의 id를 입력해주세요.");
                    int deleteId = input.nextInt();
                    deletePhoneNum(deleteId);
                    System.out.println("id " + deleteId + "번의 연락처가 삭제되었습니다.");
                    break;
                default:
                    if(phoneNumbers.isEmpty()) System.out.println("연락처 목록이 비어있습니다.");
                    else {
                        System.out.println("모든 연락처 목록입니다.");
                        printPhoneNums();
                        break;
                    }
            }
        }
    }

    public static void addPhoneNum(String name, int phoneNum, String email) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phoneNum, email, id);
        phoneNumbers.add(phoneNumber);
        id++;
    }

    public static void selectPhoneNums(int id) {
        for(PhoneNumber phoneNumber : phoneNumbers) {
            if(phoneNumber.getId() == id) System.out.println(phoneNumber);
        }
    }

    public static void deletePhoneNum(int id) {
        for(PhoneNumber phoneNumber : phoneNumbers) {
            if(phoneNumber.getId() == id) phoneNumbers.remove(phoneNumber);
            break;
        }
    }

    public static void editPhoneNum(int id) {
        for(PhoneNumber phoneNumber : phoneNumbers) {
            if(phoneNumber.getId() == id) {
                deletePhoneNum(id);
                String changeName = input.next();
                int changeNum = input.nextInt();
                String changeMail = input.next();
                addPhoneNum(changeName, changeNum, changeMail);
            }
        }
    }

    public static void printPhoneNums() {
        for(PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("1. 연락처 추가");
        System.out.println("2. 연락처 조회");
        System.out.println("3. 연락처 수정");
        System.out.println("4. 연락처 삭제");
        System.out.println("5. 모든 연락처 목록 출력");
    }
}