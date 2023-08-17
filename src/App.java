public class App {
    public static void main(String[] args) throws Exception {
        // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;
        int change;

        System.out.println("money= " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            change = money/coinUnit[i];     //소지금을 i번째 금액으로 나눈 몫
            System.out.println(coinUnit[i] + "원: " + change);
            money %= coinUnit[i];           // 소지금을 i번째 금액으로 나눈 나머지를 money에 다시 대입후 반복
        }
        /*
        for (int i = 0; i < coinUnit.length; i++) {
            int change = money/coinUnit[0];
            System.out.println(coinUnit[0] + "원: " + change);
            money % coinUnit[0];           
        }

        for (int i = 0; i < coinUnit.length; i++) {
            int change = money/coinUnit[1];
            System.out.println(coinUnit[1] + "원: " + change);
            money % coinUnit[1];           
        }

        for (int i = 0; i < coinUnit.length; i++) {
            int change = money/coinUnit[2];
            System.out.println(coinUnit[2] + "원: " + change);
            money % coinUnit[2];           
        }

        for (int i = 0; i < coinUnit.length; i++) {
            int change = money/coinUnit[3];
            System.out.println(coinUnit[3] + "원: " + change);
            money % coinUnit[3];           
        }
         */

    }
}
