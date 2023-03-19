public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(new RockMusic());
        musicPlayer.playMusic();
    }
}

class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing :" + music.genre() + " music");
    }
}

class ClassicalMusic implements Music{
    @Override
    public String genre() {
        return "classical";
    }
}

class RockMusic implements Music{
    @Override
    public String genre() {
        return "rock";
    }
}
