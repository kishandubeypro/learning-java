
    import java.util.Scanner;
public class paragraphselectionsort {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String para = sc.nextLine();

        String[] words = para.split(" ");

        int n = words.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (words[j].compareTo(words[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }

        System.out.println("Sorted words:");

        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }
    }
}

