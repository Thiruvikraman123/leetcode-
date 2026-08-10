class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            String shortest = words[i];
            for(int j=0;j<dictionary.size();j++)
            {
                String root=dictionary.get(j);
                if(words[i].startsWith(root))
                {
                    if(root.length() < shortest.length())
                    {
                        shortest=root;
                    }
                }
            }
            words[i]=shortest;

        }
        return String.join(" ",words);
    }
}