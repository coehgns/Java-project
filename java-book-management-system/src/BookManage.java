public class BookManage {
    private String bookName;
    private boolean LoanReturn;
    private int id;

    public BookManage(String bookName, int id) {
        this.bookName = bookName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isLoanReturn() {
        return LoanReturn;
    }

    public void loanReturn() {
        if(this.LoanReturn) LoanReturn = false;
        else LoanReturn = true;
    }

    @Override
    public String toString() {
        return "BookManage{" +
                "bookName='" + bookName + '\'' +
                ", LoanReturn=" + LoanReturn +
                ", id=" + id +
                '}';
    }
}
