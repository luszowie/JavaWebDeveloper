import java.sql.SQLOutput;

public class IncDec {
    int j;

    public static void main (String[] args){
        int x, y , z;
        x = 42;
        y = x++; // y=42, x=43
        z = ++x;// x=44, z=44

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        int a = 0, b;
        b = a++ + a++;// 0,1,3,
        //0 + 1
        //1   2
        System.out.println(b);
        System.out.println(a);

        boolean value;

        int c = 5;
        int d = 5;
        value = c == d;

        System.out.println(value);


        System.out.println((c > 5) && (d < 7));



        System.out.println((c > 5) || (d < 7));

        System.out.println("abcd" + 1 + 2);

        System.out.println(1 + 2 + "abcd");
        String myName = "Paul";
        myName += "Jr.";
        System.out.println(myName);

        int l = 6 + 4 / 2;
        System.out.println(l);

        int i = 0;
        {
            int k = 4;
            System.out.println(k);// zmienna lokalna

        }
        System.out.println(i);

        void test() {

            int j = 9;
            System.out.println(j);


        }












    }



}
