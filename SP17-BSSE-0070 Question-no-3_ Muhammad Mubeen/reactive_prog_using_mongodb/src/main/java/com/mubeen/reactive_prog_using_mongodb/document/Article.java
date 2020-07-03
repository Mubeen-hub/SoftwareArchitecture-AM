/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mubeen.reactive_prog_using_mongodb.document;

import org.springframework.data.annotation.Id;

/**
 *
 * @author mubeen
 */

public class Article {
    
    @Id
    private int id;
    private String vendor;
    private String description;
    private String label;

    public Article(int id, String vendor, String description, String label) {
        this.id = id;
        this.vendor = vendor;
        this.description = description;
        this.label = label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getVendor() {
        return vendor;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }
        
}
