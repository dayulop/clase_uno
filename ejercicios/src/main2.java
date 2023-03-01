public class main2 {
    public static void main(String[] args) {
        int primernumero = 5;
        int segundonumero = 14;
        int aux=primernumero;
        while(aux<=segundonumero){
            if((aux%2)==0){
                System.out.println(aux);
            }
            aux=aux+1;
        }
    }
}
