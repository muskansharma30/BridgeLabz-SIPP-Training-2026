package oops.interfaces;

public interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        String[] coupons = {
                "SAVE10",
                "AB12",
                "WELCOME",
                "XYZ",
                "DISCOUNT50"
        };

        for (String code : coupons) {

            if (cart.validateCoupon(code)) {
                System.out.println(code + " -> Valid Coupon");
            } else {
                System.out.println(code + " -> Invalid Coupon");
            }
        }
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        return CouponValidator.isLengthValid(code);
    }
}
