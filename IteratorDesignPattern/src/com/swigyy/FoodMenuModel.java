package com.swigyy;

public class FoodMenuModel
{
	public FoodMenuModel(String RestaurantId ,String foodId, String foodName ,
			String cuisine, int i, int j)
	{
		setRestaurantId(RestaurantId);
		setFoodId(foodId);
		setFoodname(foodName);
		setCuisine(cuisine);
		setRate(i);
		setRating(j);
	}
    private String restaurantId;
    private String foodId;
    private String foodname;
    private String cuisine;
    public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	private int rate;
    private int rating;
    
  
}