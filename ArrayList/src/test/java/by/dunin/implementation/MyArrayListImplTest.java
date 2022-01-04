package by.dunin.implementation;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListImplTest {

    @org.junit.jupiter.api.Test
    void add() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        int actualResult = myArrayList.getSize();
        //When
        int expectedResult = 3;

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void get() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        int actualResult = myArrayList.get(0);
        //When
        int expectedResult = 1;

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void update() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        myArrayList.update(1, 5);
        //When
        int actualResult = myArrayList.get(1);
        int expectedResult = 5;

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        myArrayList.remove(0);
        //When
        int actualResult = myArrayList.getSize();
        int expectedResult = 2;

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        int actualResult = myArrayList.getSize();

        //When
        int expectedResult = 3;

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void getIndexOf() {
        //Given
        MyArrayListImpl<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        int actualResult = myArrayList.getIndexOf(2);

        //When
        int expectedResult = 1;

        //Then
        assertEquals(expectedResult, actualResult);
    }
}