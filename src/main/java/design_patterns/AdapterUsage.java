package design_patterns;

public class AdapterUsage {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Over the horizon");
        audioPlayer.play("vlc", "Rescue me");
        audioPlayer.play("mp4", "Here come the sun");
        audioPlayer.play("avi", "Stand by me");
    }

}

interface MediaPlayer {

    void play(String fileType, String fileName);

}

interface AdvancedMediaPlayer {

    void playVLC(String fileName);

    void playMP4(String fileName);

}

class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC player of file name \"" + fileName + "\".");
    }

    @Override
    public void playMP4(String fileName) {

    }
}

class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 player of file name \"" + fileName + "\".");
    }
}

class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VLCPlayer();
        else
            advancedMediaPlayer = new MP4Player();
    }

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVLC(fileName);
        else
            advancedMediaPlayer.playMP4(fileName);

    }
}

class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3"))
            System.out.println("Playing audio of MP3 file type named + \"" + fileName + "\".");
        else if (fileType.equalsIgnoreCase("vlc") || fileType.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(fileType);
            adapter.play(fileType, fileName);
        } else {
            System.out.println("Invalid media file type.");
        }

    }
}
