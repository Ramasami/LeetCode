class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int i=0, count = 0,min = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String[] m = list1.length < list2.length ? list1 : list2;
        String[] list = list1.length >= list2.length ? list1 : list2;
        for(String s:m) {
            map.putIfAbsent(s,i);
            i++;
        }
        i=0;
        for(String s:list) {
            if(map.containsKey(s)) {
                count = i + map.get(s);
                if(count < min) {
                    min = count;
                    ans = new ArrayList<>();
                }
                if(count == min)
                    ans.add(s);
            }
            i++;
        }
        return ans.toArray(new String[0]);
    }
}