package com.calculator.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	App a = new App(5,10);
    	
        assertEquals(15, a.add());
        assertEquals(-5, a.sub());
    }
}
