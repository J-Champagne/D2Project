package util;

/**
 * Created by jackchampagne on 9/14/17.
 * This describes the different collision meshes for certain opjects.
 */
public class D2Collide {

    enum COLLIDE_TYPE {Rectangle, Circle, None}

    static boolean checkCircleCollision(D2Point center1, D2Point center2) {
        return Math.sqrt(Math.pow(center1.getX() - center2.getX(), 2) + Math.pow(center1.getY() - center2.getY(), 2)) <= 10;
    }

}
