package TDD.NotacionRomana.Solucion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotacionRomanaTest {


    @Test
    public void testUno() {
        String s = NotacionRomana.convertir(1);
        assertEquals("I", s);
    }

    @Test
    public void testDos() {
        String s = NotacionRomana.convertir(2);
        assertEquals("II", s);
    }

    @Test
    public void testTres() {
        String s = NotacionRomana.convertir(3);
        assertEquals("III", s);
    }

    @Test
    public void testCuatro() {
        String s = NotacionRomana.convertir(4);
        assertEquals("IV", s);
    }

    @Test
    public void testCinco() {
        String s = NotacionRomana.convertir(5);
        assertEquals("V", s);
    }

    @Test
    public void testSeis() {
        String s = NotacionRomana.convertir(6);
        assertEquals("VI", s);
    }

    @Test
    public void testSiete() {
        String s = NotacionRomana.convertir(7);
        assertEquals("VII", s);
    }

    @Test
    public void testOcho() {
        String s = NotacionRomana.convertir(8);
        assertEquals("VIII", s);
    }

    @Test
    public void testNueve() {
        String s = NotacionRomana.convertir(9);
        assertEquals("IX", s);
    }

    @Test
    public void testDiez() {
        String s = NotacionRomana.convertir(10);
        assertEquals("X", s);
    }

    @Test
    public void testOnce() {
        String s = NotacionRomana.convertir(11);
        assertEquals("XI", s);
    }

    @Test
    public void testDoce() {
        String s = NotacionRomana.convertir(12);
        assertEquals("XII", s);
    }

    @Test
    public void testTrece() {
        String s = NotacionRomana.convertir(13);
        assertEquals("XIII", s);
    }

    @Test
    public void testCatorce() {
        String s = NotacionRomana.convertir(14);
        assertEquals("XIV", s);
    }

    @Test
    public void testQuince() {
        String s = NotacionRomana.convertir(15);
        assertEquals("XV", s);
    }

    @Test
    public void test16() {
        String s = NotacionRomana.convertir(16);
        assertEquals("XVI", s);
    }

    @Test
    public void test17() {
        String s = NotacionRomana.convertir(17);
        assertEquals("XVII", s);
    }

    @Test
    public void test20() {
        String s = NotacionRomana.convertir(20);
        assertEquals("XX", s);
    }

    @Test
    public void test21() {
        String s = NotacionRomana.convertir(21);
        assertEquals("XXI", s);
    }

    @Test
    public void test39() {
        String s = NotacionRomana.convertir(39);
        assertEquals("XXXIX", s);
    }

}