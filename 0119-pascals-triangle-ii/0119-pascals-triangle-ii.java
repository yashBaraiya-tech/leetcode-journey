class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i)
                    a.add(1);
                else {
                    int up = arr.get(i - 1).get(j);
                    int upLeft = arr.get(i - 1).get(j - 1);
                    a.add(up + upLeft);
                }

            }
            arr.add(a);
        }

        return arr.get(rowIndex);
    }
}