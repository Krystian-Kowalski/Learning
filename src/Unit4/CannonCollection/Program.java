package Unit4.CannonCollection;

import java.util.LinkedList;
import java.util.List;

class Cannon {
    boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (loaded) {
            System.out.println("BOOM!");
            loaded = false;
        }else {
            System.out.println("Cannon is empty");
        }
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "loaded=" + loaded +
                '}';
    }
}

class Program {
    static Cannon cannon1 = new Cannon(false);
    static Cannon cannon2 = new Cannon(true);
    static Cannon cannon3 = new Cannon(false);
    static Cannon cannon4 = new Cannon(false);

    public static void main(String[] args) {
        List<Cannon> artillery = new LinkedList<>();
        artillery.add(0, cannon1);
        artillery.add(1, cannon2);
        artillery.add(2, cannon3);
        artillery.add(3, cannon4);

        for (Cannon cannons : artillery) {
            cannons.fire();
        }
        System.out.println(artillery);

        for (int i =0; i < artillery.size(); i++) {
            Cannon cannon = artillery.get(i);
            cannon.loaded = true;
        }
        System.out.println(artillery);
    }
}
