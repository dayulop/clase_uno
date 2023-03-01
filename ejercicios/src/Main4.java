public class Main4 {
    public static void main(String[] args) {
        int primernumero = 5;
        int segundonumero = 14;
        int aux=segundonumero;
        boolean selector = true;
        for(int i=0; i<9;i++) {
            if (selector == true) {//primos
                if ((aux % 2) == 0) {
                    System.out.println(aux);
                }
            } else {//no primos
                if ((aux % 2) != 0) {
                    System.out.println(aux);
                }
            }
            aux = aux - 1;
        }
    }
}
