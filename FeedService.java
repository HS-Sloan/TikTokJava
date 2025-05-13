package Tiktok;

import java.util.List;

public class FeedService {
	public void listVideos(List<Video> videos) {
		for (Video video : videos ) {
			System.out.println("Video: " + video.getTitle());
			System.out.println("Curtidas: "+ video.getLikes().size());
			System.out.println("Comentarios: " + video.getComments());
			System.out.println("___________________________________" );
		}
	}
}
