package by.dunin.implementation;

import by.dunin.comparator.ObjectComparator;
import by.dunin.interfaces.MyArrayList;
import by.dunin.sort.AdvancedQuickSort;

import java.util.Arrays;

public class MyArrayListImpl<E> implements MyArrayList<E> {

    private E[] values;

    public MyArrayListImpl() {
        values = (E[]) new Object[0];//Initiating empty array
    }

    @Override
    public void add(E e) { //Adding new element to our ArrayList
        try {
            E[] temp = values; //Create temporary array that is copy of "values"
            values = (E[]) new Object[temp.length + 1]; //Create new array that bigger than previous
            System.arraycopy(temp, 0,values, 0, temp.length);//Copy old array to new array
            values[values.length - 1] = e;//Add new value in the end of our ArrayList
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];//Get value due to index in our ArrayList
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;//Set new value at existing index
    }

    @Override
    public void remove(int index) { //Remove value due to index
        try {
            E[] temp = values; //Create temporary array that is copy of "values"
            values = (E[]) new Object[temp.length - 1];//Create new array that lesser than our previous array
            System.arraycopy(temp, 0, values, 0, index);//Copy all values till index of removable value from old array
            int amountElementAfterIndex = temp.length - index - 1;//Create variable that save amount of element after index of removable value
            System.arraycopy( //Copy values from old array to new array which has no value that was removed
                    temp, index + 1, //source array
                    values, index //target array
                    , amountElementAfterIndex); //amount
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int getSize() { //Get size of our ArrayList
        return values.length;
    }

    @Override
    public int getIndexOf(E value) {//Get index  due to value
        int index = -1;//initial variable of index for our loop
        for (int i = 0; i < values.length; i++) { //Loop that find necessary value
            if (values[i] == value) {
                index = i;
                break; //If loop find necessary value, it breaks and method return index
            }
        }
        return index;
    }

    @Override
    public void sort(MyArrayList<E> arrayList) {
        AdvancedQuickSort<E> advancedQuickSort = new AdvancedQuickSort<>();
        advancedQuickSort.qsort(arrayList, 0, arrayList.getSize() - 1, new ObjectComparator());
    }



    @Override
    public String toString() {
        return "MyArrayListImpl{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
