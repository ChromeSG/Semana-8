public class bebe {

    String nombre;
    double estatura;

    public bebe(){
        nombre = "";
        estatura = 0;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public String getNombre(){
        return nombre;
    }
    public double getEstatura(){
        return estatura;
    }
    public double futuraEstatura(){
        double estaturaTotal = estatura;
        for (int i = 1; i <= 6; i++) {
            estaturaTotal = estaturaTotal + (estaturaTotal*0.10);
        }
        for(int i = 7; i <= 12; i++){
            estaturaTotal = estaturaTotal + (estaturaTotal*0.05);
        }
        return estaturaTotal;
    }
    public int estaturaDoblada(){
        int meses = 1;
        double estaturaTotal=estatura;
        while(estaturaTotal <= estatura*2 && meses <=6){
            estaturaTotal = estaturaTotal + (estaturaTotal*0.10);           
            meses++;
        }
        while (estaturaTotal <= estatura*2 && meses <=12) {
            estaturaTotal = estaturaTotal + (estaturaTotal*0.05);   
            meses++;
        }
        return meses;
    }

    public static void main(String[] args) {
        bebe bebe1 = new bebe();

        bebe1.setNombre("DANA");
        bebe1.setEstatura(10);

        System.out.println(bebe1.getNombre());
        System.out.println(bebe1.getEstatura());
        System.out.println("La estatura del bebé despues de 1 año va a ser: "+bebe1.futuraEstatura());
        System.out.println("Los meses que deben pasar para que el bebé tenga el doble de estatura es de: "+bebe1.estaturaDoblada());
    }

}



//Jeliot//

/*
public class bebe {

    String nombre;
    double estatura;

    public bebe(){
        nombre = "";
        estatura = 0;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public String getNombre(){
        return nombre;
    }
    public double getEstatura(){
        return estatura;
    }
    public double futuraEstatura(){
        double estaturaTotal = estatura;
        for (int i = 1; i <= 6; i++) {
            estaturaTotal = estaturaTotal + (estaturaTotal*0.10);
        }
        for(int i = 7; i <= 12; i++){
            estaturaTotal = estaturaTotal + (estaturaTotal*0.05);
        }
        return estaturaTotal;
    }
    public int estaturaDoblada(){
        int meses = 1;
        double estaturaTotal=estatura;
        while(estaturaTotal <= estatura*2 && meses <=6){
            estaturaTotal = estaturaTotal + (estaturaTotal*0.10);           
            meses++;
        }
        while (estaturaTotal <= estatura*2 && meses <=12) {
            estaturaTotal = estaturaTotal + (estaturaTotal*0.05);   
            meses++;
        }
        return meses;
    }
}

public class principalBebe{
    public static void main() {
        String nombre;
        double estatura;

        bebe bebe1 = new bebe();

        System.out.println("Ingrese el nombre del bebé: ");
        nombre = Input.readString();

        System.out.println("Ingrese la estatura del bebé: ");
        estatura = Input.readDouble();

        bebe1.setNombre(nombre);
        bebe1.setEstatura(estatura);
        
        System.out.println(bebe1.getNombre());
        System.out.println(bebe1.getEstatura());
        System.out.println("La estatura del bebé despues de 1 año va a ser: "+bebe1.futuraEstatura());
        System.out.println("Los meses que deben pasar para que el bebé tenga el doble de estatura es de: "+bebe1.estaturaDoblada());
    }
}
*/