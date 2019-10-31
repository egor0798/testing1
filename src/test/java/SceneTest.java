import org.junit.Test;
import scene.Door;
import scene.FlyingRodents;
import scene.LivingCreature;

import static org.junit.Assert.*;

public class SceneTest {

    @Test
    public void testArturIsHypnotizedByFlyingRodent() {
        LivingCreature artur = new LivingCreature("Artur");
        FlyingRodents flyingRodents = new FlyingRodents();
        flyingRodents.moveTowardSomebody(artur);
        assertEquals(true, artur.isHypnotized);
    }

    @Test
    public void testTrillianGrabbedArtur() {
        LivingCreature artur = new LivingCreature("Artur");
        LivingCreature trillian =  new LivingCreature("Trillian");
        trillian.grab(artur.limbs[0]);
        assertTrue(trillian.grasped[0].owner.equals(artur.name));
    }

    @Test
    public void testTrillianGrabbedNotArtur() {
        LivingCreature artur = new LivingCreature("Artur");
        LivingCreature ford = new LivingCreature("Ford");
        LivingCreature trillian =  new LivingCreature("Trillian");
        trillian.grab(ford.limbs[0]);
        assertFalse(trillian.grasped[0].owner.equals(artur.name));
    }

    @Test
    public void testDoorOpened() {
        LivingCreature ford = new LivingCreature("Ford");
        LivingCreature zaford = new LivingCreature("Zaford");

        Door door = new Door();

        ford.openDoor(door);
        zaford.openDoor(door);

        assertTrue(door.isOpened);
    }

    @Test
    public void testWholeScenario() {
        LivingCreature artur = new LivingCreature("Artur");
        LivingCreature trillian =  new LivingCreature("Trillian");
        LivingCreature ford = new LivingCreature("Ford");
        LivingCreature zaford = new LivingCreature("Zaford");

        Door door = new Door();

        ford.openDoor(door);
        zaford.openDoor(door);

        FlyingRodents flyingRodents = new FlyingRodents();
        flyingRodents.moveTowardSomebody(artur);

        trillian.grab(artur.limbs[0]);

        assertTrue(artur.isHypnotized && trillian.grasped[0].owner.equals(artur.name) && trillian.pullThroughDoor(door));
    }

}
