package GenericStack;

public class Main {
        public static void main(String[] args) {
            MyGenericStack myGenericStack = new MyGenericStack();
            System.out.println("1. Stack of integers");
            myGenericStack.stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            myGenericStack.stackOfIStrings();
        }
}