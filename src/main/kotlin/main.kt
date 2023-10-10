fun main() {

    val transfer = 1000;
    val discountPercent = 0.0075;
    val minDiscount = 35;

    val amount = if (transfer * discountPercent >= minDiscount) {
        transfer + transfer * minDiscount
    } else {
        transfer + minDiscount
    }

    println(amount)
}