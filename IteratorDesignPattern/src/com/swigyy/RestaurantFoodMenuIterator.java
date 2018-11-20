package com.swigyy;

import java.util.List;

public class RestaurantFoodMenuIterator implements IIterator
{
    List<FoodMenuModel> items;
    int position = 0;

    public RestaurantFoodMenuIterator(List<FoodMenuModel> items)
    {
        this.items = items;
    }

    public Boolean HasNext()
    {
        if (position >= items.size() )
            return false;
        else
            return true;
    }

    public Object Next()
    {
        FoodMenuModel menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
