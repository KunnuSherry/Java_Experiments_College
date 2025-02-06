import java.util.Scanner;

class CircularQueue {
    private int front, rear, size, capacity;
    private int[] arr;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.arr = new int[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow !");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = val;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow !");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return;
        }
        int count = size;
        int index = front;
        while (count > 0) {
            System.out.print(arr[index] + " ");
            index = (index + 1) % capacity;
            count--;
        }
        System.out.println();
    }
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Code By Kunal_Sharma_011_CSE-A\nPlease Enter the size of Queue you want: ");
        int s = var1.nextInt();
        CircularQueue q = new CircularQueue(s);
        System.out.println("After Enqueuing:");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.print();
        System.out.println();
        System.out.println("After Dequeuing");
        q.dequeue();
        q.print();
        System.out.println();
        System.out.println("The front element is: " + q.peek());
     }
}
