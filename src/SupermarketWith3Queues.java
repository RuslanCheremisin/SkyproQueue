import java.util.ArrayDeque;
import java.util.Queue;

public class SupermarketWith3Queues {
    private Queue<String> queue1 = new ArrayDeque();
    private Queue<String> queue2 = new ArrayDeque();
    private Queue<String> queue3 = new ArrayDeque();

    String [] clients;

    public SupermarketWith3Queues() {
    }

    public void addClientToFreeQueue(String []clients) {

        for (int i = 0; i < clients.length; i++) {
            if (!queue1.contains(clients[i])&& !queue2.contains(clients[i])&& queue1.size()<5) {
                queue1.add(clients[i]);
                System.out.println(clients[i]+" is in the line 1");
            } else if (!queue1.contains(clients[i]) && !queue2.contains(clients[i]) && queue2.size() < 5) {
                queue2.add(clients[i]);
                System.out.println(clients[i]+" is in the line 2");
            } else if (queue2.size()>=5){
                System.out.println("Gaaaalyyaaaaaa!!!!");
                while (queue3.size()<5){
                    queue3.add(clients[i]);
                    System.out.println(clients[i]+" is in the line 3");
                    i++;
                }
                break;
            }
        }
    }

    public Queue<String> getQueue1() {
        return queue1;
    }

    public Queue<String> getQueue2() {
        return queue2;
    }

    public Queue<String> getQueue3() {
        return queue3;
    }
}
