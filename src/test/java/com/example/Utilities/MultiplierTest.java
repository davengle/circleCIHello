package com.example.Utilities;

import com.example.circlecihello.CircleCiHelloApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class MultiplierTest {

    private Multiplier multiplier;

    @Before
    public void setup(){
        multiplier = new Multiplier();
    }

    @Test
    public void multiply2Nums() {
        assertEquals(20, multiplier.multiply2Nums(4,5));
    }
}