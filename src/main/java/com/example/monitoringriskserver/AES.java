package com.example.monitoringriskserver;


import javax.persistence.Column;
import javax.persistence.Converts;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "AESeS")
public class AES {
    @Id
    private int id;
    @Column(unique = true)
    private String photo;
    @Column(unique = true)
    private String name;

    private String discription;

    //@Converts(ConverterSList.class)
    //private ArrayList<Long> list_ids_diagram = new ArrayList<>();

    public AES(String name) {
        this.name = name;
        this.id = name.hashCode();

    }

    public AES(String photo, String name, String discription) {
        this.photo = photo;
        this.name = name;
        this.discription = discription;
        this.id = name.hashCode();
    }

    public AES() {

    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public void setList_ids_diagram(List<Long> list_ids_diagram) {

        this.list_ids_diagram = list_ids_diagram;
    }

    public List<Long> getList_ids_diagram() {
        return list_ids_diagram;
    }


 */


    public void setDiscription(String discription) {
        this.discription = discription;
    }
/*
    public void setList_diagram(List<Diagram> list_diagram) {

        list_diagram = list_diagram.stream().map(diagram -> {diagram.setIdAES(id); return diagram;}).collect(Collectors.toList());
        System.out.println(list_diagram.get(0).getIdAES());
        StaticTables.getInstance().daoDiagram.deleteByidAES(Integer.valueOf(id));
        StaticTables.getInstance().daoDiagram.add(list_diagram);
        System.out.println(StaticTables.getInstance().daoDiagram.getdiagramsbyidAES(id).size());

    }


 */
    /*
    public List<Diagram> getList_diagram() {
        return StaticTables.getInstance().daoDiagram.getdiagramsbyidAES(id);
    }


     */
    @Override
    public String toString() {
        return "AES{" +
                "id=" + id +
                ", Photo='" + photo + '\'' +
                ", Name='" + name + '\'' +
                ", Discription='" + discription + '\'' +
                '}';
    }
}

