package homeWork

/**
 * Van egy n fokú létrád, minden lépésnél 1 vagy 2-t lépsz felfelé.
 * Számold ki hányféleképpen juthatsz fel a létrán
 *
 * Pl.
 * 1 fokú létra : 1 = 1
 * 2. fokú létra : 2, 1+1 = 2
 * 3. fokú létra : 1+2, 2+1, 1+1+1 = 3
 * 4. fokú létra : 2+2, 3+1, 1+3, 2+1+1, 1+2+1,  1+1+2, 1+1+1+1 = 5
 * 5. fokú létra :
 */

fun main() {
    val nFok = 4
    val step = 3
    println(fib(nFok, step))
}

fun fib(n: Int, step: Int): Int {
    var f: Int = 1
    var prev: Int = 1
    var i: Int = 0
    while (i++ < n) {
        prev += f
        f = prev - f
    }
    val step2 = when (step > n) {
        true -> n - 2
        false -> step - 2
    }
    for (a in 1..step2)
        f += fibonacci(n - step2 - a)
    return f
}