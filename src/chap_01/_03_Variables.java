package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "minhyeong";
        int year = 2023;

        System.out.println("Hi, " + name);
        System.out.println("Welcome " + year);

        double score = 90.5;
        char grade = 'A';
        name = "미녕";
        System.out.println(name + "님의 평균점수는 " + score + " 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(pass);
        System.out.println(!pass);

        double d = 3.141592653589793238;
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);

        long i = 1000000000000L;
        i = 1_000_000_000_000L;
        System.out.println(i);
    }
}
