public class Main3 {
    public static void main(String[] args) {
        int primernumero = 5;
        int segundonumero = 14;
        int aux=primernumero;
        boolean selector = false;
        while(aux<=segundonumero){
            if(selector==true){//primos
                if((aux%2)==0){
                    System.out.println(aux);
                }
            }else{//no primos
                if((aux%2)!=0){
                    System.out.println(aux);
                }
            }
            aux=aux+1;
        }
    }
}
