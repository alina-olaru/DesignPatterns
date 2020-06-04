package com.company;

public abstract class Item implements Cloneable {

    private String itemTtitle;
    private Double price;
    private Integer stoc;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getItemTtitle() {
        return itemTtitle;
    }

    public void setItemTtitle(String itemTtitle) {
        this.itemTtitle = itemTtitle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStoc() {
        return stoc;
    }

    public void setStoc(Integer stoc) {
        this.stoc = stoc;
    }
}
