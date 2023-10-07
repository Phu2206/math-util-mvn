/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phunguyen.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author phu
 */
public class MathUtilityTest {
    
   //Cau truc Test case: ID|Desc|Step/Procedure|Expected Result|Status
   //Test Case #1:- Veryfy getFactorial(With n = 0)
   //Steps:
    // 1.Given n = 0
    // 2.Call/Invoke GetFcatorial(n=0)
    //Expected Result:
    //The method must return 1 as the reuslt of 1
    //Status: Passed|Failed
   @Test
   public void verifyFactorialGivenRightArgument0ReturnsOk()
   {
       assertEquals(1, MathUtility.getFactorial(0));
   }
   
   //TestCase #2...
   @Test
   public void verifyFactorialGivenRightArgument1ReturnsOk()
   {
       assertEquals(1, MathUtility.getFactorial(1));
   }
   
   //TestCase #3...
   @Test
   public void verifyFactorialGivenRightArgument5ReturnsOk()
   {
       assertEquals(120, MathUtility.getFactorial(5));
   }
    
    
}
