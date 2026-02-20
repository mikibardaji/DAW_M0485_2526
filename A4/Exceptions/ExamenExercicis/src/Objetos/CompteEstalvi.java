/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class CompteEstalvi {
    private String titular;
    private double saldo;
    private double limiteRetirada;
    
    
    public CompteEstalvi(String titular, double saldo, double limiteRetirada) {
        if (titular==null || titular.length()<5)
        {
            System.out.println("Nombre invalido");
            titular = "NomInvalid";
            limiteRetirada = 0;
        }
        else
        {
            this.titular = titular;
        }
        if (saldo<0)
        {
            System.out.println("Saldo entrada no valido");
            this.saldo = 0;
        }
        else
        {
            this.saldo = saldo;
        }
        
        this.limiteRetirada = limiteRetirada;
    }
    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws NomInvalidException {
        if (titular==null || titular.length()<5)
        {
            throw new NomInvalidException();
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws QuantitatNoValidaException {
        if (saldo<0)
        {
            throw new QuantitatNoValidaException("saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public double getLimiteRetirada() {
        return limiteRetirada;
    }

    public void setLimiteRetirada(double limiteRetirada) throws QuantitatNoValidaException {
        if (limiteRetirada<0)
        {
            throw new QuantitatNoValidaException("Limite retirada  no puede ser negativo");
        }
        this.limiteRetirada = limiteRetirada;
    }


    public void retirar(double quantitat) throws QuantitatNoValidaException
    {
        if (quantitat > saldo)
        {
            throw new QuantitatNoValidaException("No tienes suficiente dinero");
        }
        if (quantitat > limiteRetirada)
        {
           throw new QuantitatNoValidaException("Tienes un limite retirada inferior"); 
        }
        saldo -= quantitat;
    }

    public double repartirHerencia(int fills)
    {
        return saldo/fills;
    }
    
}
