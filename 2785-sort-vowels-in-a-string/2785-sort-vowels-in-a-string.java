class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                sb.append(list.get(index));
                index++;
            }
            else{
                sb.append(ch);

            }
        }
        return sb.toString();


        
        
    }
    public boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
}