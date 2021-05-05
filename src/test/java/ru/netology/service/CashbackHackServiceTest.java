package ru.netology.service;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;
        assertEquals(expected, actual);
    }
}