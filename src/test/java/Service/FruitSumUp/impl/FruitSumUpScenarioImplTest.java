package Service.FruitSumUp.impl;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FruitSumUpScenarioImplTest {

    FruitSumUpScenarioImpl fruitSumUp = new FruitSumUpScenarioImpl();

    @Test
    void sumUpOne() {
        BigDecimal result = fruitSumUp.sumUpOne(1,1);
        System.out.println("情景一：顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpTwo() {
        BigDecimal result = fruitSumUp.sumUpTwo(1,1,1);
        System.out.println("情景二：加上芒果后顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpThree() {
        BigDecimal result = fruitSumUp.sumUpThree(1,1,1);
        System.out.println("情景三：草莓打八折后顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpFour() {
        BigDecimal result = fruitSumUp.sumUpFour(1,5,2);
        System.out.println("情景四：金额为100元，顾客需要支付的总价为：" + result + "元");
        BigDecimal result1 = fruitSumUp.sumUpFour(5,2,2);
        System.out.println("情景四：金额为100.8元，顾客需要支付的总价为：" + result1 + "元");
        BigDecimal result2 = fruitSumUp.sumUpFour(6,3,1);
        System.out.println("情景四：金额为99.2元，顾客需要支付的总价为：" + result2 + "元");
    }

    @Test
    void isInteger() {
        fruitSumUp.isInteger(123.0);
    }
}