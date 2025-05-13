package Tiktok;

public class CommentService {
	public void addComment(Video video, String comment) {
		video.addComment(comment);
		System.out.println("Comentário mencionado ao video " + video.getTitle() + ": " + comment);
	}
}
