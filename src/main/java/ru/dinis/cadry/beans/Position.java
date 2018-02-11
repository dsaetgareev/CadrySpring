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
public class Position implements Serializable {

   private List<String> positions = new ArrayList<String>();

   @Autowired
   public void fillPositions() {
       this.positions.add("Все сотрудники");
       this.positions.add("ЛПО 1");
       this.positions.add("ЛПО 2");
       this.positions.add("Хирургия");
       this.positions.add("Ортопедия");
       this.positions.add("Администарция");
       this.positions.add("Прочие");
   }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}
