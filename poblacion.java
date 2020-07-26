public class poblacion {

    double canHabitantes;
    double porcenDismi;
    int annos;

    public poblacion(){
        canHabitantes = 0;
        porcenDismi = 0;
        annos = 0;
    }
    public void setCanHabitantes(double canHabitantes){
        this.canHabitantes = canHabitantes;
    }
    public void setPorcenDismi(double porcenDismi){
        this.porcenDismi = porcenDismi;
    }
    public void setAnnos(int annos){
        this.annos = annos;
    }
    public Double getCanHabitantes(){
        return canHabitantes;
    }
    public Double getPorcenDismi(){
        return porcenDismi;
    }
    public int getAnnos(){
        return annos;
    }
    public double cantidadHab(){
        double habitantes =  canHabitantes;
        for (int i = 0; i < annos; i++) {
            habitantes = habitantes - (habitantes*porcenDismi);
        }
        return habitantes;
    }
    public int cantidadAnnos(){
        int annos = 1;
        double habitantes =  canHabitantes;
         while (habitantes >= canHabitantes/2){
            habitantes = habitantes - (habitantes*porcenDismi);
            annos++;
         }
         return annos-1;
    }

    public static void main(String[] args) {
        poblacion prueba1 = new poblacion();

        prueba1.setCanHabitantes(1500);
        prueba1.setPorcenDismi(0.20);
        prueba1.setAnnos(3);

        System.out.println(prueba1.getCanHabitantes());
        System.out.println(prueba1.getPorcenDismi());
        System.out.println(prueba1.getAnnos());

        System.out.println("la cantidad de habitantes en los años introducidos será de: "+prueba1.cantidadHab());
        System.out.println("La cantidad de años que deben pasar para que la poblacion se disminuya a la mitad es de: "+ prueba1.cantidadAnnos());
    }
}

//Jeliot

/*
public class poblacion {
    double canHabitantes;
    double porcenDismi;
    int annos;
    public poblacion(){
        canHabitantes = 0;
        porcenDismi = 0.0;
        annos = 0;
    }
    public void setCanHabitantes(double canHabitantes){
        this.canHabitantes = canHabitantes;
    }
    public void setPorcenDismi(double porcenDismi){
        this.porcenDismi = porcenDismi;
    }
    public void setAnnos(int annos){
        this.annos = annos;
    }
    public Double getCanHabitantes(){
        return canHabitantes;
    }
    public Double getPorcenDismi(){
        return porcenDismi;
    }
    public int getAnnos(){
        return annos;
    }
    public double cantidadHab(){
        double habitantes =  canHabitantes;
        for (int i = 0; i < annos; i++) {
            habitantes = habitantes - (habitantes*porcenDismi);
        }
        return habitantes;
    }
    public int cantidadAnnos(){
        int annos = 1;
        double habitantes =  canHabitantes;
         while (habitantes >= canHabitantes/2){
            habitantes = habitantes - (habitantes*porcenDismi);
            annos++;
         }
         return annos-1;
    }
}
public class principalPoblacion{
    public static void main() {
        double canHabitantes;
        double porcenDismi;
        int annos;

        poblacion prueba1 = new poblacion();

        System.out.println("Digite la cantidad actual de habitantes: ");
        canHabitantes = Input.readDouble();
        System.out.println("Digite el porcentaje de disminucion en forma decimal: ");
        porcenDismi = Input.readDouble();
        System.out.println("Ingrese la cantidad de años para la que desea proyectar la cantidad de habitantes: ");
        annos = Input.readInt();

        prueba1.setCanHabitantes(canHabitantes);
        prueba1.setPorcenDismi(porcenDismi);
        prueba1.setAnnos(annos);

        System.out.println("la cantidad de habitantes en los años introducidos será de: "+prueba1.cantidadHab());
        System.out.println("La cantidad de años que deben pasar para que la poblacion se disminuya a la mitad es de: "+ prueba1.cantidadAnnos());
    }
}
*/