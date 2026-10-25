package tugas.zombie;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        int percentage;

        switch (level) {
            case 1:
                percentage = 30;
                break;
            case 2:
                percentage = 40;
                break;
            case 3:
                percentage = 50;
                break;
            default:
                return;
        }

        health = Math.min(100, health + health * percentage / 100);
    }

    @Override
    public void destroyed() {
        health -= health * 10 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n"
                + super.getZombieInfo();
    }
}