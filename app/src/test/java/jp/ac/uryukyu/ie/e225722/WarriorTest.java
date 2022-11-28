package jp.ac.uryukyu.ie.e225722;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void attackTest() {
        int defaultWarriorHp = 100;
        int defaultEnemyHp = 400;
        int estimation = -50;
        Warrior demoWarrior = new Warrior("デモウォリアー", defaultWarriorHp, 100);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 3);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkill(slime); // over kill
        }
        slime.attack(demoWarrior);
        assertEquals(estimation, slime.getHitPoint());
    }
}
