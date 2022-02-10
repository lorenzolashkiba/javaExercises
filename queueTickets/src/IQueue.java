public interface IQueue<T> {

    void queue(T t);
    T deQueue();
    T peek();
}
