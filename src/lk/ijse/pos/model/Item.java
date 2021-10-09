package lk.ijse.pos.model;

public class Item {
    private String id;
    private String name;
    private String cost;

    public Item(String id, String name, String cost) {
        this.setId(id);
        this.setName(name);
        this.setCost(cost);
    }



    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}

