package visibilite.inner;

public class Tools {
    private int lastResult;

    public int makeSum(int a, int b){
        lastResult = a+b;
        return lastResult;
    }

    public int getLastResult() {
        return lastResult;
    }
}
