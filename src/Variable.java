public class Variable {

    public static void main(String[] args) {
        
        /**
         * variable  a reusable container for value
         *           a variable behave as if it was the value it contains
         * 
         * */ 

        /**
         * Primitive = simple value stored directly in memory (stack)
         * Reference = memory address (stack) that points to the (heap)
         * 
         */
        
        /**
         * Primitive vs Reference
         * --------     ---------
         * int          string
         * double       array
         * char         object
         * boolean
         * 
         */
                    
        /**
         * 2 Steps to creating variable
         * ----------------------------
         * 1. declaration
         * 2. assignment
         * 
         */

        int year = 2025;
        System.out.println("The year is " + year);

        double temperature = -12.5;
        System.out.println("The temperature is " + temperature);

        char grade = 'A';
        System.out.println("The grade is " + grade);

        boolean isStudent = true;
        System.out.println("Are you a student? " + isStudent);
    
        String name = "Bro Code";
        System.out.println("My name is " + name);
    }

}
