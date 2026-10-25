package tugas.Tugas3;

import tugas.zombie.Destroyable;
import tugas.zombie.JumpingZombie;
import tugas.zombie.WalkingZombie;
import tugas.zombie.Zombie;

public class MainTugas3 {
     public static void main(String[] args) {

        // 1. OK: upcasting
        Zombie z = new WalkingZombie(100, 1);

        // 2. OK: objek Zombie juga merupakan Destroyable
        Destroyable d = z;

        // 3. ERROR KOMPILASI: hapus komentar untuk menguji
        // Zombie z2 = d;

        // 4. OK: downcasting ke tipe yang sesuai
        Zombie z3 = (Zombie) d;
        System.out.println(z3.getZombieInfo());

        // 5. ERROR KOMPILASI: Zombie adalah abstract
        // Zombie z4 = new Zombie(100, 1);

        // 6. ERROR KOMPILASI: Plant bukan Destroyable
        // Destroyable d2 = new Plant();

        // 7. OK: JumpingZombie merupakan Zombie
        Zombie z5 = new JumpingZombie(100, 2);

        // 8. ERROR SAAT DIJALANKAN:
        // casting tidak cocok dengan objek sebenarnya
        // WalkingZombie w = (WalkingZombie) z5;
    }
}
