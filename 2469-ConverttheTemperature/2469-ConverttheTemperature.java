// Last updated: 8/11/2025, 11:38:34 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        double kelvin = celsius + 273.15;
        double farheniet = celsius * 1.80 + 32;
        arr[0] = kelvin;
        arr[1] = farheniet;
        return arr;
    }
}