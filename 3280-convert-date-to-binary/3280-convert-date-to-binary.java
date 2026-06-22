class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");
        String year=Integer.toBinaryString(Integer.parseInt(arr[0]));
        String month=Integer.toBinaryString(Integer.parseInt(arr[1]));
        String data=Integer.toBinaryString(Integer.parseInt(arr[2]));
        return year+"-"+month+"-"+data;
        
    }
}