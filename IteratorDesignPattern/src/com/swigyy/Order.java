package com.swigyy;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private String restaurantId;
    FoodMenu foodMenu;
    public Order(String restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    public List<FoodMenuModel> PrintFoodMenu()
    {
        foodMenu = new FoodMenu(restaurantId);
        IIterator restaurantFoodMenu = foodMenu.CreateFoodMenuIterator();
        return PrintFoodMenu(restaurantFoodMenu);
    }

    private List<FoodMenuModel> PrintFoodMenu(IIterator iterator)
    {
        System.out.println("Food Menu");
        
        List<FoodMenuModel> foodMenu = new ArrayList<FoodMenuModel>();

        while (iterator.HasNext())
        {
            FoodMenuModel foodMenuItem = (FoodMenuModel)iterator.Next();
            foodMenu.add(foodMenuItem);

            System.out.println("Restaurant ID : "+ foodMenuItem.getRestaurantId());
            System.out.println("Food ID : "+ foodMenuItem.getFoodId());
            System.out.println("Food Name : "+ foodMenuItem.getFoodname());
            System.out.println("Couisine : "+ foodMenuItem.getCuisine());
            System.out.println("Rate(Rs.) : "+ foodMenuItem.getRate());
            System.out.println("Rating : "+ foodMenuItem.getRating());
            System.out.println("____________________________");
            System.out.println();
        }

        return foodMenu;
    }
   
}
