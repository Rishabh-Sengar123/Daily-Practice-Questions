// Last updated: 2/10/2026, 3:19:10 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Object[][] ans = new Object[names.length][2];
        for(int i=0; i<names.length; i++ ){
             ans[i][0] = names[i];
             ans[i][1] = heights[i];
        }

        Arrays.sort(ans, (a,b)-> (int)b[1]-(int)a[1]);

        String[] result = new String[ans.length];
        for(int i=0; i<ans.length; i++){
            result[i] = (String) ans[i][0];
        }
        return result;
    }
}