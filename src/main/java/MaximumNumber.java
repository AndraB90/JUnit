public class MaximumNumber {
    public double findMax(double arr[] ){
        double maxValue=Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
