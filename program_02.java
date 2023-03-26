// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() — помещает элемент в конец очереди,
// dequeue() — возвращает первый элемент из очереди и удаляет его,
// first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class program_02 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Разместить элемент в конец очереди: " + queue);
        System.out.println("Возвратить первый элемент и удалить его: " + queue.remove());
        System.out.println("Просто возвратить первый элемент: " + queue.peek());
    }
}