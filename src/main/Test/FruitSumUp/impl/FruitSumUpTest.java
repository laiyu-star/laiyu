package FruitSumUp.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitSumUpTest {

    public FruitSumUp fruitSumUp;

    @Test
    void sumUpOne() {
        double result = fruitSumUp.sumUpOne(1,1);
        System.out.println("情景一：顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpTwo() {
        double result = fruitSumUp.sumUpTwo(1,1,2);
        System.out.println("情景二：加上芒果后顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpThree() {
        double result = fruitSumUp.sumUpThree(1,1,1);
        System.out.println("情景三：草莓打八折后顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void sumUpFour() {
        double result = fruitSumUp.sumUpFour(6,5,0);
        System.out.println("情景四：顾客需要支付的总价为：" + result + "元");
    }

    @Test
    void isInteger() {
        fruitSumUp.isInteger(123.0);
    }

    @Test
    void main() {
    }
}