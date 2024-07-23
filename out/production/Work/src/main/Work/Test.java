import java.util.Scanner;

public class Test {

    // 定义苹果和草莓的单价
    private static final double APPLE_PRICE_PER_JIN = 8.0;
    private static final double STRAWBERRY_PRICE_PER_JIN = 13.0;

    /**
     * 计算顾客购买水果的总价
     *
     * @param appleJins 购买的苹果斤数
     * @param strawberryJins 购买的草莓斤数
     * @return 购买的水果总价
     */
    public static double calculateTotalPrice(int appleJins, int strawberryJins) {
        // 计算总价
        double totalPrice = appleJins * APPLE_PRICE_PER_JIN + strawberryJins * STRAWBERRY_PRICE_PER_JIN;
        return totalPrice;
    }

    // 示例用法
    public static void main(String[] args) {
        int appleJins = 5; // 假设顾客购买了5斤苹果
        int strawberryJins = 3; // 假设顾客购买了3斤草莓
        double totalPrice = calculateTotalPrice(appleJins, strawberryJins);
        System.out.println("顾客购买水果的总价为: " + totalPrice + " 元");
    }
}
