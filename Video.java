package Tiktok;
import java.util.ArrayList;
import java.util.List;

public class Video {
	private int id;
	private String title;
	private User owner;
	private List<User> likes;
	private List<String> comments;
	public Video(int id, String title, User owner) {
		this.id = id;
		this.title = title;
		this.owner = owner;
		this.likes =  new ArrayList<>();
		this.comments = new ArrayList<>();
	}
	public void addLike(User user) {
		likes.add(user);
	}
	public void addComment(String comment) {
		comments.add(comment);
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public User getOwner() {
		return owner;
	}
	public List<User> getLikes() {
		return likes;
	}
	public List<String> getComments() {
		return comments;
	}
}
