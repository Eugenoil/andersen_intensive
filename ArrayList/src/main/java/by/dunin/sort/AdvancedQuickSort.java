package by.dunin.sort;

import by.dunin.implementation.MyArrayListImpl;
import by.dunin.interfaces.MyArrayList;

import java.util.Comparator;
import java.util.Objects;

public class AdvancedQuickSort<E> {

    public void qsort(MyArrayList<E> arrayList,
                      int left,
                      int right,
                      Comparator<Object> comp) { //Parametrized method qsort

        int ll = left; //beginning index
        int rr = right;//last index

        if (rr > ll) {
            E pivot = arrayList.get((ll + rr) / 2);//Choose pivot element
            while (ll <= rr) {

                while (ll < right && comp.compare(arrayList.get(ll), pivot) < 0) { //Compare if pivot more or less than element
                    ll += 1;
                }
                while (rr > left && comp.compare(arrayList.get(rr), pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(arrayList, ll, rr); //Swap elements in our ArrayList
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                qsort(arrayList, left, rr, comp);

            }
            if (ll < right) {
                qsort(arrayList, ll, right, comp);
            }
        }
    }


    public void swap(MyArrayList<E> arrayList, int index1, int index2) {
        E temp = arrayList.get(index1); //Creating temporary variable to set value
        arrayList.update(index1, arrayList.get(index2)); //Swap values at each others indexes
        arrayList.update(index2, temp);
    }
}

