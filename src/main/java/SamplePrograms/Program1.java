package SamplePrograms;

public class Program1 {
    private static int countCalls = 0;

    static int  max(int a, int b){
        int maxVal;
        countCalls++;
        if(a > b){
            maxVal = a;
            maxVal = isReallyMax(maxVal);
        } else{
            maxVal = b;
        }

        return maxVal;
    }

    static int isReallyMax(int a){

        return a;
    }
}
