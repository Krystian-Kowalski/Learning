package Unit3.CompareArrays;

import java.util.*;

class AChainsGenerator {
    Deque<String> result = new ArrayDeque<>();
    Random random = new Random();

    public Deque<String> generatedStrings() {
        for (int i = 0; i < 50; i++){
            int length = random.nextInt(50);
            String string = "";
            for (int j = 0; j < length; i++) {
                string = string +"a";
            }
            result.add(string);
        }
        return result;
    }

}

class AChainsSorter {
    ArrayList<AChainsGenerator> sort(ArrayList<AChainsGenerator> evenSorted) {
        ArrayList<AChainsSorter> sorters = new ArrayList<>();
        public void evenGeneratedStrings() {
            int count = 0;
            for () {
                if (Character.isLetter(strings))
            }
        }

    }

}

class SnakeLetters {
    static void main(String[] args) {
        AChainsGenerator generator = new AChainsGenerator();
        Deque<String> strings = generator.generatedStrings();

    }
}
