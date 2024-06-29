package dsa251.basicDSA.Strings;
import static org.junit.jupiter.api.Assertions.*;
/*
Reverse the given string word-wise.
The last word in the given string should come at 1st place, the last-second word at 2nd place, and so on.
Individual words should remain as it is.
 */
public class reverseStringWordWise {

    public static void main(String[] args) {
        assertEquals("code your indent Always",reverseTraverse("Always indent your code"));
    }

    static String reverseTraverse(String text){
        int len= text.length();
        int wordEnd=len;
        String ans="";
        for(int i=len-1;i>=0;i--){
            if(text.charAt(i)==' '){
                ans+=text.substring(i+1,wordEnd)+" ";
                wordEnd=i;
            }
            if(i==0){
                ans+=text.substring(i,wordEnd);
            }
        }
        return ans;
    }

    static String reverseSplitJoin(String text){
        String [] words = text.split(" ");
       int i=0,j= words.length-1;
       String newText="";
       while(i<j){
           String temp;
           temp =words[i];
           words[i]=words[j];
           words[j]=temp;
           i++; j--;
       }
        for(int n =0; n< words.length-1;n++){
            newText+=words[n]+" ";
        }
        return newText+words[words.length-1];

    }




static String reverseStringBuilder(String text){
    String [] words = text.split(" ");
    StringBuilder newText = new StringBuilder();
    for (int i=words.length-1;i>0;i--){
        newText.append(words[i]+" ");
    }
    newText.append(words[0]);
    return newText.toString();
}



}