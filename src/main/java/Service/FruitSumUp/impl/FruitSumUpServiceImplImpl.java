package Service.FruitSumUp.impl;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.math.BigDecimal;
import java.util.Scanner;

@Logger
public class FruitSumUpServiceImplImpl extends FruitSumUpScenarioImpl {

    public static void main(String[] args) {

        FruitSumUpServiceImplImpl fruitSumUpService = new FruitSumUpServiceImplImpl();

        // 自行确定购买的数量
        /*int appleAmount = 6; // 假设顾客购买了6斤苹果
        int strawberryAmount = 5; // 假设顾客购买了5斤草莓
        int mango = 0; // 假设顾客购买了0斤芒果
        double totalPriceOne = sumUpOne(appleAmount,strawberryAmount);
        System.out.println("情景一：顾客需要支付的总价为：" + totalPriceOne + "元");
        double totalPriceTwo = sumUpTwo(appleAmount,strawberryAmount,mango);
        System.out.println("情景二：加上芒果后顾客需要支付的总价为：" + totalPriceTwo + "元");
        double totalPriceThree = sumUpThree(appleAmount,strawberryAmount,mango);
        System.out.println("情景三：草莓打八折后顾客需要支付的总价为：" + totalPriceThree + "元");
        double totalPriceFour = sumUpFour(appleAmount,strawberryAmount,mango);
        System.out.println("情景四：顾客需要支付的总价为：" + totalPriceFour + "元");*/

        // 自己输入购买苹果和草莓和芒果的斤数
        System.out.println("请输入购买苹果的斤数: ");
        Scanner apple = new Scanner(System.in);
        String str1 = apple.nextLine();
        System.out.println("请输入购买草莓的斤数: ");
        Scanner strawberry = new Scanner(System.in);
        String str2 = strawberry.nextLine();
        System.out.println("请输入购买芒果的斤数: ");
        Scanner mango = new Scanner(System.in);
        String str3 = mango.nextLine();
        /*apple.close();
        strawberry.close();
        mango.close();*/

        try {
            if (fruitSumUpService.isInteger(Integer.parseInt(str1)) && fruitSumUpService.isInteger(Integer.parseInt(str2)) && fruitSumUpService.isInteger(Integer.parseInt(str3))) {
                BigDecimal totalPriceOne = fruitSumUpService.sumUpOne(Integer.parseInt(str1), Integer.parseInt(str2));
                System.out.println("情景一：顾客需要支付的总价为：" + totalPriceOne + "元");
                BigDecimal totalPriceTwo = fruitSumUpService.sumUpTwo(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景二：加上芒果后顾客需要支付的总价为：" + totalPriceTwo + "元");
                BigDecimal totalPriceThree = fruitSumUpService.sumUpThree(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景三：草莓打八折后顾客需要支付的总价为：" + totalPriceThree + "元");
                BigDecimal totalPriceFour = fruitSumUpService.sumUpFour(Integer.parseInt(str1), Integer.parseInt(str2), Integer.parseInt(str3));
                System.out.println("情景四：顾客需要支付的总价为：" + totalPriceFour + "元");
            }
        } catch (Exception e) {
            System.out.println("对不起，您输入的水果斤数里面有数目不是大于等于 0 的整数，请重新执行：");
        }

    }
}
