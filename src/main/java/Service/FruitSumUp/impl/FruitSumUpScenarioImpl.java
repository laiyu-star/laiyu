package Service.FruitSumUp.impl;

import Service.FruitSumUp.IFruitSumUpScenario;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FruitSumUpScenarioImpl implements IFruitSumUpScenario {

    // 定义苹果和草莓和芒果的单价
    private static final BigDecimal APPLE_PRICE = new BigDecimal(8.0);
    private static final BigDecimal STRAWBERRY_PRICE = new BigDecimal(13.0);
    private static final BigDecimal MANGO_PRICE = new BigDecimal(20.0);

    // DecimalFormat df = new DecimalFormat("#0.0");
    /**
     * 情景 1
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @return 水果总价
     */
    @Override
    public  BigDecimal sumUpOne(int appleAmount, int strawberryAmount) {
        /*double appleTotal = APPLE_PRICE * appleAmount;
        double strawberryTotal = STRAWBERRY_PRICE * strawberryAmount;
        double totalPrice = appleTotal + strawberryTotal;*/

        BigDecimal apple = new BigDecimal(appleAmount);
        BigDecimal strawberry = new BigDecimal(strawberryAmount);
        BigDecimal totalPrice = apple.multiply(APPLE_PRICE).add(strawberry.multiply(STRAWBERRY_PRICE));
        return totalPrice;
    }


    /**
     * 情景 2
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     * @return 水果总价
     */

    @Override
    public  BigDecimal sumUpTwo(int appleAmount, int strawberryAmount, int mangoAmount) {
        BigDecimal apple = new BigDecimal(appleAmount);
        BigDecimal strawberry = new BigDecimal(strawberryAmount);
        BigDecimal mango = new BigDecimal(mangoAmount);
        // 计算总价
        BigDecimal totalPrice = apple.multiply(APPLE_PRICE).add(strawberry.multiply(STRAWBERRY_PRICE)).add(mango.multiply(MANGO_PRICE));
        return totalPrice;
    }

    /**
     * 情景 3
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     * @return 水果总价
     */
    @Override
    public  BigDecimal sumUpThree(int appleAmount, int strawberryAmount, int mangoAmount) {
        BigDecimal apple = new BigDecimal(appleAmount);
        BigDecimal strawberry = new BigDecimal(strawberryAmount).multiply(BigDecimal.valueOf(0.8));
        BigDecimal mango = new BigDecimal(mangoAmount);
        // 计算总价
        BigDecimal totalPrice = apple.multiply(APPLE_PRICE).add(strawberry.multiply(STRAWBERRY_PRICE)).add(mango.multiply(MANGO_PRICE));
        return totalPrice;
    }

    /**
     * 情景 4
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     * @return 水果总价
     */
    @Override
    public  BigDecimal sumUpFour(int appleAmount, int strawberryAmount, int mangoAmount) {
        BigDecimal apple = new BigDecimal(appleAmount);
        BigDecimal strawberry = new BigDecimal(strawberryAmount).multiply(BigDecimal.valueOf(0.8));
        BigDecimal mango = new BigDecimal(mangoAmount);
        // 计算总价
        BigDecimal totalPrice = apple.multiply(APPLE_PRICE).add(strawberry.multiply(STRAWBERRY_PRICE)).add(mango.multiply(MANGO_PRICE));

        // 判断是否满足满减条件
        BigDecimal monut = new BigDecimal(100);
        if (totalPrice.compareTo(monut) == 0 || totalPrice.compareTo(monut) == 1) {
            // 购物满100减10块
            totalPrice = totalPrice.subtract(new BigDecimal(10));
        }
        return totalPrice;
    }

    // 判断输入的斤数是否为整数
    @Override
    public  boolean isInteger(double num) {
        return num == (int) num;
    }
}
