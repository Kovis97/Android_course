package exercise

import androidx.compose.ui.text.toUpperCase

fun main() {
    println(gcd(64, 128))
}

fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    } else {
        return gcd(b, a % b)
    }
}