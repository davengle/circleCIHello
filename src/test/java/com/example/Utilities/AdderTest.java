package com.example.Utilities;

import com.example.circlecihello.CircleCiHelloApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class AdderTest {

    private Adder adder;

    @Before
    public void setup(){
        adder = new Adder();
    }

    @Test
    public void sum2Nums() {
        Adder adder = new Adder();
        int sum = adder.sum2Nums(2,3);
        assertEquals(5, sum);
    }
}