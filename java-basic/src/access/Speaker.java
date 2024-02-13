package access;

public class Speaker {
    private int volume;  //내부 에서만 내가 컨트롤 해버리겠음.
    /*
    private 쓰면 모든 외부 호출을 막음.
    밖에서 내가 직접 호출한 객체에서는 접근이 불가능함.
    */
    Speaker(int volume) {
        this.volume = volume;
    }

     void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume-= 10;
        System.out.println("볼륨 다운 호출");
    }

    void showVolume() {
        System.out.println("현재 음량은 "+ volume);
    }
}
