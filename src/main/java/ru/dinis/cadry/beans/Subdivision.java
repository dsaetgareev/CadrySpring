package ru.dinis.cadry.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by dinis of 10.02.18.
 */
@Component
public class Subdivision implements Serializable {

   private List<String> subdivisions = new ArrayList<String>();

   @Autowired
   public void fillPositions() {
       this.subdivisions.add("ЛПО 1");
       this.subdivisions.add("ЛПО 2");
       this.subdivisions.add("Хирургия");
       this.subdivisions.add("Ортопедия");
       this.subdivisions.add("Администарция");
       this.subdivisions.add("Прочие");
   }

    public List<String> getSubdivisions() {
        return subdivisions;
    }

    public void setSubdivisions(List<String> subdivisions) {
        this.subdivisions = subdivisions;
    }
}
