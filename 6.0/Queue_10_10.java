public class Queue_10_10 {
    public static void main(String[] args) {

        Queue queue = new Queue();

        System.out.println("queue.getSize(): " + queue.getSize());
        System.out.println("queue.empty(): " + queue.empty());
        for (int i = 1; i <= 20; i++){
            queue.enqueue((int) (Math.random() * 10));
        }

        System.out.println("queue.getSize(): " + queue.getSize());
        System.out.println("queue.empty(): " + queue.empty());

        // Removes these numbers and displays them
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }


        System.out.println("\nqueue.getSize(): " + queue.getSize());
        System.out.println("queue.empty(): " + queue.empty());

    }
}


