package com.halmaks.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaximalRectangleTest {

    @Test
    public void maximalRectangleCase1() {
        assertEquals(6, new MaximalRectangle()
                .maximalRectangle(new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}
                }));
    }
    @Test
    public void maximalRectangleCase2() {
        assertEquals(0, new MaximalRectangle()
                .maximalRectangle(new char[][]{}));
    }
    @Test
    public void maximalRectangleCase3() {
        assertEquals(0, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'0'}}));
    }
    @Test
    public void maximalRectangleCase4() {
        assertEquals(1, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'1'}}));
    }
    @Test
    public void maximalRectangleCase5() {
        assertEquals(0, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'0'}, {'0'}}));
    }
    @Test
    public void maximalRectangleCase6() {
        assertEquals(2, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'1', '0'}, {'1', '0'}}));
    }
    @Test
    public void maximalRectangleCase7() {
        assertEquals(0, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'0', '0'}, {'0', '0'}}));
    }
    //todo
    @Test
    public void maximalRectangleCase8() {
        assertEquals(2, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'1', '0'}, {'1', '0'}}));
    }
    @Test
    public void maximalRectangleCase9() {
        assertEquals(2, new MaximalRectangle()
                .maximalRectangle(new char[][]{{'1', '0'}, {'1', '0'}}));
    }
}