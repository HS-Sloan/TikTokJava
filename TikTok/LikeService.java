package Tiktok;

public class LikeService {
	public static void addLike(Video video, User user) {
		video.addLike(user);
		System.out.println(user.getName() + " achou massa esse video de " + video.getTitle());
	}
}
