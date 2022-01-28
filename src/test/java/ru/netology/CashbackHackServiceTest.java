package ru.netology;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainCalc () {
        assertEquals(service.remain(1600), 400);
    }

    @Test
    public void shouldRemainCalcWhenAmount1000 () {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRemainCalcWhenAmount1001 () {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldRemainCalcWhenAmount999 () {
        assertEquals(service.remain(999), 1);
    }
}