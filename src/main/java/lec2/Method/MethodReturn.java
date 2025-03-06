package lec2.Method;

public class MethodReturn {

    public static void main(String[] args) {
        int amount = buyIceCream(1000);
        System.out.println("구매가능한 수는? : "+ amount);
    }

    static int buyIceCream(int money){
        int price = 500;
        int amount = money/price;

        if(amount ==0){
            System.out.println("돈이나 제대로 주세요");
            return 0;
        }

        System.out.println("아이스크림 1개라도 구매완료!");
        return amount;
    }
}
