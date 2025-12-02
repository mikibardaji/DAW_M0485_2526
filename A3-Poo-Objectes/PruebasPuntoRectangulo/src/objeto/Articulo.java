/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto;

public class Articulo {
    public String nombre;
    public double precio;
    public double iva;
    public int cuantosQuedan;

    //Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y cuantosQuedan. 
    // Dicho constructor deberá mostrar un mensaje de error si alguno de los valores nombre, precio, iva o 
    // cuantosQuedan no son válidos. ¿Qué coindiciones crees que podrían determinar si son válidos o no? 
    // Razónalo e implementa el código. Corrige el main y prueba a crear varios artículos. 
    // Introduce algunos con valores incorrectos para comprobar si avisa del error.
    
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
//        this.setNombre(nombre);
//        this.setPrecio(precio);
//        this.setIva(iva);
//        this.setCuantosQuedan(cuantosQuedan);
        boolean error = false;
        if (nombre == null || nombre.isEmpty()) {
            System.err.println("Error: Nombre no válido.");
            error = true;
        }
        if (precio < 0) {
            System.err.println("Error: Precio no válido.");
            error = true;
        }
        if (iva < 0 || iva > 1) {
            System.err.println("Error: IVA no válido.");
            error = true;
        }
        if (cuantosQuedan < 0) {
            System.err.println("Error: Cantidad no válida.");
            error = true;
        }
        if (!error)
        { //solo asigno nuevos valores si eran correctos
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
        else
        {
             this.nombre = "";
        }
        
    }
        public String getNombre() {
            return nombre;
        }
        public double getPrecio() {
            return precio;
        }
        public double getIva() {
            return iva;
        }
        public int getCuantosQuedan() {
            return cuantosQuedan;
        }
        public void setNombre(String nombre) {
            if (nombre == null || nombre.isEmpty()) {
            System.err.println("Error: Nombre no válido.");
            }
            else
            {
                this.nombre = nombre;
            }
            
        }
        public void setPrecio(double precio) {
            if (precio < 0) {
            System.err.println("Error: Precio no válido.");
            }
            else
            {
                this.precio = precio;
            }
            
        }
        public void setIva(double iva) {
         if (iva < 0 || iva > 1) {
            System.err.println("Error: IVA no válido.");
            }
         else
         {
             this.iva = iva;
         }
            
        }
        public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.err.println("Error: Cantidad no válida.");
            }
        else
            {
            this.cuantosQuedan = cuantosQuedan;
            }
        }

        // Método para imprimir la información del artículo por pantalla.
        public void imprimirInfo() {
            System.out.println("Artículo: " + nombre + ", Precio: " + precio + ", IVA: " + iva + ", Cuántos quedan: " + cuantosQuedan);
        }

        //Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
        public double getPVP() {
            return precio * (1 + iva);
        }

        //Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
        public double getPVPDescuento(double descuento) {
            double pvp = getPVP(); //obtienes el precio con IVA
            return pvp * (1 - descuento); 
        }
        
        //Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es
// posible). Devolverá true si ha sido posible (false en caso contrario).
        public boolean vender(int ventas)
        {
            if (ventas<0
                || cuantosQuedan<ventas)
            {
                System.err.println("No puedo venderte " + ventas + " me quedan " + cuantosQuedan);
                return false;
            }
            else
            {
                this.cuantosQuedan -= ventas;
                return true; 
            }
        }

}

