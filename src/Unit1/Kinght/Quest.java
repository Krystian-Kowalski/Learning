package Unit1.Kinght;

interface Quest {
    void getQuest();
    void findComrades();
    void process();
    void collectReward();
    void chooseQuest();
}

class DeadIslandQuest implements Quest{
    @Override
    public void getQuest() {
        System.out.println("You decide to slay the undead in their realm using your powerful magics");
    }

    @Override
    public void findComrades() {
        System.out.println("You hire an elite mercenary to protect your hide");
    }

    @Override
    public void process() {
        System.out.println("Upon arrival the hired sword runs away with money. You are beset by the undead. You are out of mana");
    }

    @Override
    public void collectReward() {
        System.out.println("Quest failed! You become a lich");
    }

    public void chooseQuest() {
        System.out.println("You have chosen DeadIslandQuest and here is what happens:");
        getQuest();
        findComrades();
        process();
        collectReward();
    }
}

class EliteKnightQuest implements Quest {
    @Override
    public void getQuest() {
        System.out.println("You set out to become an elite knight");
    }

    @Override
    public void findComrades() {
        System.out.println("You find master at arms to train you");
    }

    @Override
    public void process() {
        System.out.println("You fight in the royal tournament");
    }

    @Override
    public void collectReward() {
        System.out.println("The king is so impressed he lets you join his retinue. Thy are now Sir Whatever!");
    }

    @Override
    public void chooseQuest() {
        System.out.println("You have chosen EliteKnightQuest and here is what happens:");
        getQuest();
        findComrades();
        process();
        collectReward();
    }
}

class Knight {
    public void doQuest(Quest quest) {
        quest.chooseQuest();
    }
}

class Application {
    public static void main(String[] args) {
        Quest islandQuest = new DeadIslandQuest();
        Quest knightQuest = new EliteKnightQuest();
        Knight stefan = new Knight();
        Knight marian = new Knight();

        stefan.doQuest(islandQuest);
        stefan.doQuest(knightQuest);
    }
}
