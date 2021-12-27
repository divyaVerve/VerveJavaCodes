package com.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {

	@Test
    @Parameters ({"val1", "val2"})
    public void Sum(int intVal1, int intVal2) {
    	int finalsum = intVal1 + intVal2;
        System.out.println("The final sum of the given values is " + finalsum);
    }
    
    @Test
    @Parameters ({"val1", "val2"})
    public void Diff (int intVal1, int intVal2) {
    	int finaldiff = intVal2 - intVal1;
    	System.out.println("The final difference of the given values is " + finaldiff);
    }
}
