import java.util.ArrayList;
import java.util.Scanner;

public class User 
{
	private MemberInfo memberInfo;
	
	public User()
	{
		this.memberInfo = new NormalUser();
	}
	
	public void comment(int index, String comment)
	{
		this.memberInfo.comment(index, comment);
	}
	
	public Recipe createRecipe(String directions, String attribution, ArrayList<Ingredient> ingredients, ArrayList<Tag> tags)
	{
		
		
		return(this.memberInfo.createRecipe(directions, attribution, ingredients, tags));
	}
	
	public void deleteComment(int index, int commentIndex)
	{
		this.memberInfo.deleteComment(index, commentIndex);
	}
	
	public void deleteRecipe(int index)
	{
		this.memberInfo.deleteRecipe(index);
	}
	
	public void viewComment(int index, int commentIndex)
	{
		this.memberInfo.viewComment(index, commentIndex);
	}
	
	public void viewRecipe(int index)
	{
		this.memberInfo.viewRecipe(index);
	}
	
	
	public void changeMemberInfoType(MemberInfo memberinfo)
	{
		this.memberInfo = memberinfo;
	}
}
