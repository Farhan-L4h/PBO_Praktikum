package tugas.Tugas2;

import tugas.zombie.Barrier;
import tugas.zombie.Destroyable;
import tugas.zombie.JumpingZombie;
import tugas.zombie.Plant;
import tugas.zombie.WalkingZombie;
import tugas.zombie.Zombie;

public class MainTugas2 {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        Destroyable[] objects = {wz, jz, b};

        // Hancurkan seluruh objek sebanyak empat kali
        for (int i = 0; i < 4; i++) {
            for (Destroyable d : objects) {
                p.doDestroy(d);
            }
        }

        // Periksa jenis objek, lalu lakukan casting yang sesuai
        for (Destroyable d : objects) {
            if (d instanceof Zombie) {
                Zombie z = (Zombie) d;
                z.heal();
                System.out.println(z.getZombieInfo());
            } else if (d instanceof Barrier) {
                Barrier barrier = (Barrier) d;
                System.out.println(barrier.getBarrierInfo());
            }
        }
    }
}
