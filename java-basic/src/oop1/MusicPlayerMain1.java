// 절차 지향 (순서가 중요한) 프로그래밍 예시
package oop1;

import java.util.Scanner;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volumn = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        // 볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        // 볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악플레이어 ON, 볼륨:" + volumn);
        } else {
            System.out.println("음악플레이어 OFF");
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종류합니다.");
    }
}
