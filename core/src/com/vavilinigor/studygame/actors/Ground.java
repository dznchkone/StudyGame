package com.vavilinigor.studygame.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.vavilinigor.studygame.box2d.GroundUserData;
import com.vavilinigor.studygame.box2d.UserData;

/**
 * Created by ODSnew on 10.10.2017.
 */

public class Ground extends GameActor {

    public Ground(Body body) {
        super(body);
    }

    @Override
    public UserData getUserData() {
        return (GroundUserData) userData;
    }
}
