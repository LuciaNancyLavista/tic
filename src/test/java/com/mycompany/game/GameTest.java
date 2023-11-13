package com.mycompany.game;

import org.junit.jupiter.api.*;

public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("Testing play: computer vs computer");
        Game game = new Game(new ComputerPlayer('X'), new ComputerPlayer('O'));
        game.play();
    }
    
}
