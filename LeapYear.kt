import java.util.*


/**
 * main function
 */
fun main() {
    val num1 = Scanner(System.`in`)
    val year = num1.nextInt()
    val leapYear = isLeapYear(year)
    if (leapYear)
        println("$year is a leap year")
    else
        println("$year is not a leap year")

}


/**
 * function to check leap year
 * @param year the year to be checked
 * @return Boolean leap year or not
 */
fun isLeapYear(year: Int) = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
