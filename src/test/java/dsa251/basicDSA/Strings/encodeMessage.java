package dsa251.basicDSA.Strings;

public class encodeMessage {
    public static void main(String[] args) {

        String message = "aaaabbcaasbdsd";
        System.out.println(encodeStringBuilder(message));
    }

    static String encodeStringBuilder(String message) {
        int n=message.length();
    StringBuilder encodedMessage= new StringBuilder();
    for(int i=0;i<n;i++){
        char current=message.charAt(i);
        int charfreq=1;
        while(i+1<n && message.charAt(i+1)==current){
            i++;
            charfreq++;
        }
        encodedMessage.append(current);
        encodedMessage.append(charfreq);
    }
    return encodedMessage.toString();
    }



    static String encodeTraverse(String message) {
        int count = 0;
        char Current = message.charAt(0);
        String ans = "";
        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) == Current) {
                count++;
            }
            if (message.charAt(i) != Current) {

                ans += Current ;
                ans+=count;
                Current = message.charAt(i);
                count = 1;
            }
            if (i == message.length() - 1) {
                ans += Current ;
                ans+=count;
            }
        }
        return ans;
    }
}
