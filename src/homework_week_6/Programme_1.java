package homework_week_6;
 /**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.h
 */
 public class Programme_1 {
     // 1.1 Declare Two instance variables
     int a = 10;
     int b = 20;

     // 1.2 Declare one instance methos
     // 1.3 Call both instance variable into the instance method inside print statemnet
     public void instanceMethod() {
         System.out.println(a);
         System.out.println(b);
     }
     // 1.4 Declare the Main method
     // 1.5 Call the above instance method into the main method and Run the programm
     public static void main(String[] args) {
         Programme_1 programme_1 = new Programme_1();
         programme_1.instanceMethod();
     }

}
