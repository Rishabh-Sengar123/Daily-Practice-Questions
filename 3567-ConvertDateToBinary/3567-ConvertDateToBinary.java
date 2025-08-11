// Last updated: 8/11/2025, 11:53:43 PM
class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-"); // ["2080", "02", "29"]
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String yearBin = Integer.toBinaryString(year);
        String monthBin = Integer.toBinaryString(month);
        String dayBin = Integer.toBinaryString(day);
        
        return yearBin + "-" + monthBin + "-" + dayBin;
    }
}
