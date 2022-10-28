package src;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    static urinals urinal;


    @BeforeAll
    static void setup(){
        urinal = new urinals();
        System.out.println("@BeforeAll executed");
    }

    @Test
    void getString() {
        assertEquals("1000",urinal.getString(),"====== Suvarshitha kalvakuntla == TEST FIVE FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST FIVE EXECUTED =======");

    }

    @Test
    void goodString() {
        assertTrue( false == urinal.goodString("111000"), "====== Suvarshitha kalvakuntla == TEST ONE FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST ONE EXECUTED =======");
        assertTrue( false == urinal.goodString("abc"), "====== Suvarshitha kalvakuntla == TEST TWO FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST TWO EXECUTED =======");
        assertTrue( false == urinal.goodString("10000000000000000000000000000000000000000"), "====== Suvarshitha kalvakuntla == TEST THREE FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST THREE EXECUTED =======");
        assertTrue( true == urinal.goodString("100"), "====== Suvarshitha kalvakuntla == TEST FOUR FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST FOUR EXECUTED =======");

    }

    @Test
    void countUrinals() {


    }

    @Test
    void main() {

    }
}