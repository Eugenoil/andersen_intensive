package by.dunin.interfaces;

public interface MyArrayList<E>{
    void add(E e);

    E get(int index);

    void update(int index, E value);

    void remove(int index);

    int getSize();

    int getIndexOf(E value);

}
