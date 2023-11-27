public class Main3 {
    public static double perimetroRettangolo(double lato1 , double lato2){
        return  (lato1 + lato2) + (lato1 + lato2);
    }
    public static int pariDispari(int num){
      return num % 2;
    }
    public static double perimetroTriangolo(double a,double b,double c) {
        double semiperimetro = (a + b + c) / 2;
  //      double area = java.lang.Math.sqrt(p(p - a) * (p - b) * (p - c));
    return semiperimetro;
    }
}
