package FruitSumUp.impl;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FruitSumUp {
    // 定义苹果和草莓和芒果的单价
    private static final double APPLE_PRICE = 8.0;
    private static final double STRAWBERRY_PRICE = 13.0;
    private static final double MANGO_PRICE = 20.0;

    /**
     * 情景 1
     * 计算水果的总价
     *
     * @param appleAmount      苹果斤数
     * @param strawberryAmount 草莓斤数
     * @return 水果总价
     */
    public static double sumUpOne(int appleAmount, int strawberryAmount) {
        double totalPrice = appleAmount * APPLE_PRICE + strawberryAmount * STRAWBERRY_PRICE;
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
    public static double sumUpTwo(int appleAmount, int strawberryAmount, int mangoAmount) {
        double appleTotal = APPLE_PRICE * appleAmount;
        double strawberryTotal = STRAWBERRY_PRICE * strawberryAmount;
        double mangoTotal = MANGO_PRICE * mangoAmount;

        // 计算总价
        double totalPrice = appleTotal + strawberryTotal + mangoTotal;
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
    public static double sumUpThree(int appleAmount, int strawberryAmount, int mangoAmount) {
        double appleTotal = APPLE_PRICE * appleAmount;
        double strawberryTotal = STRAWBERRY_PRICE * strawberryAmount * 0.8;
        double mangoTotal = MANGO_PRICE * mangoAmount;

        // 计算总价
        double totalPrice = appleTotal + strawberryTotal + mangoTotal;
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
    public static double sumUpFour(int appleAmount, int strawberryAmount, int mangoAmount) {
        double appleTotal = APPLE_PRICE * appleAmount;
        double strawberryTotal = STRAWBERRY_PRICE * strawberryAmount * 0.8;
        double mangoTotal = MANGO_PRICE * mangoAmount;

        // 计算总价
        double totalPrice = appleTotal + strawberryTotal + mangoTotal;

        // String result = String.format("%.1f", totalPrice);
        // double totalPriceResult = Double.parseDouble(result);

        // 判断是否满足满减条件

        if (totalPrice >= 100) {
            // 购物满100减10块
            totalPrice -= 10.0;
        }
        return totalPrice;
    }

    // 判断输入的斤数是否为整数
    public static boolean isInteger(double num) {
        return num == (int) num;
    }

    public static void main(String[] args) {
        // 自行确定购买的数量
        /*int appleAmount = 5; // 假设顾客购买了5斤苹果
        int strawberryAmount = 3; // 假设顾客购买了3斤草莓
        int mango = 5; // 假设顾客购买了5斤芒果
        double totalPriceOne = sumUpOne(appleAmount,strawberryAmount);
        System.out.println("顾客需要支付的总价为：" + totalPriceOne + "元");
        double totalPriceTwo = sumUpTwo(appleAmount,strawberryAmount,mango);
        System.out.println("加上芒果后顾客需要支付的总价为：" + totalPriceTwo + "元");
        double totalPriceThree = sumUpThree(appleAmount,strawberryAmount,mango);
        System.out.println("草莓打八折后顾客需要支付的总价为：" + totalPriceThree + "元");
        double totalPriceFour = sumUpFour(appleAmount,strawberryAmount,mango);
        System.out.println("优惠活动后顾客需要支付的总价为：" + totalPriceFour + "元");*/



        // 自己输入购买苹果和草莓和芒果的斤数
        System.out.println("请输入购买苹果的斤数: ");
        Scanner apple = new Scanner(System.in);
        String str1 = apple.nextLine();
        System.out.println("请输入购买草莓的斤数: ");
        Scanner strawberry = new Scanner(System.in);
        String str2 = strawberry.nextLine();
        System.out.println("请输入购买芒果的斤数: ");
        Scanner mango = new Scanner(System.in);
        String str3 = strawberry.nextLine();
        apple.close();
        strawberry.close();
        mango.close();

        try {
            if (isInteger(Integer.parseInt(str1)) && isInteger(Integer.parseInt(str2)) && isInteger(Integer.parseInt(str3))) {
                double totalPriceOne = sumUpOne(Integer.parseInt(str1), Integer.parseInt(str2));
                System.out.println("情景一：顾客需要支付的总价为：" + totalPriceOne + "元");
                double totalPriceTwo = sumUpTwo(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景二：加上芒果后顾客需要支付的总价为：" + totalPriceTwo + "元");
                double totalPriceThree = sumUpThree(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景三：草莓打八折后顾客需要支付的总价为：" + totalPriceThree + "元");
                double totalPriceFour = sumUpFour(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景四：顾客需要支付的总价为：" + totalPriceFour + "元");
            }
        } catch (Exception e) {
            System.out.println("对不起，您输入的水果斤数里面有数目不是大于等于 0 的整数，请重新输入：");
        }
    }
}
