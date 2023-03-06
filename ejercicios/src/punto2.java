public class punto2 {
    public static void main(String[] args){
        //persona
        int ingresos = 50090;
        int vehiculos = 0;
        int casas= 0;
        int envarcaciones = 0;

        int ing=0;
        int veh=0;
        int cas=0;
        int env=0;

        if((ingresos>=163.539) && (ingresos<=572386.50)){
            ing=1;
        } else if (ingresos>572386.50) {
            ing=2;
        }
        if(vehiculos==1){
            veh=1;
        } else if (vehiculos>1) {
            veh=2;
        }
        if(casas<=2){
            cas=0;
        }
        if(envarcaciones>=1){
            env=2;
        }


        if(((ing==1)||(veh==1)||(cas==1))&&(env==0)){
            System.out.println("la persona pertenece al segundo segmento, el de ingresos medios");
        } else if ((ing==2)||(veh==2)||(cas==2)||(env==2)) {
            System.out.println("la persona pertenece al tercer segmento, el de ingresos altos");
        }else {
            System.out.println("la persona pertenece al primer segmento, el de ingresos bajos");
        }
    }
}
