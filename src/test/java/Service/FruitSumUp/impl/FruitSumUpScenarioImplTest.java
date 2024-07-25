package Service.FruitSumUp.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

class FruitSumUpScenarioImplTest {

    @InjectMocks
    FruitSumUpScenarioImpl fruitSumUpScenarioImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSumUpOne() {
        BigDecimal result = fruitSumUpScenarioImpl.sumUpOne(0, 0);
        Assertions.assertEquals(new BigDecimal(0), result);
    }

    @Test
    void testSumUpTwo() {
        BigDecimal result = fruitSumUpScenarioImpl.sumUpTwo(0, 0, 0);
        Assertions.assertEquals(new BigDecimal(0), result);
    }

    @Test
    void testSumUpThree() {
        BigDecimal result = fruitSumUpScenarioImpl.sumUpThree(0, 0, 0);
        Assertions.assertEquals(new BigDecimal(0), result);
    }

    @Test
    void testSumUpFour() {
        BigDecimal result = fruitSumUpScenarioImpl.sumUpFour(1,5,2);
        System.out.println("情景四：金额为100元，顾客需要支付的总价为：" + result + "元");
        Assertions.assertEquals(new BigDecimal(0), result);
        BigDecimal result1 = fruitSumUpScenarioImpl.sumUpFour(5,2,2);
        System.out.println("情景四：金额为100.8元，顾客需要支付的总价为：" + result1 + "元");
        Assertions.assertEquals(new BigDecimal(0), result1);
        BigDecimal result2 = fruitSumUpScenarioImpl.sumUpFour(6,3,1);
        System.out.println("情景四：金额为99.2元，顾客需要支付的总价为：" + result2 + "元");
        Assertions.assertEquals(new BigDecimal(0), result2);
    }

    @Test
    void testIsInteger() {
        boolean result = fruitSumUpScenarioImpl.isInteger(0d);
        Assertions.assertEquals(true, result);
    }
}

