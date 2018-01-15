package Netnix.tests;

import Netnix.classes.Bekeken;

import Netnix.util.DataBekeken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testDataBekeken {

    @Test
    public void test(){
        DataBekeken Object = new DataBekeken();
        Bekeken first = new Bekeken(123,"naam", 1001, 10);
        Bekeken second = new Bekeken(321,"naam", 1001, 12);
        List<Bekeken> exspected = new ArrayList<>();
        Object.addBekeken(first);
        Object.addBekeken(second);
        List<Bekeken> actual = Object.getBekeken();
        exspected.add(first);
        exspected.add(second);
        assertEquals(exspected,actual);
    }
}