package demo.array;

public class demo01 {

    public static void main(String[] args) {
        //static definition
        String[] abc1 = new String[3];
        //dynamic definition
        String[] abc2 = new String[] {"a","b","c"};
        //definition3
        String[] abc3 = {"a", "b", "c"};
        //definition4
        String[] abc4;
        abc4 = new String[3];
        //definition5
        String[] abc5;
        abc5 = new String[] {"a","b","c"};

        System.out.print(abc1[0]);
    }


}
