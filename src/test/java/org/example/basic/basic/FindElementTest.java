package org.example.basic.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FindElementTest {

    @Test
    void elementFind() {



        assertEquals(FindElement.elementFind(new int[]{1,3,5,96,4} , 5) , 2);
        assertNull(FindElement.elementFind(new int[]{1, 3, 5, 96, 4}, 100));
    }
    @Test
    void binaryElement() {


        int[] a = {1,0,1,0} ;
        int[] b = {1,1,0,0} ;
        assertThat(FindElement.addingTwoBinaryInteger(a,b)).containsExactly(1,0,1,1,0) ;
        //assertNull(FindElement.elementFind(new int[]{1, 3, 5, 96, 4}, 100));
    }




}