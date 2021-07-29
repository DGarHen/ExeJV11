package codewars;

public class digitalRoot {
    public static int my_digital_root(int n) {
        int suma=0;
        while(n>=10){
            suma=suma+n%10;
            n=n/10;
        }
        suma=suma+n;
        if(suma>=10){
            return my_digital_root(suma);
        }else{
            return suma;
        }
    }

    public static int best_digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
