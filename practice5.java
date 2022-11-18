//taha burak sahin
// Define a logical variable isFemale. Then declare a variable of type String and initialize
//it with the string "Woman" or "Man", depending on the value of isFemale.
//Additionally, define a logical variable isYoung. Then declare a variable of type String
//and initialize it with the string "Woman", "Man", "Boy" or "Girl" depending on the
//values of isFemale and isYoung

package task3;
public class practice5 {
    public static void main(String[] args) {
        System.out.println("A person with age  20 and female or will be : " + classifyPerson(2, 'F'));
        System.out.println("A person with age  20 and male or will be : " + classifyPerson(20, 'M'));
    }public static String classifyPerson(int age, char gender) {
        String result = null;
        if (gender == 'M') {
            if (age > 25)
                result = "Men";
            else
                result = "Boy";
        } else {
            if (age > 20)
                result = "Woman";
            else
                result = "Girl";
        }
        return result;
    }
}
