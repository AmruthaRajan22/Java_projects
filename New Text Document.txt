import java.util.Arrays;

class ArrayList {
    private int[] array;
    private int capacity;
    private int size;

    public ArrayList(int initialCapacity) {
        capacity = initialCapacity;
        size = 0;
        array = new int[capacity];
    }

    public void insert(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds!");
            return;
        }

        if (size >= capacity) {
            expandArray();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Not found
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("List contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void expandArray() {
        int newCapacity = capacity * 2;
        int[] newArray = Arrays.copyOf(array, newCapacity);

        array = newArray;
        capacity = newCapacity;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);

        int choice;
        int value, index;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    value = Integer.parseInt(System.console().readLine());
                    System.out.print("Enter the index to insert at: ");
                    index = Integer.parseInt(System.console().readLine());
                    list.insert(value, index);
                    break;
                case 2:
                    System.out.print("Enter the index to delete: ");
                    index = Integer.parseInt(System.console().readLine());
                    list.remove(index);
                    break;
                case 3:
                    System.out.print("Enter the value to search: ");
                    value = Integer.parseInt(System.console().readLine());
                    index = list.search(value);
                    if (index != -1) {
                        System.out.println("Value " + value + " found at index " + index);
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);
    }
}
