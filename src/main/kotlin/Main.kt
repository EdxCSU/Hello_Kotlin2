package ru.netology
fun main() {
    val itemPrice = 5000
    val itemProcent = 0.0075
    val discountStart = 35
    val totalPrice=itemPrice+discountStart

    val amount = if(itemProcent*itemPrice > discountStart) {

        (totalPrice-discountStart)*itemProcent+itemPrice
    }
 else
    {
        totalPrice
    }


print (amount)
}