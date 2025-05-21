package Tiktok;

public class ReactionService {
    public static void addReaction(Video video, Reaction reaction) {
        video.addReaction(reaction);
        System.out.println("Reação \"" + reaction.getType() + "\" adicionada ao vídeo \"" + video.getTitle() + "\"");
    }
}
