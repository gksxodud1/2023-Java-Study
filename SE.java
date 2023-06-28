package WkdHw6;


        public class SE {
            public static void main(String[] args){
                AB ab = new SI();                  //dm1 2 호출 해주고  sm1sm2 호출해주고

                ab.dM1();
                System.out.println();
                ab.dM2();
                System.out.println();

                AB.sM1();
                System.out.println();
                AB.sM2();
/*
dM1 종속코드
dM 중복코드A
dM 중복코드B

dm2 종속코드
dM 중복코드A
dM 중복코드B

sM1 종속코드
sM 중복코드C
sM 중복코드D

sM2 종속코드
sM 중복코드C
sM 중복코드D
위 와 같이결과값이 나오도록 코딩해주세용
*/
    }
}