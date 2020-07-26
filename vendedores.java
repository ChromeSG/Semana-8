public class vendedores {
    private int ID;
    private char genero;
    private double salario;
    private double montoVenta;
    private int codComi;
    //constructor
    public vendedores(){
        ID = 0;
        genero = ' ';
        salario = 0;
        montoVenta = 0;
        codComi = 0;
    }
    //sets y gets
    public void setID(int ID){
        this.ID  = ID;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setMontoVenta(double montoVenta){
        this.montoVenta = montoVenta;
    }
    public void setCodComi(int codComi){
        this.codComi = codComi;
    }
    public int getID(){
        return ID;
    }
    public char getGenero(){
        return genero;
    }
    public double getSalario(){
        return salario;
    }
    public double getMontoVenta(){
        return montoVenta;
    }
    public double getCodComi(){
        return codComi;
    }
    //metodo para comisión
    public double comision(){
        double totalComi=0;
        if (genero == 'M' || genero == 'm'){
            switch (codComi) {
                case 1:
                    totalComi = montoVenta*0.10;
                    break;
                case 2:
                    totalComi = montoVenta*0.10;
                    break;
                case 3:
                    totalComi = montoVenta*0.10;
                    break;
                case 4:
                    totalComi = montoVenta*0.10;
                    break;
                case 5:
                    totalComi = montoVenta*0.10;
                    break;
                case 6:
                    totalComi = montoVenta*0.05;
                    break;
                case 7:
                    totalComi = montoVenta*0.05;
                    break;
                case 8:
                    totalComi = montoVenta*0.05;
                    break;
                case 10:
                    totalComi = montoVenta*0.05;
                    break;
                case 11:
                    totalComi = montoVenta*0.05;
                    break;
                case 12:
                    totalComi = montoVenta*0.05;
                    break;
                default:
                    totalComi = montoVenta*0.01;
                    break;
            }
        }
        if (genero == 'H' || genero == 'h'){
            switch (codComi){
                case 1:
                    totalComi = montoVenta*0.10;
                    break;
                case 2:
                    totalComi = montoVenta*0.10;
                    break;
                case 3:
                    totalComi = montoVenta*0.10;
                    break;
                case 4:
                    totalComi = montoVenta*0.05;
                    break;
                case 5:
                    totalComi = montoVenta*0.05;
                    break;
                case 6:
                    totalComi = montoVenta*0.05;
                    break;
                case 7:
                    totalComi = montoVenta*0.05;
                    break;
                case 8:
                    totalComi = montoVenta*0.05;
                    break;
                default:
                    totalComi = montoVenta*0.01;
                    break;
            }
        }
        return totalComi;
    }
    public double salario(){
        double salarioTotal = salario+comision();
        return salarioTotal;
    }

    public static void main(String[] args) {
        int ID;
        char genero;
        double salario;
        double montoVenta;
        int codComi;
        char continuar;

        vendedores vendedor1 = new vendedores();

        do{
            System.out.println("Digite el número de cédula: ");
            ID = 117370294;
            System.out.println("Ingrese el género del vendedor('h' para hombre, 'm' para mujer):");
            genero = 'h';
            System.out.println("Digite el salario: ");
            salario = 250000;
            System.out.println("Digite el monto de la venta realizada: ");
            montoVenta = 300000;
            System.out.println("Ingrese el código de comision del vendedor: ");
            codComi = 3;
            
            vendedor1.setID(ID);
            vendedor1.setGenero(genero);
            vendedor1.setSalario(salario);
            vendedor1.setMontoVenta(montoVenta);
            vendedor1.setCodComi(codComi);

            System.out.println("Ced: "+vendedor1.getID());
            System.out.println("Salario base: "+vendedor1.getSalario());
            System.out.println("Total de comisión: "+vendedor1.comision());
            System.err.println("Salario Total: "+vendedor1.salario());

            System.out.println("¿Desea continuar?(S/N)");
            continuar = 'n';
        }while(continuar == 'S' || continuar == 's');
    }

}

//Jeliot

/*
public class vendedores {
    int ID;
    char genero;
    double salario;
    double montoVenta;
    int codComi;
    //constructor
    public vendedores(){
        ID = 0;
        genero = ' ';
        salario = 0;
        montoVenta = 0;
        codComi = 0;
    }
    //sets y gets
    public void setID(int ID){
        this.ID  = ID;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setMontoVenta(double montoVenta){
        this.montoVenta = montoVenta;
    }
    public void setCodComi(int codComi){
        this.codComi = codComi;
    }
    public int getID(){
        return ID;
    }
    public char getGenero(){
        return genero;
    }
    public double getSalario(){
        return salario;
    }
    public double getMontoVenta(){
        return montoVenta;
    }
    public double getCodComi(){
        return codComi;
    }
    //metodo para comisión
    public double comision(){
        double totalComi=0;
        if (genero == 'M' || genero == 'm'){
            switch (codComi) {
                case 1:
                    totalComi = montoVenta*0.10;
                    break;
                case 2:
                    totalComi = montoVenta*0.10;
                    break;
                case 3:
                    totalComi = montoVenta*0.10;
                    break;
                case 4:
                    totalComi = montoVenta*0.10;
                    break;
                case 5:
                    totalComi = montoVenta*0.10;
                    break;
                case 6:
                    totalComi = montoVenta*0.05;
                    break;
                case 7:
                    totalComi = montoVenta*0.05;
                    break;
                case 8:
                    totalComi = montoVenta*0.05;
                    break;
                case 10:
                    totalComi = montoVenta*0.05;
                    break;
                case 11:
                    totalComi = montoVenta*0.05;
                    break;
                case 12:
                    totalComi = montoVenta*0.05;
                    break;
                default:
                    totalComi = montoVenta*0.01;
                    break;
            }
        }
        if (genero == 'H' || genero == 'h'){
            switch (codComi){
                case 1:
                    totalComi = montoVenta*0.10;
                    break;
                case 2:
                    totalComi = montoVenta*0.10;
                    break;
                case 3:
                    totalComi = montoVenta*0.10;
                    break;
                case 4:
                    totalComi = montoVenta*0.05;
                    break;
                case 5:
                    totalComi = montoVenta*0.05;
                    break;
                case 6:
                    totalComi = montoVenta*0.05;
                    break;
                case 7:
                    totalComi = montoVenta*0.05;
                    break;
                case 8:
                    totalComi = montoVenta*0.05;
                    break;
                default:
                    totalComi = montoVenta*0.01;
                    break;
            }
        }
        return totalComi;
    }
    public double salario(){
        double salarioTotal = salario+comision();
        return salarioTotal;
    }

}
public class PrincipalVendedores{
    public static void main() {
        int ID;
        char genero;
        double salario;
        double montoVenta;
        int codComi;
        char continuar;

        vendedores vendedor1 = new vendedores();

        do{
            System.out.println("Digite el número de cédula: ");
            ID = Input.readInt();
            System.out.println("Ingrese el género del vendedor('h' para hombre, 'm' para mujer):");
            genero = Input.readChar();
            System.out.println("Digite el salario: ");
            salario = Input.readDouble();
            System.out.println("Digite el monto de la venta realizada: ");
            montoVenta = Input.readDouble();
            System.out.println("Ingrese el código de comision del vendedor: ");
            codComi = Input.readInt();
            
            vendedor1.setID(ID);
            vendedor1.setGenero(genero);
            vendedor1.setSalario(salario);
            vendedor1.setMontoVenta(montoVenta);
            vendedor1.setCodComi(codComi);
			
			System.out.println("Ced: "+vendedor1.getID());
            System.out.println("Salario base: "+vendedor1.getSalario());
            System.out.println("Total de comisión: "+vendedor1.comision());
            System.err.println("Salario Total: "+vendedor1.salario());

            System.out.println("¿Desea continuar?(S/N)");
            continuar = Input.readChar();
        }while(continuar == 'S'|| continuar == 's');
    }
}
*/

