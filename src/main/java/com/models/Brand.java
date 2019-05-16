package com.models;

/**
 * Esta clase contiene todos los contructores, getters y setters del modelo
 * Brand
 *
 * @author Anthony Mejía
 * @version 02/03/2019/A
 */
public class Brand {

    /**
     * Los variables que utilizamos para el modelo Brand
     */
    private int id;
    private String name_brand;

    /**
     * Constructores que ocuparemos en los metodos Dao
     */
    public Brand(int id, String name_brand) {
        this.id = id;
        this.name_brand = name_brand;
    }

    public Brand(String name_brand) {
        this.name_brand = name_brand;
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

    public String getName_brand() {
        return name_brand;
    }

    public void setName_brand(String name_brand) {
        this.name_brand = name_brand;
    }
}
