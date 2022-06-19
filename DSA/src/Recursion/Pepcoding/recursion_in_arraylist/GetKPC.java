package Recursion.Pepcoding.recursion_in_arraylist;

import java.util.*;

/**
 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
 * 2. The following list is the key to characters map :
 *     0 -> .;
 *     1 -> abc
 *     2 -> def
 *     3 -> ghi
 *     4 -> jkl
 *     5 -> mno
 *     6 -> pqrs
 *     7 -> tu
 *     8 -> vwx
 *     9 -> yz
 * 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
 * Use sample input and output to take idea about output.
 */
public class GetKPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ssList = getKPC(str);
        System.out.print(ssList);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> sList = new ArrayList<>();
            sList.add("");
            return sList;
        }

        char fc = str.charAt(0);
        String fcValue = getValue(fc);
        String ror = str.substring(1);
        List<String> tList = getKPC(ror);
        ArrayList<String> rList = new ArrayList<>();

        for(int i=0; i<fcValue.length(); i++){
            char iVal = fcValue.charAt(i);
            for(String fValue: tList){
                rList.add(iVal+fValue);
            }
        }

        return rList;
    }

    private static String getValue(char c){
        HashMap<Character,String> map = new HashMap<>();
        map.put('0',".;");
        map.put('1',"abc");
        map.put('2',"def");
        map.put('3',"ghi");
        map.put('4',"jkl");
        map.put('5',"mno");
        map.put('6',"pqrs");
        map.put('7',"tu");
        map.put('8',"vwx");
        map.put('9',"yz");

        return map.get(c);
    }
}
