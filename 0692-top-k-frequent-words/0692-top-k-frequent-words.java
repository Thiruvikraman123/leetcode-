class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        //String[] hi=words.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        ArrayList<String>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->{
            if(map.get(a)!=map.get(b))
            {
                return map.get(b)-map.get(a);
            }
            else{
                return a.compareTo(b);
            }
        }
        
        
        );
        return list.subList(0,k);

        
    }
}