package Netnix.tests;

import Netnix.classes.Profiel;

import Netnix.util.DataProfiel;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testDataProfiel {

    @Test
    public void test(){
        DataProfiel Object = new DataProfiel();
        Profiel first = new Profiel(123,"naam", new Date(1999,12,12));
        Profiel second = new Profiel(321,"naam", new Date(1999,12,12));
        List<Profiel> exspected = new ArrayList<>();
        Object.addProfiel(first);
        Object.addProfiel(second);
        List<Profiel> actual = Object.getProfielen();
        exspected.add(first);
        exspected.add(second);
        assertEquals(exspected,actual);
    }
}