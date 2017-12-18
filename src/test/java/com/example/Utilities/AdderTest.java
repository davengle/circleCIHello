package com.example.Utilities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class AdderTest {

    @Test
    public void sum2Nums() {
        Adder adder = new Adder();
        int sum = adder.sum2Nums(2,3);
        assertEquals(5, sum);
    }
}