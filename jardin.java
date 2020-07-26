public class jardin {
    private double impuesto = 0.13;
    double largo;
    double ancho;
    int zacate;
    //Constructor
    public jardin(){
        largo = 0;
        ancho = 0;
        zacate = 0;
    }
    //sets y gets
    public void setLargo(double largo){
        this.largo = largo;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setZacate(int zacate){
        this.zacate = zacate;
    }
    public double getLargo(){
        return largo;
    }
    public double getAncho(){
        return ancho;
    }
    public String getZacate(){
        String mensaje = "";
        switch (zacate){
            case 1:
                mensaje = "Criollo";
                break;
            case 2:
                mensaje = "Americano";
                break;
            case 3:
                mensaje = "Sintético";
                break;
            default:
                mensaje = "El código para el zacate es erroneo, este debe estar entre 1 y 3";
                break;
        }
        return mensaje;
    }
    //metodo para conocer los metros a enzacatar
    public double areaEnzacatar(){
        double totalArea = largo * ancho;
        return totalArea;
    }
    //Metodo para el costo de mano de obra
    public double costoMdO(){
        double costo = areaEnzacatar()*500;
        return costo;
    }
    //Metodo para conocer el costo del zacate
    public double costoZaca(){
        double costo = 0;
        switch (zacate){
            case 1:
                costo = 1000 * areaEnzacatar();
                break;
            case 2:
                costo = 1500 * areaEnzacatar();
                break;
            case 3:
                costo = 2000 * areaEnzacatar();
                break;
        }
        return costo;
    }
    //Metodo para conocer el total de impuesto
    public double totalImp(){
        double totImp = (costoMdO()+costoZaca())*impuesto;
        return totImp;
    }
    //Metodo para el total a pagar
    public double totalPagar(){
        double pagoTotal = costoMdO()+costoZaca()+totalImp();
        return pagoTotal;
    }
    public static void main(String[] args) {
        double largo;
        double ancho;
        int zacate;

        jardin jardin1 = new jardin();

        System.out.println("Ingrese el largo del jardín: ");
        largo = 20;
        System.out.println("Ingrese el ancho del jardín: ");
        ancho = 10;
        System.out.println("Digite el código del zacata que desea utilizar: ");
        zacate = 2;

        jardin1.setLargo(largo);
        jardin1.setAncho(ancho);
        jardin1.setZacate(zacate);

        System.out.println("Largo del jardín: "+jardin1.getLargo());
        System.out.println("Ancho del jardín: "+jardin1.getAncho());
        System.out.println("Metros cuadrados a enzacatar: "+jardin1.areaEnzacatar());
        System.out.println("Tipo de zacate a usar: "+ jardin1.getZacate());
        System.out.println("Costo de mano de obra: "+ jardin1.costoMdO());
        System.out.println("Costo del zacate: "+ jardin1.costoZaca());
        System.out.println("Total de impuestos: "+ jardin1.totalImp());
        System.out.println("Total a pagar: "+ jardin1.totalPagar());
    }
}

//Jeliot
/*
public class jardin {
    private double impuesto = 0.13;
    double largo;
    double ancho;
    int zacate;
    //Constructor
    public jardin(){
        largo = 0;
        ancho = 0;
        zacate = 0;
    }
    //sets y gets
    public void setLargo(double largo){
        this.largo = largo;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setZacate(int zacate){
        this.zacate = zacate;
    }
    public double getLargo(){
        return largo;
    }
    public double getAncho(){
        return ancho;
    }
    public String getZacate(){
        String mensaje = "";
        switch (zacate){
            case 1:
                mensaje = "Criollo";
                break;
            case 2:
                mensaje = "Americano";
                break;
            case 3:
                mensaje = "Sintético";
                break;
            default:
                mensaje = "El código para el zacate es erroneo, este debe estar entre 1 y 3";
                break;
        }
        return mensaje;
    }
    //metodo para conocer los metros a enzacatar
    public double areaEnzacatar(){
        double totalArea = largo * ancho;
        return totalArea;
    }
    //Metodo para el costo de mano de obra
    public double costoMdO(){
        double costo = areaEnzacatar()*500;
        return costo;
    }
    //Metodo para conocer el costo del zacate
    public double costoZaca(){
        double costo = 0;
        switch (zacate){
            case 1:
                costo = 1000 * areaEnzacatar();
                break;
            case 2:
                costo = 1500 * areaEnzacatar();
                break;
            case 3:
                costo = 2000 * areaEnzacatar();
                break;
        }
        return costo;
    }
    //Metodo para conocer el total de impuesto
    public double totalImp(){
        double totImp = (costoMdO()+costoZaca())*impuesto;
        return totImp;
    }
    //Metodo para el total a pagar
    public double totalPagar(){
        double pagoTotal = costoMdO()+costoZaca()+totalImp();
        return pagoTotal;
    }
}
public class PrincipalJardin{
    public static void main() {
        double largo;
        double ancho;
        int zacate;

        jardin jardin1 = new jardin();

        System.out.println("Ingrese el largo del jardín: ");
        largo = Input.readDouble();
        System.out.println("Ingrese el ancho del jardín: ");
        ancho = Input.readDouble();
        System.out.println("Digite el código del zacata que desea utilizar: ");
        zacate = Input.readInt();

        jardin1.setLargo(largo);
        jardin1.setAncho(ancho);
        jardin1.setZacate(zacate);

        System.out.println("Largo del jardín: "+jardin1.getLargo());
        System.out.println("Ancho del jardín: "+jardin1.getAncho());
        System.out.println("Metros cuadrados a enzacatar: "+jardin1.areaEnzacatar());
        System.out.println("Tipo de zacate a usar: "+ jardin1.getZacate());
        System.out.println("Costo de mano de obra: "+ jardin1.costoMdO());
        System.out.println("Costo del zacate: "+ jardin1.costoZaca());
        System.out.println("Total de impuestos: "+ jardin1.totalImp());
        System.out.println("Total a pagar: "+ jardin1.totalPagar());
    }
}
*/