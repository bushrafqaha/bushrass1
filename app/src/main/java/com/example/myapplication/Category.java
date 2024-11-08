package com.example.myapplication;

public class Category {
    private String name;
    private String description;
    private int imageID;

    public static final Category[] category = {
            new Category(
                    "Healthy Foods for the Brain",
                    "Foods that promote brain health include fatty fish, blueberries, turmeric, broccoli, pumpkin seeds, dark chocolate, and nuts. These foods contain antioxidants, healthy fats, vitamins, and minerals that help improve memory, concentration, and overall brain function.",
                    R.drawable.food
            ),

            new Category("Brain Games", "Games To Test your mind", R.drawable.game),
            new Category("Sleep hours", "sleep will to do wll", R.drawable.sleep),
            new Category("Feelings", "Your brain work better when you are happy ", R.drawable.feeling)
    };


    private Category(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public String getDescription(){return description;}
    public int getImageID(){return imageID;}

    @Override
    public String toString(){return name;}
}