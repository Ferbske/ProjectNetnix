package Netnix.tests;

import Netnix.classes.Account;

import Netnix.util.DataAccount;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testDataAccount {

    @Test
    public void test(){
        DataAccount Object = new DataAccount();
        Account first = new Account(123,"naam", "straat", "1234AB", 12, "plaats");
        Account second = new Account(321,"naam", "Straat", "1234AB", 12, "plaats");
        List<Account> exspected = new ArrayList<>();
        Object.addAccounts(first);
        Object.addAccounts(second);
        List<Account> actual = Object.getAccounts();
        exspected.add(first);
        exspected.add(second);
        assertEquals(exspected,actual);
    }
}