package potluck.domain;

public class Category {
	private int category_id;
	private CategoryName categoryName;
	
	//
	public Category(CategoryName categoryName) {
		this.categoryName = categoryName;
	}
	public CategoryName getCategoryName() {
		return categoryName;
	}
	public int getCategory_id() {
		return category_id;
	}
	
	public void display()
	{
		if(categoryName == CategoryName.BAKERY)
		{
			System.out.println("Category: bakery");
		}
		if(categoryName == CategoryName.MEAT)
		{
			System.out.println("Category: meat");
		}
		if(categoryName == CategoryName.VEGE)
		{
			System.out.println("Category: vegie");
		}
	}
}
