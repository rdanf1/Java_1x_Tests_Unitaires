package visibilite;

import visibilite.inner.Tools;

public class MonProg {
    public static void main (String[] args){
        Tools tools = new Tools();
        System.out.println(tools.makeSum(10, 5));
        System.out.println(tools.getLastResult());
    }
}
