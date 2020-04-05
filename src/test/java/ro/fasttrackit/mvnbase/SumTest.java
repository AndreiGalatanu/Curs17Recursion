package ro.fasttrackit.mvnbase;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.Sum;

public class SumTest {
    Sum sum;

    @BeforeEach
    void setup() {
        sum = new Sum();
    }

    @Test
    @DisplayName("sum(1)=1")
    void sum1() {
        Assertions.assertThat(sum.sum(1));
    }

    @Test
    @DisplayName("sum(0)=0")
    void sum0() {
        Assertions.assertThat(sum.sum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("sum(2)=3")
    void sum2() {
        Assertions.assertThat(sum.sum(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("sum(33)=561")
    void sum33() {
        Assertions.assertThat(sum.sum(33)).isEqualTo(561);
    }

    @Test
    @DisplayName("sum(-10)=exception")
    void negative() {
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> sum.sum(-10));
        Assertions.assertThat(exception.getMessage()).isEqualTo("n should be positive");
    }

    @Test
    @DisplayName("foctorial(10)=")
    void factorial19() {
        Assertions.assertThat(sum.factorial(10)).isEqualTo(3628800);
    }

    @Test
    @DisplayName("sumArray(3,5,6,19)=33")
    void sumArray() {
        Assertions.assertThat(sum.sumArray(new int[]{3, 5, 6, 19})).isEqualTo(33);
    }

    @Test
    @DisplayName("sumArray(3,5,6,19)=33")
    void sumArrayMiddle() {
        Assertions.assertThat(sum.sumArrayMiddle(new int[]{3, 5, 6, 19})).isEqualTo(33);
    }

    //============================================HomeWork========================================
    @Test
    @DisplayName("sum of the first n integer numbers")
    void sumOfFirstIntgNum() {

        Assertions.assertThat(sum.sumOfFirstIntegerNumbers(5)).isEqualTo(15);
    }

    @Test
    @DisplayName("WHEN n is negative THEN return Exceptiom")
    void negativeSum() {
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class,
                () -> sum.sumOfFirstIntegerNumbers(-13));
        Assertions.assertThat(exception.getMessage()).isEqualTo("n is invalid");
    }

    @Test
    @DisplayName("WHEN sum of first 3 even n THEN equals 12")
    void evenSum() {
        Assertions.assertThat(sum.sumEven(3)).isEqualTo(12);

    }

    @Test
    @DisplayName("WHEN sum of first 10 even n THEN equals 110")
    void evenMoreSum() {
        Assertions.assertThat(sum.sumEven(10)).isEqualTo(110);

    }

    @Test
    @DisplayName("WHEN n is negative THEN return Exceptiom")
    void negativeEvenSum() {
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class,
                () -> sum.sumOfFirstIntegerNumbers(-13));
        Assertions.assertThat(exception.getMessage()).isEqualTo("n is invalid");
    }

    @Test
    @DisplayName("WHEN palindrom is correct THEN show is palindrom")
    void correctPalindrom() {

        Assertions.assertThat(sum.palindrom("aiia")).isEqualTo("Palindrom");


    }
    @Test
    @DisplayName("WHEN the name is not equal THEN print is not Equal")
    void notEqualPalindrom(){

        Assertions.assertThat(sum.palindrom("mema")).isEqualTo("Not Palindrom");

    }
    @Test
    @DisplayName("Other palindrom recursive")
    void palinRecursive(){

        Assertions.assertThat(sum.otherPalindrom("aiia")).isEqualTo(true);

    }
    @Test
    @DisplayName("Other palindrom recursive TO LOWER CASE")
    void palinRecursiveLowercase(){

        Assertions.assertThat(sum.otherPalindrom("Aiia")).isEqualTo(true);

    }
    @Test
    @DisplayName("IF 123 THEN n=6")
    void digitSum(){


        Assertions.assertThat(sum.sumOfDigits(123)).isEqualTo(6);
    }
    @Test
    @DisplayName("IF 123456321 THEN n=6")
    void digitSumBig(){


        Assertions.assertThat(sum.sumOfDigits(123456321)).isEqualTo(27);
    }


}
