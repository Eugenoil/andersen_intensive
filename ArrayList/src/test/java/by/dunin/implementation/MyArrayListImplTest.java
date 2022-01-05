package by.dunin.implementation;

import by.dunin.interfaces.MyArrayList;
import org.junit.jupiter.api.Test;

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

    @Test
    void sortWhenString() {
        //Given
        MyArrayList<String> actualResult = new MyArrayListImpl<>();
        actualResult.add("Ab");
        actualResult.add("Aa");
        actualResult.add("Ac");
        actualResult.sort(actualResult);

        //When
        MyArrayList<String> expectedResult = new MyArrayListImpl<>();
        expectedResult.add("Aa");
        expectedResult.add("Ab");
        expectedResult.add("Ac");

        //Then
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortWhenDouble() {
        //Given
        MyArrayList<Double> actualResult = new MyArrayListImpl<>();
        actualResult.add(6.2);
        actualResult.add(6.8);
        actualResult.add(6.1);
        actualResult.sort(actualResult);

        //When
        MyArrayList<Double> expectedResult = new MyArrayListImpl<>();
        expectedResult.add(6.1);
        expectedResult.add(6.2);
        expectedResult.add(6.8);

        //Then
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortWhenInteger() {
        //Given
        MyArrayList<Integer> actualResult = new MyArrayListImpl<>();
        actualResult.add(8);
        actualResult.add(1);
        actualResult.add(4);
        actualResult.add(6);
        actualResult.add(0);
        actualResult.add(7);
        actualResult.sort(actualResult);

        //When
        MyArrayList<Integer> expectedResult = new MyArrayListImpl<>();
        expectedResult.add(0);
        expectedResult.add(1);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(7);
        expectedResult.add(8);

        //Then
        assertEquals(expectedResult.toString(), actualResult.toString());
    }
}