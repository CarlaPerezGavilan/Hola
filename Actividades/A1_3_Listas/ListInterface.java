public interface ListInterface<T>
{
    void add(T element);
    void remove(int i);
    int find(T element);
    Object get(int i);

    T[] getList();
    void print();

}