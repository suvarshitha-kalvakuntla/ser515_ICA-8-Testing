package src;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    static urinals urinal;


    @BeforeAll
    static void setup(){
        urinal = new urinals();
        System.out.println("@BeforeAll executed");
    }

    @Test
    void inputFromFile() throws IOException {
        assertTrue(urinal.inputFromFile(urinal, new StringBuilder("")));
        System.out.println("====== Suvarshitha kalvakuntla == TEST FIVE EXECUTED =======");
    }


    @Test
    void ResultFile(){
        assertTrue(urinal.ResultFile("10",new File("test.txt")));
        System.out.println("====== Suvarshitha kalvakuntla == TEST SIX EXECUTED =======");

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
        assertTrue( 1 == urinal.countUrinals("10001"), "====== Suvarshitha kalvakuntla == TEST SEVEN FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST SEVEN EXECUTED =======");
        assertTrue( 0 == urinal.countUrinals("1001"), "====== Suvarshitha kalvakuntla == TEST EIGHT FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST EIGHT EXECUTED =======");
        assertTrue( 3 == urinal.countUrinals("00000"), "====== Suvarshitha kalvakuntla == TEST NINE FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST NINE EXECUTED =======");

        assertTrue( -1 == urinal.countUrinals("11"), "====== Suvarshitha kalvakuntla == TEST TEN FAILED =======");
        System.out.println("====== Suvarshitha kalvakuntla == TEST TEN EXECUTED =======");

    }

    @Test
    void main() {

    }
}