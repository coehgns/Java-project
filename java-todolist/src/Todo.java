public class Todo {
    private final String user;
    private final String description;
    private boolean isComplete;
    private final int id;

    public Todo(String user, String description, int id) {
        this.user = user;
        this.description = description;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void complete() {
        this.isComplete = true;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "user='" + user + '\'' +
                ", description='" + description + '\'' +
                ", isComplete=" + isComplete +
                ", id=" + id +
                '}';
    }
}