package we3;

public class TurboModeCar extends Car {
    public static final int NORMAl = 1;
    public static final int TURBO = 2;

    public int driveMode = NORMAl;
    @Override
    public void  drive() {                  /*오버라이딩을 위한 메소드 재정의 코드 입력*/
        if (driveMode == TURBO) {
            System.out.println("터보모드로 주행합니다.");
        } else {
            super.drive();
        }
    }

}

