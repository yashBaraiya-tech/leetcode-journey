class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();

        // create triangle like 2D arraylist
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> a = new ArrayList<>(); // khali
            for (int j = 0; j <= i; j++) {
                a.add(0);
            }
            arr.add(a);
        }

        // fill the values of pascal triangle
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    arr.get(i).set(j, 1);
                else {
                    int up = arr.get(i - 1).get(j);
                    int upLeft = arr.get(i - 1).get(j - 1);
                    arr.get(i).set(j, up + upLeft);
                }
            }
        }

        return arr.get(rowIndex);
    }
}