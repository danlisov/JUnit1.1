package ru.netology.service;
import ru.netology.service.JUnit1.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.testng.annotations.Test
    public void shouldAdviceAdding400() {
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAddingOn0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAddingOn1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAdding1() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAddingOn500IfAmountMoreThen1000() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAddingOn100IfAmountMoreThen1000() {
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAdviceAddingOn1000IfAmountMoreThen1000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
