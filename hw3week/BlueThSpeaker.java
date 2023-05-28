package hw3week;

public class BlueThSpeaker extends Speaker{
    public BlueThSpeaker(String model, String color) {
        //컴파일 시 자동 추가 되긴 하지만 이 줄에 들어가야할 부모 생성자를 호출해주는 것을 작성해주세용
        this.model = model;
        this.color = color;
        System.out.println("BlueThspeaker 모델 컬러 생성자 실행 ");
    }
}
