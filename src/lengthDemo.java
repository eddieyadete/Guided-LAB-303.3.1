// importing Arrays to convert array to string
// used for printing arrays
import java.util.Arrays;



public class lengthDemo {

    public void javaString() {

        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
        }

    public void IsEmptyExample(){
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        }

    public void StringTrimExmple(){
        String s1 = "  hello  ";
        System.out.println(s1 + " how are you"); //without trim()
        System.out.println(s1.trim() + " how are you"); //with trim()
        }

    public void toLowerCaseExample(){
        String s1 = "HELLO WORLD, HOW ARE YOU";
        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower);
        }

    public void toUpperCaseExample(){
        String s1 = "hello you, what is your goal";
        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper);
        }

    public void concatDemo(){
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1.concat(s2)); //hello world
        System.out.println(s2.concat(s1)); //world hello

            //By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
            //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        System.out.println(s5);
            //both of the above statement will give you the same result
            // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

            // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
            System.out.println(s);

            // String Supplement is concatenated with character B
        String js1 = "Supplement" + 'B'; // js1 becomes SupplementB
            System.out.println(js1);

        }

    /**
     * // importing Arrays to convert array to string
     * // used for printing arrays
     * import java.util.Arrays;
     */
    public void splitMethod(){
       String vowels = "a::b::c::d:e";

       // splitting the string at "::"
       // storing the result in an array of strings
       String[] result = vowels.split("::");

       // converting array to string and printing it
       System.out.println("result = " + Arrays.toString(result));

   }

   public void charAtDemo (){

        String message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));
        }
    public void CompareToExample() {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        }
    public void substringDemo(){

        String str1 = "java is fun";

                // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4)); //java j= 0, a=1, v=2, a=3

        }

    public void indexOfDemo(){
        String str1 = "java is fun";
        int result;

            // getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result); // 6

             // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result); // 0
            // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result); // 3

            // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

            // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

            // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result); // -1

    }
    public void containsExample(){
        String obj1 = "Learn Java";
        Boolean result;

        // check if str1 contains "Java"
        result = obj1.contains("Java");
        System.out.println(result);  // true

        // check if str1 contains "Python"
        result = obj1.contains("Python");
        System.out.println(result);  // false

        // check if str1 contains ""
        result = obj1.contains("");
        System.out.println(result);  // true
    }

    /**
     * replace() method
     * The replace() method replaces each matching occurrence of the old character/text in the string with the new character/text.
     *
     * The syntax of the replace() method is either:
     * stringobj.replace(char oldChar, char newChar)
     * or
     * stringobj.replace(CharSequence oldText, CharSequence newText)
     * Here, stringobj is an object of the String class.
     */
    public void ReplaceDemoMain() {

            String str1 = "abc cba";

            // all occurrences of 'a' is replaced with 'z'
            System.out.println(str1.replace('a', 'z'));

            // all occurences of 'L' is replaced with 'J'
            System.out.println("Lava".replace('L', 'J'));
            // character not in the string
            System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
            System.out.println(str1.replace("C++", "Java"));

            // all occurences of "aa" is replaced with "zz"
            System.out.println("aa bb aa zz".replace("aa", "zz"));

            // substring not in the string
            System.out.println("Java".replace("C++", "C"));
        }
        public void demoReplaceAll(){

            String str1 = "Java123is456fun";

            // regex for sequence of digits
            String regex = "\\d+";

            // replace all occurrences of numeric
            // digits by a space
            System.out.println(str1.replaceAll(regex, " "));
        }
        public void testStringComparison(){
            String s1="PerScholas";
            String s2="PerScholas";
            String s3=new String("PerScholas");
            String s4="Teksystem";
            System.out.println(s1.equals(s2));//true
            System.out.println(s1.equals(s3));//true
            System.out.println(s1.equals(s4));//false
        }
        public void testStringComparison2(){
            String s1="Perscholas";
            String s2="Perscholas";
            String s3=new String("Perscholas");
            System.out.println(s1==s2);//true (because both refer to same instance)
            System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        }
        public void testStringComparison3(){
            String s1="Perscholas";
            String s2="Perscholas";
            String s3="Perschola";
            String s4="PerscholasX";
            System.out.println(s1.compareTo(s2)); //0
            System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
            System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
        }

}







