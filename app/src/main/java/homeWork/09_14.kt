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
    println(fibonacci(nFok + 1))
}

fun fibonacci(n: Int): Int {
    return when (n) {
        0, 1 -> n
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}