import java.util.*

fun main() {
    val num1 = Scanner(System.`in`)
    val year = num1.nextInt()
    val leapYear = isLeapYear(year)
    if(leapYear)
        println("$year is a leap year")
    else
        println("$year is not a leap year")

}

fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        return true
    return false
}
