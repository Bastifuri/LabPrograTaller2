/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author Basti
 */
public class Café {
    private String nombreC;
    private int gramCaf;
    private int mlagua;
    private ArrayList<Cafeteria> arraycafe;

    public Café(String nombreC, int gramCaf, int mlagua, ArrayList<Cafeteria> arraycafe) {
        this.nombreC = nombreC;
        this.gramCaf = gramCaf;
        this.mlagua = mlagua;
        this.arraycafe = arraycafe;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getGramCaf() {
        return gramCaf;
    }

    public void setGramCaf(int gramCaf) {
        this.gramCaf = gramCaf;
    }

    public int getMlagua() {
        return mlagua;
    }

    public void setMlagua(int mlagua) {
        this.mlagua = mlagua;
    }

    public ArrayList<Cafeteria> getArraycafe() {
        return arraycafe;
    }

    public void setArraycafe(ArrayList<Cafeteria> arraycafe) {
        this.arraycafe = arraycafe;
    }
    
}
