package ClpOutputFindings;

interface Aa {
    int x = 10;
}
interface Bb {
    int x = 20;
}
interface C extends Aa, Bb{
    int x = 30;
    public static void main(String[] args){
        int a = Aa.x;
        int b = Bb.x;
        int c = C.x;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
