class BKG {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            value = map.get(key);
            if(value>2){
                list.add(map.get(key));
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));

    }
}