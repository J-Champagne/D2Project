package util;

import java.awt.*;

/**
 * Created by jackchampagne on 9/14/17.
 * Represents position, texture, and hitbox type of D2Objects
 */
public class D2Object {

    private Image texture;
    private D2Point pos;
    private D2Collide.COLLIDE_TYPE hitbox;

    public D2Object(double initX, double initY) {
        pos = new D2Point(initX, initY);
        texture = null;
        hitbox = D2Collide.COLLIDE_TYPE.None;
    }

    public D2Object(double initX, double initY, Image texture) {
        pos = new D2Point(initX, initY);
        texture = texture;
        hitbox = D2Collide.COLLIDE_TYPE.None;
    }

    public D2Object(double initX, double initY, Image texture, D2Collide.COLLIDE_TYPE hitbox) {
        pos = new D2Point(initX, initY);
        texture = texture;
        hitbox = hitbox;
    }

    public boolean collidedWith(D2Object object2) {
        //TODO Add different collision handlers based on collision mesh type
        return D2Collide.checkCircleCollision(this.getD2Point(), object2.getD2Point());
    }

    public D2Point getD2Point() {
        return pos;
    }


}
