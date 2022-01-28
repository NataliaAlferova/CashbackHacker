package ru.netology;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainCalc() {
        assertEquals(400, service.remain(1600));
    }

    @Test
    public void shouldRemainCalcWhenAmount1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemainCalcWhenAmount1001() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldRemainCalcWhenAmount999() {
        assertEquals(1, service.remain(999));
    }
}