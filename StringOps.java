public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String vowelString = "aeiouAEIOU";
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (vowelString.indexOf(string.charAt(i)) != -1) {
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) 
                        newString += (char)(string.charAt(i) - 32);
                else newString += (char)(string.charAt(i));
            }
            else { 
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) 
                newString += (char)(string.charAt(i) + 32);
            else newString += string.charAt(i);
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        int wordCount = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 32) {
                if (wordCount == 1) {
                   if (string.charAt(i) >= 65 && string.charAt(i) <= 90) 
                        newString += (char)(string.charAt(i) + 32); 
                    else newString += string.charAt(i);
                }
                else {
                    if (string.charAt(i-1) == 32) {
                        if (string.charAt(i) >= 97 && string.charAt(i) <= 122) 
                        newString += (char)(string.charAt(i) - 32);
                        else newString += (char)(string.charAt(i));
                    }
                    else {
                        if (string.charAt(i) >= 65 && string.charAt(i) <= 90) 
                        newString += (char)(string.charAt(i) + 32);
                        else newString += (char)(string.charAt(i));
                    }
                }
            } 
            if (i != string.length() - 1) {
                if (string.charAt(i+1) == 32) wordCount++;
            }
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) count++;
        }
        int[] array = new int[count];
        count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }
}
