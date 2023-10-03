package proyecto1_poo;

/**
 * Archivo correspondiente a la clase Fecha
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Fecha{
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor del objeto Fecha, inicializa los atributos con los valores que recibe como parametros.
     * @param dia Dia del año en numeros
     * @param mes Mes del año en numeros
     * @param anio Añp con numeros
    */

    public Fecha(int dia, int mes, int anio){
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }
    
    /**
     * Getter del atributo dia
     * @return Valor que tiene el atributo dia
    */

    public int getDia(){
        return dia;
    }

    /**
     * Setter del atributo dia
     * @param dia Valor con el que se quiere actualizar el atributo dia
    */

    public void setDia(int dia){
        if(dia>0 && dia<32){
            this.dia = dia;
        }else{
            System.out.println("Dia no valido");
        }
    }

    /**
     * Getter del atributo mes
     * @return Valor que tiene el atributo mes
    */

    public int getMes(){
        return mes;
    }

    /**
     * Setter del atributo mes
     * @param mes Valor con el que se quiere actualizar el atributo mes
    */

    public void setMes(int mes){
        if(mes>0 && mes<13){
            this.mes = mes;
        }else{
            System.out.println("Mes no valido");
        }
    }

    /**
     * Getter del atributo anio
     * @return Valor que tiene el atributo anio
    */

    public int getAnio(){
        return anio;
    }

    /**
     * Setter del atributo anio
     * @param anio Valor con el que se quiere actualizar el atributo anio
    */

    public void setAnio(int anio){
        if(anio>0){
            this.anio = anio;
        }else{
            System.out.println("El anio no puede ser negativo");
        }
    }

    /**
     * Este metodo permite darle un formato a la fecha
     * @return Cadena con el dormato dia/mes/anio
    */

    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
}
