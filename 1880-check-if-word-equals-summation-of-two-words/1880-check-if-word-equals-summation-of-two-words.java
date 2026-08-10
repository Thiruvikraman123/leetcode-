class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="";
        for(int i=0;i<firstWord.length();i++)
        {
            char ch=firstWord.charAt(i);
            s1+=ch-'a';
        }
        String s2="";
        for(int i=0;i<secondWord.length();i++)
        {
            char ch2=secondWord.charAt(i);
            s2+=ch2-'a';
        }
        String s3="";
        for(int i=0;i<targetWord.length();i++)
        {
            char ch3=targetWord.charAt(i);
            s3+=ch3-'a';
        }
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int num3=Integer.parseInt(s3);

        return num3==(num1+num2);
    
        
    }
}