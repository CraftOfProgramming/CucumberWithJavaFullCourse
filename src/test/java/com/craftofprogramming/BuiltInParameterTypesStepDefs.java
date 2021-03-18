package com.craftofprogramming;

import io.cucumber.java.en.Given;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BuiltInParameterTypesStepDefs {

//    @Given("I have {byte} cucumber in my belly")
//    public void iHaveCucumberInMyBelly(byte bCucumberCount) {
//        System.out.println("bCucumberCount = " + bCucumberCount);
//    }
//
//    @Given("I have {short} cucumber in my belly")
//    public void iHaveCucumberInMyBelly(short sCucumberCount) {
//        System.out.println("sCucumberCount = " + sCucumberCount);
//    }
//
//    @Given("I have {int} cucumber(s) in my belly")
//    public void iHaveCucumberInMyBelly(int iCucumberCount) {
//        System.out.println("iCucumberCount = " + iCucumberCount);
//    }
//
//    @Given("I have {float} cucumbers in my belly")
//    public void iHaveCucumbersInMyBelly(float fCucumberCount) {
//        System.out.println("fCucumberCount = " + fCucumberCount);
//    }
//
    @Given("I have {double} cucumber(s) in my belly")
    public void iHaveCucumbersInMyBelly(double dCucumberCount) {
        System.out.println("dCucumberCount = " + dCucumberCount);
    }

    @Given("This is {} Byte")
    public void thisIsByte(Byte bParam) {
        System.out.println("bParam = " + bParam);
    }

    @Given("This is {} Short")
    public void thisIsByte(Short shortParam) {
        System.out.println("shortParam = " + shortParam);
    }

    @Given("This is {} Integer")
    public void thisIsByte(Integer integerParam) {
        System.out.println("integerParam = " + integerParam);
    }

    @Given("This is {} Long")
    public void thisIsByte(Long longParam) {
        System.out.println("longParam = " + longParam);
    }

    @Given("This is {} Float")
    public void thisIsByte(Float floatParam) {
        System.out.println("floatParam = " + floatParam);
    }

    @Given("This is {} Double")
    public void thisIsByte(Double doubleParam) {
        System.out.println("doubleParam = " + doubleParam);
    }

    @Given("This is {} BigInteger")
    public void thisIsByte(BigInteger bigIntegerParam) {
        System.out.println("bigIntegerParam = " + bigIntegerParam);
    }

    @Given("This is {} BigDecimal")
    public void thisIsByte(BigDecimal bigDecimalParam) {
        System.out.println("bigDecimalParam = " + bigDecimalParam);
    }

    @Given("I am {string}")
    public void iAm(String names) {
        System.out.println("names = " + names);
    }

    @Given("My first name is {word}")
    public void myFirstNameIs(String name) {
        System.out.println("name = " + name);
    }

    @Given("My last name is {word}")
    public void myLastNameIsNilton(String name) {
        System.out.println("name = " + name);
    }
}
