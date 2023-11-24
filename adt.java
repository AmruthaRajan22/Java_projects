import java.util.Scanner;
public class adt {
    
    static int[] b = new int[500];
    static int n, i, pos;

    public static void main(String[] args) {
        int ch;
        char g = 'y';
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("\nMain Menu");
            System.out.println("1.Create \n2.Insert \n3.Delete \n4.Display \n5.Search\n6.Exit");
            System.out.print("\nEnter your Choice: ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    create();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    deletion();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the correct choice:");
            }
            System.out.print("\nDo you want to continue? (y/n): ");
            g = s.next().charAt(0);
        } while (g == 'y' || g == 'Y');

    }

    static void create() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number of elements: ");
        n = s.nextInt();
        System.out.println("Enter the Elements:");
        for (i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
    }

    static void insert() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the position you need to insert: ");
        pos = s.nextInt();
        if (pos >= n) {
            System.out.println("\nInvalid Location");
        } else {
            for (i = n; i >pos; i--) {
                b[i] = b[i-1];
            }
            System.out.print("\nEnter the element to insert: ");
            int p = s.nextInt();
            b[pos] = p;
            n++;
        }
        System.out.println("\nThe list after insertion:");
        display();
    }

    static void deletion() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter index from where you want to delete an element: ");
        pos = s.nextInt();
        if (pos >= n) {
            System.out.println("\nInvalid Location");
        } else {
            for (i = pos + 1; i < n; i++) {
                b[i - 1] = b[i];
            }
            n--;
        }
        System.out.println("\nThe Elements after deletion:");
        display();
    }

    static void display() {
        System.out.println("\nThe Elements of the list are:");
        for (i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }

    static void search() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the Element to be searched: ");
        int e = s.nextInt();
        for (i = 0; i < n; i++) {
            if (b[i] == e) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
