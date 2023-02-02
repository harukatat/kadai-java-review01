public class Review01 {

    public static void main(String[]args) {
        //元の価格

        int price = 1622;
        //消費税額
        int result = getTax (1622);
        //税込価格
        int PriceWithTax = price + result;
        System.out.println (price + "円の商品の税込価格は" + PriceWithTax + "円" + "(消費税は" + result + "円）" + "です。" );

    }


    private static int getTax (int h) {
        int result =  (int) (h * 0.1);
        return result;
    }

}

