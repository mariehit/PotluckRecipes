
public class NormalUser implements MemberInfo
{
	public void comment()
	{
		
	}
	
	public void createRecipe()
	{
		
	}
	
	public void deleteComment()
	{
		System.out.println("You do not have the proper rights to do this");
	}
	
	public void deleteRecipe()
	{
		System.out.println("You do not have the proper rights to do this");
	}
	
	public void viewComment()
	{
		//Comment.toString();
	}
	
	public void viewRecipe()
	{
		//Recipe.toString();
	}
	
	public String accountBehaviour()
	{
		return "NormalUser";
	}
}
