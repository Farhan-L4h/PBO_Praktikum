package tugas.zombie;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        int percentage;

        switch (level) {
            case 1:
                percentage = 10;
                break;
            case 2:
                percentage = 30;
                break;
            case 3:
                percentage = 40;
                break;
            default:
                return;
        }

        health = Math.min(100, health + health * percentage / 100);
    }

    @Override
    public void destroyed() {
        health -= health * 20 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n"
                + super.getZombieInfo();
    }
}
