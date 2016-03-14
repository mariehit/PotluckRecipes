import java.util.ArrayList;
import java.util.Scanner;

public class User 
{
	private MemberInfo memberInfo;
	
	public User()
	{
		this.memberInfo = new NormalUser();
	}
	
	public void comment()
	{
		this.memberInfo.comment();
	}
	
	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags)
	{
		
		
		return(this.memberInfo.createRecipe(directions, attribution, ingredients, tags));
	}
	
	public void deleteComment()
	{
		this.memberInfo.deleteComment();
	}
	
	public void deleteRecipe(int index)
	{
		this.memberInfo.deleteRecipe(index);
	}
	
	public void viewComment()
	{
		this.memberInfo.viewComment();
	}
	
	public void viewRecipe()
	{
		this.memberInfo.viewRecipe();
	}
	
	
	public void changeMemberInfoType(MemberInfo memberinfo)
	{
		this.memberInfo = memberinfo;
	}
}
