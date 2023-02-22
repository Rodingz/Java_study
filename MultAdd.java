public class MultAdd{
    public static double multAdd(double a, double b, double c){
        return a*b+c;
    }
    public static void main(String[] args){
        System.out.println(multAdd(1.0, 2.0, 3.0));
        System.out.println(multAdd(Math.cos(Math.PI/4), 1.0, Math.sin(Math.PI/4)/3));
        System.out.println(multAdd(Math.log(10), 1.0, Math.log(20)));
        yikes(1.0);
    }
    public static void yikes(double x){
        System.out.println(multAdd(x*Math.exp(-x), 1.0, Math.sqrt(1.0 - Math.exp(-x))));
    }
}