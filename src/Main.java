public class Main {
    public static void main(String[] args) {

        boolean boolean1 = 2 <= 2 && !true;
        System.out.println(boolean1);

        boolean boolean2 = !false && 3 > 2;
        System.out.println(boolean2);

        boolean t = false;
        boolean f = true;
        boolean boolean3 = !(!t || f);
        System.out.println(boolean3);

        boolean boolean4 = 6 > 6 ^ !(true && true);
        System.out.println(boolean4);

    }
}
/*[A]: 2 <= 2 && !true     false
[B]: !false && 3 > 2       true
[C]: considering that t=false and f=true: !(!t || f)   false
[D]: 6 > 6 ^ !(true && true) false  */