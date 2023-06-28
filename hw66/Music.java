package hw66;

public class Music implements VoiceInterface {

    @Override
    public void off() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume == 0) {
            Music ms = new Music();
            ms.off();
        } else {
            System.out.println("볼륨을 " + volume + "으로 설정합니다.");
        }
    }
}