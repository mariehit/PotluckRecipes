package potluck.domain;

/*
 * holds all the information for categories
 */
public class Category {
	private int category_id;
	private CategoryName categoryName;
	
	/*
	 * default constructor
	 */
	public Category(CategoryName categoryName) {
		this.categoryName = categoryName;
	}
	/*
	 * returns categoryName
	 */
	public CategoryName getCategoryName() {
		return categoryName;
	}
	/*
	 * returns categoryID
	 */
	public int getCategory_id() {
		return category_id;
	}
	/*
	 * prints out what category it is
	 */
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
		if(categoryName == CategoryName.VEGGIE)
		{
			System.out.println("Category: vegie");
		}
	}
}
