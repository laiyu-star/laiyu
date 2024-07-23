import java.util.Scanner;

public class FruitSumUp_1 {

    // 定义苹果和草莓的单价
    private static final int APPLE_PRICE = 8;
    private static final int STRAWBERRY_PRICE = 13;

    /**
     * 定义计算顾客购买水果的总价
     *
     * @param appleAmount 苹果斤数
     * @param strawberryAmount 草莓斤数
     * @return 水果总价
     */
    public static int sumUp(int appleAmount, int strawberryAmount) {
        // 计算总价
        int totalPrice = appleAmount * APPLE_PRICE + strawberryAmount * STRAWBERRY_PRICE;
        return totalPrice;
    }

    public static void main(String[] args) {
        /*int appleAmount = 5; // 假设顾客购买了5斤苹果
        int strawberryAmount = 3; // 假设顾客购买了3斤草莓
        int totalPrice = sumUp(appleAmount, strawberryAmount);*/

        // 自己确定购买苹果和草莓的斤数
        System.out.println("请输入购买苹果的斤数: " );
        Scanner apple = new Scanner(System.in);  //
        String str1 = apple.nextLine();
        System.out.println("请输入购买草莓的斤数: " );
        Scanner strawberry = new Scanner(System.in);
        String str2 = strawberry.nextLine();
        apple.close();
        strawberry.close();

        int totalPrice = sumUp(Integer.parseInt(str1),Integer.parseInt(str2));
        System.out.println("顾客购买水果的总价为: " + totalPrice + " 元");
    }
}
