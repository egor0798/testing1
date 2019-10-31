package scene;

import java.util.Random;

public class LivingCreature {
    public Arm[] limbs;
    public boolean isHypnotized;
    public Arm[] grasped;
    public String name;

    public LivingCreature(String name) {
        this.limbs = new Arm[2];
        this.limbs[0] = new Arm(name);
        this.limbs[1] = new Arm(name);
        this.isHypnotized = false;
        this.name = name;
        this.grasped = new Arm[2];
    }

    public void grab(Arm limbToGrab) {
        if (this.grasped[0] == null) {
            this.grasped[0] = limbToGrab;
            limbToGrab.isGrabbed = true;
        } else {
            if (this.grasped[1] == null) {
                this.grasped[1] = limbToGrab;
                limbToGrab.isGrabbed = true;
            }
        }
    }

    public void openDoor(Door door) {
        Random r = new Random();
        int randomBool = r.nextInt(2);
        door.isOpened = randomBool == 1;
    }

    public boolean pullThroughDoor(Door door) {
        return door.isOpened;
    }

    public String checkWhosLimbGrabbed(Arm arm) {
        return arm.owner;
    }
}
