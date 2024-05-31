import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<BookManage> bookManageList = new ArrayList<>();
    static int id = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            printMenu();
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    String book = input.next();
                    registerBook(book);
                    break;

                case 2:
                    printBooks();
                    break;

                case 3:
                    int loanOrReturnBookId = input.nextInt();
                    loanOrReturn(loanOrReturnBookId);

                case 4:
                    loanBook();
                    break;

                default:
                    int bookId = input.nextInt();
                    deleteBook(bookId);
            }
        }
    }

    public static void registerBook(String bookName){
        BookManage bookManage = new BookManage(bookName, id);
        bookManageList.add(bookManage);
        id++;
    }

    public static void printBooks() {
        for(BookManage bookManage : bookManageList) {
            System.out.println(bookManage.toString());
            System.out.println();
        }
    }

    public static void loanOrReturn(int id) {
        for (BookManage bookManage : bookManageList) {
            if(bookManage.getId() == id) {
                bookManage.loanReturn();
                break;
            }
        }
    }

    public static void deleteBook(int id) {
        for(BookManage bookManage : bookManageList) {
            if(bookManage.getId() == id) {
                bookManageList.remove(bookManage);
                break;
            }
        }
    }

    public static void loanBook() {
        for(BookManage bookManage : bookManageList) {
            if (bookManage.isLoanReturn()) {
                System.out.println(bookManage.toString());
                System.out.println();
            }
        }
    }

    static void printMenu() {
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 정보 조희");
        System.out.println("3. 도서 대출 및 반납 하기");
        System.out.println("4. 대출 중인 도서 목록 출력");
        System.out.println("5. 도서 삭제");
    }

}