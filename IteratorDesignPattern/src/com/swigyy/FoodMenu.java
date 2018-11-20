package com.swigyy;

import java.util.List;

public class FoodMenu implements IFoodMenu
{
    private String restaurantId;
    public FoodMenu(String restaurantId)
    {
        this.restaurantId = restaurantId;
    }
    
	public List<FoodMenuModel> GetFoodMenuItems()
    {
        FoodMenuService foodMenuService = new FoodMenuService(null, restaurantId);
        List<FoodMenuModel> foodMenuItems = foodMenuService.getAllFoodMenu(restaurantId);

        return foodMenuItems;
    }

    public IIterator CreateFoodMenuIterator()
    {
    	List<FoodMenuModel> foodMenuItems = GetFoodMenuItems();
        return (IIterator) new RestaurantFoodMenuIterator(foodMenuItems);
    }
}
