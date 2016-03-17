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
}
