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

    }

    @Test
    void goodString() {
        assertTrue( urinal.goodString("00000") == false, "====== Suvarshitha kalvakuntla == TEST ONE EXECUTED =======");

    }

    @Test
    void countUrinals() {


    }

    @Test
    void main() {

    }
}