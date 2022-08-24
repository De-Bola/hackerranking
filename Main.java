package com.andela.challenge;

public class Main {
// do they belong?
    public static void main(String[] args) {
	// write your code here

        System.out.println(solution(3, 1, 7, 1, 5, 5, 1, 1, 4, 3));
        System.out.println(solution(3, 1, 7, 1, 5, 5, 3, 1, 0, 0));
        System.out.println(solution(0, 0, 2, 0, 4, 0, 2, 0, 4, 0));
        System.out.println(solution(2, 2, 7, 2, 5, 4, 4, 3, 7, 4));
    }
    public static int solution(double ax, double ay, double bx, double by, double cx, double cy, double px, double py, double qx, double qy){
        double L = 2000;
        double ab = getDistance(ax, bx, ay, by);
        double bc = getDistance(cx, bx, cy, by);
        double ac = getDistance(ax, cx, ay, cy);
        int pInside = 0;
        int qInside = 0;

//        if (ax > L || ay > L || bx > L || by > L)

        if(isValidNonDegenerate(ab, bc, ac) > 0) return 0;

        if (isInside(ax, ay, bx, by, cx, cy, px, py)) {pInside = 1;}

        if (isInside(ax, ay, bx, by, cx, cy, qx, qy)) {qInside = 1;}

        if(pInside == 1 && qInside == 0) return 1;
        if(pInside == 0 && qInside == 1) return 2;
        if(pInside == 1 && qInside == 1) return 3;

        return 4;
    }

    public static double getDistance(double x1, double x2, double y1, double y2){
        double interimDiffX = Math.abs(x2 - x1);
        double interimDiffY = Math.abs(y2 - y1);
        interimDiffX = interimDiffX * interimDiffX;
        interimDiffY = interimDiffY * interimDiffY;
        double sumOfSquares = interimDiffX + interimDiffY;
        return Math.sqrt(sumOfSquares);

    }

    public static double semiperimeter(double a, double b, double c){
        return ((a + b + c ) / 2.0);
    }

    public static int isValidNonDegenerate(double ab, double bc, double ac){
        if (ab + bc <= ac){return 1;}
        if (ac + bc <= ab){return 1;}
        if (ab + ac <= bc){return 1;}
        return 0;
    }

    public static boolean isInside(double ax, double ay, double bx, double by, double cx, double cy, double Px, double Py){
        double A = area(ax, ay, bx, by, cx, cy);
        double A1 = area(Px, Py, bx, by, cx, cy);
        double A2 = area(ax, ay, Px, Py, cx, cy);
        double A3 = area(ax, ay, bx, by, Px, Py);
        double sumOfOtherAreas = A1 + A2 + A3;
        if(sumOfOtherAreas - A < 0.0001) sumOfOtherAreas = A;
        return (A == sumOfOtherAreas);
    }

    public static double area(double ax, double ay, double bx, double by, double cx, double cy)
    {
        double a = getDistance(ax, bx, ay, by);
        double b = getDistance(cx, bx, cy, by);
        double c = getDistance(ax, cx, ay, cy);

        double s = semiperimeter(a, b, c);
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }
}
