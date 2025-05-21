package Tiktok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user = new User("Eu", 2556473);
		User user1 = new User("Corithiano", 1);
		User user2 = new User("Flameguista", 2);
		Video video = new Video(4578432, "Gta VI", user);

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma reação: 1-Odiei, 2-Mt Bom");
		int opt = sc.nextInt();

		Reaction reaction = switch (opt) {
			case 1 -> new OdieiReaction();
			case 2 -> new AmeiReaction();
			default -> null;
		};

		if (reaction != null) {
			ReactionService.addReaction(video, reaction);
		} else {
			System.out.println("Reação inválida.");
		}

		System.out.println("Resumo de reações: " + video.getReactionSummary());
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
