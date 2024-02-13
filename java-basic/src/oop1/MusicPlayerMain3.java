/*
메소드로 만들어서 기능이 모듈화 됨에따른 장점
1. 중복 제거 : 로직 중복이 제거됨
2. 변경 영향 범위 : 기능 수정시 메서드 내부만 변경하면 됨
3. 메서드 이름 추가 : 메서드 이름을 통해 코드 이해 빠름
 */
package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumnUp(data);
        // 볼륨 증가
        volumnUp(data);
        // 볼륨 감소
        volumnDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumnUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }

    static void volumnDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악플레이어 OFF");
        }
    }
}
