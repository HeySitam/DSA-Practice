package Recursion.RandomQuestions;

public class RemoveRepeatatedElements {
    public static void main(String[] args){
        String str = "aabccd";
        System.out.println(rre(str,str.length(),0));
        System.out.println(""+str.charAt(0));
    }

    static String rre(String str,int len, int pos){
        if(pos == len)
            return "";
        String newStr = rre(str,len, pos +1);
        if(isContain(""+str.charAt(pos),newStr)){
           return newStr;
        } else {
            return str.charAt(pos)+newStr;
        }
    }

    static boolean isContain(String chkStr, String oriStr){
       return  oriStr.contains(chkStr);
    }
}
