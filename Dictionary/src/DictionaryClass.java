public class DictionaryClass {
        public static void main(String[] args) {
            Dictionary test = new Dictionary();
            System.out.println("Test is Empty (return true): " + test.isEmpty()); //test isEmpty
            System.out.println("Test size (return 0): " + test.size()); //testing size
            test.put("Ishan", "Fishan"); //adding a value
            System.out.println("Adding key value pair to dictionary."); //test isEmpty
            System.out.println("Test isEmpty (return false): " + test.isEmpty()); //test size
            System.out.println("Test size (return 1): " + test.size());//contains method
            System.out.println("Test contains Ishan (return true): " + test.contains("Ishan"));
            System.out.println("Test contains Dumb (return false): " + test.contains("Dumb")); //get test
            System.out.println("Test get (return Fishan): " + test.get("Ishan")); //remove test
            System.out.println("Test remove (return Fishan): " + test.remove("Ishan"));
            // more elements to test contain methods
            System.out.println("Add elements to test contain methods");
            test.put("lmfao", "yoyoyoy");
            test.put("what did", "the fox");
            test.put("say", "ring ring ring ring");
            //collection methods
            System.out.println("Test collection of keys method (return a collection of keys): " + test.keys());
            System.out.println("Test collection of values method (return a collection of values): " + test.values());
        }
}
