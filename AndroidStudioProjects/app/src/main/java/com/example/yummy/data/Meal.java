package com.example.yummy.data;


public class Meal {
    int id;
    String name,ingredients,directions;
    public Meal(int id,String name, String ingredients, String directions) {
        this.id=id;
        this.name=name;
        this.ingredients=ingredients;
        this.directions=directions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }


}
