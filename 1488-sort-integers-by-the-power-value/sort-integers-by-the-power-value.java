class Solution {
    public int getKth(int lo, int hi, int k) {

        HashMap<Integer, Integer> map  = new HashMap<>();

        for(int i = lo; i<= hi; i++){

            int num = i;
            int steps = 0;

            while(num != 1){

                if( num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }
                steps++;
            }
            map.put(i, steps);
        }

        List<Integer> list = new ArrayList<>();

        for( int i = lo; i <= hi; i++) {
            list.add(i);
        }

        list.sort((a, b) -> {
            if(map.get(a).equals(map.get(b))){
                return a - b;
            }
            return map.get(a) - map.get(b);
        });
        return list.get( k - 1);
        
    }
}