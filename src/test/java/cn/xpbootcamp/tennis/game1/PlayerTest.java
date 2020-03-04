package cn.xpbootcamp.tennis.game1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void should_return_a_player_successfully_when_give_a_name() {
        String name = "John";
        Player player = new Player(name);
        String expected = "John";
        String result = player.getName();
        Assert.assertEquals(expected,result);
    }

}