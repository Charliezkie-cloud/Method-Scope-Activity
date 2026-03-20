import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Name: Charles Henry M. Tinoy Jr.
 * Course, Year & Section: BSIT - 1 - Non-blocked
 */
public class Billing {
    /**
     * Takes up the price and add 8% tax
     * @param price
     * @return Total price with 8% tax
     */
    private static BigDecimal computeBill(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(1.08)).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Multiply the price by its quantity then add 8% tax
     * @param price
     * @param quantity
     * @return Total price with 8% tax
     */
    private static BigDecimal computeBill(BigDecimal price, int quantity) {
        BigDecimal totalPrice = price.multiply(BigDecimal.valueOf(quantity));
        return computeBill(totalPrice).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Multiply the price by its quantity and subtract it by the coupon then add 8% tax
     * @param price
     * @param quantity
     * @param coupon
     * @return Total price with 8% tax
     */
    private static BigDecimal computeBill(BigDecimal price, int quantity, BigDecimal coupon) {
        BigDecimal totalPrice = computeBill(price, quantity);
        return totalPrice.subtract(coupon).setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        int quantity = 5;
        BigDecimal price = BigDecimal.valueOf(99.99);
        BigDecimal coupon = BigDecimal.valueOf(15.75);

        BigDecimal result1 = computeBill(price);
        BigDecimal result2 = computeBill(price, quantity);
        BigDecimal result3 = computeBill(price, quantity, coupon);

        System.out.printf("Result 1: %.2f\n", result1);
        System.out.printf("Result 2: %.2f\n", result2);
        System.out.printf("Result 3: %.2f\n", result3);
    }
}
