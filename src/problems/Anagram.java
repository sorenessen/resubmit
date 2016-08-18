package problems;

import java.util.Arrays;

public class Anagram
{
    static void isAnagram(String e1, String e2)
    {

        String example1 = e1.replaceAll("\\s", "");
        String example2 = e2.replaceAll("\\s", "");
             boolean status = true;
        if(example1.length() != example2.length())
        {
            status = false;
        }
        else
        {
            char[] e1Array = example1.toLowerCase().toCharArray();
            char[] e2Array = example2.toLowerCase().toCharArray();
           Arrays.sort(e1Array);
           Arrays.sort(e2Array);

            status = Arrays.equals(e1Array, e2Array);
        }
        if(status)
        {
            System.out.println(e1+" and "+e2+" are anagrams");
        }
        else
        {
            System.out.println(e1+" and "+e2+" are not anagrams");
        }
    }
    public static void main(String[] args)
    {
        isAnagram("In the window", "Owned within");
        isAnagram("Meals", "Males");
        isAnagram("Tarp", "Trap");
        isAnagram("Tang", "Gnat");
        isAnagram("Trash", "Harts");
        isAnagram("Guitar", "Gutter");
        isAnagram("Sentinel", "Sentient");
        isAnagram("Sorbet", "Strobe");
        isAnagram("Jambalaya", "Jamboree");
    }
}