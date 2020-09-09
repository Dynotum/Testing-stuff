package com.platzi.javatests.player;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    public void loosesNumberIsTooLow() {
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 5);
        assertFalse(player.play());
    }

    @Test
    public void winsNumberIsBigger() {
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}