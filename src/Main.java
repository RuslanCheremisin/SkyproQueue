public class Main {
    public static void main(String[] args) {


        String[] clients = {"Client1", "Client2", "Client3", "Client4", "Client5", "Client6", "Client7", "Client8", "Client9", "Client10", "Client11", "Client12", "Client13", "Client14", "Client15", "Client16", "Client17", "Client18", "Client19", "Client20", "Client21",};

        SupermarketWith3Queues supermarketWith3Queues = new SupermarketWith3Queues();

        supermarketWith3Queues.getQueue1().add(clients[2]);
        supermarketWith3Queues.getQueue1().add(clients[4]);
        supermarketWith3Queues.getQueue1().add(clients[6]);

        supermarketWith3Queues.getQueue1().add(clients[12]);
        supermarketWith3Queues.getQueue1().add(clients[3]);


        supermarketWith3Queues.addClientToFreeQueue(clients);

        System.out.println(supermarketWith3Queues.getQueue1().toString());
        System.out.println(supermarketWith3Queues.getQueue2().toString());
        System.out.println(supermarketWith3Queues.getQueue3().toString());



    }
}