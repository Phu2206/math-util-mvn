/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phunguyen.mathutil.main;

import com.phunguyen.mathutil.core.MathUtility;

/**
 *
 * @author phu
 */
public class Main {
    public static void main(String[] args) {
       //test thu cai ham minh vua viet tinh gia thua co dung khong
       //Chuan bi bo data test, test case
       //@Test Case #1: Check if getFactorial() run well with n = 0
       //Test Procudures/Steps :
       //                Given n = 0
       //                Invoke getFactorial(n=0)
       //Expected Result: 1' //0! == 1 ???
       long expected = 1;//hy vong 1 duoc tra ve
       int n = 0;// neu dua vao 0
       long actual = MathUtility.getFactorial(0); // chay ham cho ra ket qua
       
       //in ra vaf tu ket luan co giong ky vong hay ko
        System.out.println(n + "! | expected =  " + expected+ "    Actual = "+actual);
        
       //@Test Case #1: Check if getFactorial() run well with n = 1
       //Test Procudures/Steps :
       //                Given n = 0
       //                Invoke getFactorial(n=0)
       //Expected Result: 1' //0! == 1 ???
    }
}
