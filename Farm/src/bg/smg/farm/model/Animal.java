/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.farm.model;

import java.io.File;

public class Animal {
    public Animal(String type){
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public File getPhoto() {
        return photo;
    }
    String name;
    int weight;
    File photo;
    
}
