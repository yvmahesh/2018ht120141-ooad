package com.swigyy;

import java.util.ArrayList;
import java.util.List;

public class FoodMenuService
{
    public FoodMenuService(String endPoint, String restaurantId)
    {
       
    }

    public List<FoodMenuModel> getAllFoodMenu(String restaurantId)
    {
        List<FoodMenuModel> foodMenu = new ArrayList<FoodMenuModel>();
        foodMenu.add(new FoodMenuModel("001","001","Indian","Chicken Biryani" , 5, 250));
        foodMenu.add(new FoodMenuModel("001","002","Chinese","Chilli Chicken" , 4, 300));
        foodMenu.add(new FoodMenuModel("001","003","Mexican","Nachos" , 5, 250));
        foodMenu.add(new FoodMenuModel("001","004","Italian","Pasta" , 5, 200));
        
        return foodMenu;
    }
}