import java.util.Scanner;

public class FruitSumUp_2 {

    // 定义苹果和草莓和芒果的单价
    private static final int APPLE_PRICE = 8;
    private static final int STRAWBERRY_PRICE = 13;
    private static final int MANGO_PRICE = 20;

    /**
     * 定义计算顾客购买水果的总价
     *
     * @param appleAmount 苹果斤数
     * @param strawberryAmount 草莓斤数
     * @param mangoAmount 芒果斤数
     * @return 水果总价
     */
    public static int sumUp(int appleAmount, int strawberryAmount, int mangoAmount) {
        int appleTotal = APPLE_PRICE * appleAmount;
        int strawberryTotal = STRAWBERRY_PRICE * strawberryAmount;
        int mangoTotal = MANGO_PRICE * mangoAmount;

        // 计算总价
        int totalPrice = appleTotal + strawberryTotal + mangoTotal;
        return totalPrice;
    }

    public static void main(String[] args) {

        // 自己确定购买苹果和草莓和芒果的斤数
        System.out.println("请输入购买苹果的斤数: " );
        Scanner apple = new Scanner(System.in);
        String str1 = apple.nextLine();
        System.out.println("请输入购买草莓的斤数: " );
        Scanner strawberry = new Scanner(System.in);
        String str2 = strawberry.nextLine();
        System.out.println("请输入购买芒果的斤数: " );
        Scanner mango = new Scanner(System.in);
        String str3 = strawberry.nextLine();
        apple.close();
        strawberry.close();
        mango.close();

        int totalPrice = sumUp(Integer.parseInt(str1),Integer.parseInt(str2),Integer.parseInt(str3));
        System.out.println("顾客购买水果的总价为: " + totalPrice + " 元");
    }
}