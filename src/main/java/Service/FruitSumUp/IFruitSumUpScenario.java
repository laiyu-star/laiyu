package Service.FruitSumUp;

import java.math.BigDecimal;

public interface IFruitSumUpScenario {

    /**
     * 情景 1
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     */
    BigDecimal sumUpOne(int appleAmount, int strawberryAmount) ;

    /**
     * 情景 2
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     */
    BigDecimal sumUpTwo(int appleAmount, int strawberryAmount, int mangoAmount) ;

    /**
     * 情景 3
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     */
    BigDecimal sumUpThree(int appleAmount, int strawberryAmount, int mangoAmount) ;

    /**
     * 情景 4
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount      芒果斤数
     */
    BigDecimal sumUpFour(int appleAmount, int strawberryAmount, int mangoAmount) ;

    /**
     * 判断整数
     *
     * @param num 斤数
     */
    boolean isInteger(double num);
}
