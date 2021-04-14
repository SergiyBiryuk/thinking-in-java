package task_8;

public class ConnectionManager {

    private static final int MAX = 3;
    private static int count = 0;

    static Connection[] connections = new Connection[MAX];

    static Connection newConnection() {
        if(count < MAX) {
            connections[count] = new Connection(count);
            return connections[count++];
        }
        else
            return null;
    }

    static class Connection {
        int ID;

        private Connection(final int ID) {
            this.ID = ID;
            System.out.println("Connection " + this.ID + " constructor");
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < MAX + 2; i++) {
            System.out.println(newConnection());
        }
        for(int i = 0; i < MAX; i++) {
            System.out.println(connections[i]);
        }
    }
}
