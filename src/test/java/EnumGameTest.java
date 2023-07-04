import org.enumgame.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EnumGameTest {

     Orc orc;
     Knight knight;
     Wizard wizard;
     Assassin assassin;

    @BeforeEach
    void setup() {
        orc = new Orc("HARGH");
        knight = new Knight("Adam");
        wizard = new Wizard("Merlin");
        assassin = new Assassin("Ezio");
    }

    @Test
    void test_orc_values() {
        assertEquals(40, orc.getDamage());
        assertEquals(60, orc.getHealthPoint());
        assertEquals(15, orc.getSpeed());
        assertEquals(5, orc.getArmor());
        assertEquals(String.valueOf(Type.ORC), orc.getType());
    }

    @Test
    void test_knight_values() {
        assertEquals(35, knight.getDamage());
        assertEquals(45, knight.getHealthPoint());
        assertEquals(40, knight.getSpeed());
        assertEquals(20, knight.getArmor());
        assertEquals(String.valueOf(Type.KNIGHT), knight.getType());
    }

    @Test
    void test_wizard_values() {
        assertEquals(25, wizard.getDamage());
        assertEquals(55, wizard.getHealthPoint());
        assertEquals(20, wizard.getSpeed());
        assertEquals(0, wizard.getArmor());
        assertEquals(String.valueOf(Type.WIZARD), wizard.getType());
    }

    @Test
    void test_assassin_values() {
        assertEquals(45, assassin.getDamage());
        assertEquals(45, assassin.getHealthPoint());
        assertEquals(30, assassin.getSpeed());
        assertEquals(0, assassin.getArmor());
        assertEquals(String.valueOf(Type.ASSASSIN), assassin.getType());
    }

}
