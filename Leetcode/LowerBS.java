int findLowerBound(ArrayList<Integer> al, int target) {
        int left = 0, right = al.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (al.get(mid) < target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid; // Move to the left half
            }
        }
        return left; // Index of the first element >= target
    }
