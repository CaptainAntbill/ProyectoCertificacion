package com.models;

/**
 * Esta clase contiene todos los contructores, getters y setters del modelo Type
 *
 * @author Anthony Mejía
 * @version 02/03/2019/A
 */
public class Type {

    /**
     * Los variables que utilizamos para el modelo Type
     */
    private int id;
    private String type_shoe;

    /**
     * Constructores que ocuparemos en los metodos Dao
     */
    public Type(int id, String type_shoe) {
        this.id = id;
        this.type_shoe = type_shoe;
    }

    public Type(String type_shoe) {
        this.type_shoe = type_shoe;
    }

    /**
     * Creacion de Metodos Get y Set
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_shoe() {
        return type_shoe;
    }

    public void setType_shoe(String type_shoe) {
        this.type_shoe = type_shoe;
    }
}
