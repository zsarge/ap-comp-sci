import java.util.*;

class GetRandomIndex {
    public static void main(String args[]) {
        List<String> rooms = new ArrayList<String>();
        rooms.add("bed");
        rooms.add("tacos");
        rooms.add("whatever");

        int randomIndex = randRange(0, rooms.size() - 1);

        System.out.print(randomIndex + " = ");
        System.out.println(rooms.get(randomIndex));
    }

    public static int randRange(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }
}

class GetRandomIndex2 {
    public static void main(String args[]) {
        // I have the array constructor as an argument,
        // but you could also make an array variable and
        // pass it to this method.
        List<String> rooms = Arrays.asList(new String[]{
            "bed",
            "tacos",
            "whatever"
        });

        int randomIndex = randRange(0, rooms.size() - 1);

        System.out.print(randomIndex + " = ");

        // Get a random room:
        System.out.println(rooms.get(randomIndex));
    }

    public static int randRange(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }
}

class ShuffleArray {
    public static void main(String args[]) {
        List<String> rooms = Arrays.asList(new String[]{
            "bed",
            "tacos",
            "whatever"
        });

        // Print rooms:
        System.out.println(rooms);

        // Shuffle rooms (Mr. Evert will probably make you write this yourself):
        Collections.shuffle(rooms);

        System.out.println(rooms);
    }
}
