package clases;

/**
 * Clase para guardar los datos de una cuenta bancaria
 * Los datos que se guardan son el nombre de la persona que tiene la cuenta, el tipo de cuenta, el saldo de la cuenta y los intereses
 * @author David
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * 
     * @return el nombre de la persona
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * 
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return el tipo de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * 
	 * @return el saldo que hay actualmente en la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return el interes de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * 
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	
	/**
	 * Declaración de la clase sin parametros
	 */
    public CCuenta()
    {
    }
    
    /**
     * Declaración de la clase con los siguientes parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * @return devuelve el saldo actual de la cuenta, es identico al método getSaldo, por lo que podríamos omitirlo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     *  Metodo para añadir saldo a la cuenta, si la cantidad introducida es negativa salta una excepción
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     *  Metodo para retirar dinero de la cuenta, si la cantidad es negativa o si la cantidad a retirar es mayor al saldo salta la excepción
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
