package Week9;

public class selectAl {
    public static void main(String[] args) {
        int[] A = {13,99,50,71,2,7,41,62,77,85};

     for(int i=0; i<A.length; i++) {
         if (i>A.length) break;//i가 배열의 길이만큼 커질때까지 반복
            for(int j=i+1; j<A.length; j++) {
                if(A[i] > A[j]) { // i를 i 다음 인덱스번호의 J와 비교
                    int tmp = A[i];
                    //임시저장 변수 선언
                    A[i] = A[j];
                    A[j] = tmp;

                }
            }
        }
     //이중 for문을 사용하여 i 의 위치에 따라 j의 값을 지속적으로 증가시키며 비교해준다
        System.out.println();
        for (int i = 0; i < A.length; i++) {  //순서대로 가져와서
            System.out.print(A[i]);//출력
        }
    }
}

