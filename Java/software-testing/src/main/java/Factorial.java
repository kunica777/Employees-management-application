public class Factorial {

    public static int getFactorial(int number){
        if(number<0){
            return 0; }
        int result=1;
        for(int i =number; i>0; i--){
            result*=i;}
        return result;
}
    public int getFactorial2(int number){//with mockito the method has to be nonstatic!
        if(number<0){
            return 0; }
        int result=1;
        for(int i =number; i>0; i--){
            result*=i;}
        return result;
    }


}
