

public class HarmonicSeriesAverage {

    public static void main(String[] args) {
        

    int[] list1 = {5,5,5,5,5};
    float[] list2 = new float[list1.length];
    float sum = 0 ;

    for (int i =0; i<list1.length;i++){
        list2[i] =1.0f/list1[i];    
    }
    for (int i=0;i<list2.length;i++){
        sum += list2[i];

    }
    float average = sum/list2.length;
    System.out.println(average);
    }
}