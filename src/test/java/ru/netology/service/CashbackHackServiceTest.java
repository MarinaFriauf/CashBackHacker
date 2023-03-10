package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test

    public void IfLess1000() {
        CashbackHackService i = new CashbackHackService();
        int amount = 900;
        int actual = i.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void IfMore1000() {
        CashbackHackService i = new CashbackHackService();
        int amount = 1100;
        int actual = i.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void If1000() {
        CashbackHackService i = new CashbackHackService();
        int amount = 1000;
        int actual = i.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void If999() {
        CashbackHackService i = new CashbackHackService();
        int amount = 999;
        int actual = i.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void If0() {
        CashbackHackService i = new CashbackHackService();
        int amount = 0;
        int actual = i.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}