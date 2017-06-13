package net.digitaliccat.training.di;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class ContainerTest {

    private Container sut;

    @Before
    public void setUp() {
        sut = new Container();
    }

    @Test
    public void addObjectToContainerAsSingleton() {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        sut.addAsSingleton("myList", myList);

        List<String> actual = (List<String>) sut.get("myList");

        // They are the same list
        assertSame(myList, actual);

        // You want more prove?
        assertEquals("Hello", actual.get(0));
    }


    @Test
    public void addObjectToContainer() {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        sut.add("myList", myList);

        List<String> myList1 = (List<String>) sut.get("myList");
        List<String> myList2 = (List<String>) sut.get("myList");
        myList2.add("Mimimi");

        assertNotSame(myList, myList1);
        assertNotSame(myList, myList2);
        assertNotSame(myList1, myList2);

        assertEquals(0, myList1.size());
        assertEquals(1, myList2.size());
    }
}
