class RangeFreqQuery {
    int[] arr; 
    HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();

    public RangeFreqQuery(int[] arr) {
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            h.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
    }
    
    public int query(int left, int right, int value) {
        if (!h.containsKey(value)) {
            return 0;
        }

        ArrayList<Integer> al = h.get(value);
        int lc = findLowerBound(al, left);
        int uc = findUpperBound(al, right);
        return uc - lc;
    }
    
    private int findLowerBound(ArrayList<Integer> al, int target) {
        int left = 0, right = al.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (al.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid; 
            }
        }
        return left;
    }
    
    private int findUpperBound(ArrayList<Integer> al, int target) {
        int left = 0, right = al.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (al.get(mid) <= target) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }
        return left;
    }
}
