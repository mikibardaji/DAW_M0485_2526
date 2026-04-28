/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class Luchador {
    private int id;
    private String name;
    private double weight;
    private String category;
    private int wins;
    private int totalFights;

    public Luchador(int id, String name, double weight, int wins, int totalFights) {
        this.id = id;
        this.name = name;
        setWeight(weight);
        this.wins = wins;
        this.totalFights = totalFights;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        if (weight<=70)
        {
            category = "Lleuger";
        }
        else if (weight>70 && weight<90)
        {
            category = "Mig";
        }
        else
        {
            category = "Pesat";
                    
        }
    }

    public static String getCategory(double weight)
    {
        if (weight<=70)
        {
            return "Lleuger";
        }
        else if (weight>70 && weight<90)
        {
            return "Mig";
        }
        else
        {
            return "Pesat";
                    
        }
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setTotalFights(int totalFights) {
        this.totalFights = totalFights;
    }

    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public int getWins() {
        return wins;
    }

    public int getTotalFights() {
        return totalFights;
    }
    
    
    public double percentajeWins()
    {
        if (totalFights==0) return 0;
        else
        {
            double percent = (double) wins/totalFights *100;
            return percent;
        }
    }

    @Override
    public String toString() {
        return "Luchador con id" + id + ", name=" + name + ", weight=" + weight + ", category=" + category + ", wins=" + wins + ", totalFights=" + totalFights 
                + " % Wins: " + percentajeWins();
    }
    
    
}
