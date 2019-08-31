package Model;

public class Food {
	private String FoodName;
	private int ItemNo;
	private double UnitPrice;
	private String Category;

	public Food() {
		FoodName="";
		ItemNo=0;
		UnitPrice=0;
		Category="";
	}

	public Food(int itemno2, String foodname2, int unitprice2, String category2) {
		FoodName=foodname2;
		ItemNo=itemno2;
		UnitPrice=unitprice2;
		Category=category2;
	}

	public String getFoodName() {
		return FoodName;
	}

	public void setFoodName(String foodName) {
		FoodName = foodName;
	}

	public int getItemNo() {
		return ItemNo;
	}

	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

}
