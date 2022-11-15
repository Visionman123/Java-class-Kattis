package Frankfurt.Exercise.Week1;

public class RandomSeq {

    static class RandomSequence {

        int min = 1, max = 100, size;

        void Random(int size) {
            int RandomArr[] = new int[size];
            for (int i = 0; i < size; i++) {
                // reading array elements from the user
                RandomArr[i] = (int) (Math.random() * (max - min + 1) + min);
            }
            System.out.print("Array elements are: ");
            // accessing array elements using the for loop
            for (int i = 0; i < size; i++) {
                System.out.print(" " + RandomArr[i]);
            }
        }
    }

    static class RandomSeqAB {

        void RandomAB(int min, int max, int size) {

            System.out.format("\nGenerating random sequence from %d to %d with %d number...", min, max, size);

            // create array
            int RandomArr[] = new int[size];

            for (int i = 0; i < size; i++) {
                // reading array elements from the user
                RandomArr[i] = (int) (Math.random() * (max - min + 1) + min);
            }
            System.out.print("\nArray elements are: ");
            // accessing array elements using the for loop
            for (int i = 0; i < size; i++) {
                System.out.print(" " + RandomArr[i]);
            }
        }
    }

    static class RandomSeqLotto {
        int min = 1, max = 49, size = 6;

        void RandomLotto() {

            System.out.format("\nGenerating random sequence from %d to %d with %d number...", min, max, size);

            // create array
            int RandomArr[] = new int[size];

            for (int i = 0; i < size; i++) {
                // reading array elements from the user
                RandomArr[i] = (int) (Math.random() * (max - min + 1) + min);
            }
            System.out.print("\nArray elements are: ");
            // accessing array elements using the for loop
            for (int i = 0; i < size; i++) {
                System.out.print(" " + RandomArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        RandomSequence Q1 = new RandomSequence();
        Q1.Random(9);

        RandomSeqAB Q2 = new RandomSeqAB();
        Q2.RandomAB(5, 20, 3);

        RandomSeqLotto Q3 = new RandomSeqLotto();
        Q3.RandomLotto();

    }
}
