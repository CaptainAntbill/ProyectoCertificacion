package com.models;

/**
 * Esta clase contiene todos los contructores, getters y setters del modelo
 * Model
 *
 * @author Anthony Mejía
 * @version 03/03/2019/A
 */
public class Model {

    /**
     * Las variables que utilizamos para el modelo Brand
     */
    private int id;
    private String name_model;
    private String price;
    private String units;
    private int type_id;
    private int brand_id;
    private String branShoe;
    private String typeShoe;
    private Brand brand;
    private Type type;

    /**
     * Constructores que ocuparemos en los metodos Dao
     */
    public Model(String name_model, String price, String units, int type_id, int brand_id) {
        this.name_model = name_model;
        this.price = price;
        this.units = units;
        this.type_id = type_id;
        this.brand_id = brand_id;
    }

    public Model(int id, String name_model, Brand brand) {
        this.id = id;
        this.name_model = name_model;
        this.brand = brand;
       
    }

    public Model(int id, String name_model, Type type) {
        this.id = id;
        this.name_model = name_model;
        this.type = type;
    }

    public Model(int id, String name_model, String price, String units, String branShoe, String typeShoe) {
        this.id = id;
        this.name_model = name_model;
        this.price = price;
        this.units = units;
        this.branShoe = branShoe;
        this.typeShoe = typeShoe;
    }

    public Model(int id, String name_model, String price, String units) {
        this.id = id;
        this.name_model = name_model;
        this.price = price;
        this.units = units;
    }
    
    /**
     * Creacion de Metodos Get y Set
     */
    public int getId() {
        return id;
    }

    public String getName_model() {
        return name_model;
    }

    public void setName_model(String name_model) {
        this.name_model = name_model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public String getBrand() {
        return brand.getName_brand();
    }

    public String getType(){
        return type.getType_shoe();
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBranShoe() {
        return branShoe;
    }

    public void setBranShoe(String branShoe) {
        this.branShoe = branShoe;
    }

    public String getTypeShoe() {
        return typeShoe;
    }

    public void setTypeShoe(String typeShoe) {
        this.typeShoe = typeShoe;
    }

}
