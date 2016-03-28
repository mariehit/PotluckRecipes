package potluck.domain;

import java.util.ArrayList;

public class LoginUser {
	private int member_id;
	private boolean is_admin;
	private String alias;
	private String first_name;
	private String last_name;
	private String email;
	private String username;
	private String password;
	private UserBehaviour behaviour;
	private RecipeBuilder builder = RecipeBuilder.create();

	public LoginUser(String username, String password, boolean is_admin) {
		this.username = username;
		this.password = password;
		this.is_admin = is_admin;
		behaviour = new NormalUserBehaviour();	
	}

	public void changeBehaviour(UserBehaviour userBehaviour) {
		behaviour = userBehaviour;
	}

	public void createRecipePrepare() {
		this.behaviour.createRecipePrepare(builder);
	}
	public void addDirections(String directions) {
		this.behaviour.addDirections(builder, directions);
	}
	public void addAttribution(String attribution) {
		this.behaviour.addAttribution(builder, attribution);
	}
	public void addCategory(Category category) {
		this.behaviour.addCategory(builder, category);
	}
	public void addIngredients(ArrayList<Ingredient> ingredients) {
		this.behaviour.addIngredients(builder, ingredients);
	}
	public void addTags(ArrayList<Tag> tags) {
		this.behaviour.addTags(builder, tags);
	}

	public void createRecipe() {
		this.behaviour.createRecipe(builder);

	}

	public void viewRecipe(int index) {
		this.behaviour.viewRecipe(index);
	}
	
	public void comment(Comment comment, int index) {
		this.behaviour.comment(comment, index);
	}
	
	public void deleteRecipe(int index) {
		this.behaviour.deleteRecipe(index);
	}

	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public boolean getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public RecipeBuilder getRecipeBuilder() {
		return builder;
	}


}
