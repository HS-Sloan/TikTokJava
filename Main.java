package Tiktok;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("Corithiano", 1);
		User user2 = new User("Flameguista", 2);
		
		Video video1 = new Video(111, "GTA VI: Trailer", user1);
		Video video2 = new Video(123,"Alien x videos ben 10", user2);
		LikeService likeService = new LikeService();
		CommentService commentService = new CommentService();
		FeedService feedService = new FeedService();
		
		LikeService.addLike(video1, user2);
		commentService.addComment(video1, "Ótimo Trailer");
				
		List<Video> videos = new ArrayList<>();
		videos.add(video1);
		
		LikeService.addLike(video1, user1);
		commentService.addComment(video2, "Não tinha alien X");
		videos.add(video2);
		
		feedService.listVideos(videos);
	}
}
