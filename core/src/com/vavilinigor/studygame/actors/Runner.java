package com.vavilinigor.studygame.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.vavilinigor.studygame.box2d.RunnerUserData;
import com.vavilinigor.studygame.box2d.UserData;

/**
 * Created by ODSnew on 10.10.2017.
 */

public class Runner extends GameActor {

    private boolean jumping;
    private boolean dodging;

    public Runner(Body body) {
        super(body);
    }

    @Override
    public RunnerUserData getUserData() {
        return (RunnerUserData) userData;
    }

    public void jump(){
        if (!jumping){
            body.applyLinearImpulse(getUserData().getJumpingLinearImpulse(), body.getWorldCenter(), true);
            jumping = true;
        }
    }

    public void landed(){
        jumping = false;
    }

    public void dodge(){
        if (!jumping){
            body.setTransform(getUserData().getDodgePosition(),getUserData().getDodgeAngle());
            dodging = true;
        }
    }

    public void stopDodge(){
        dodging = false;
        body.setTransform(getUserData().getRunningPosition(), 0f);
    }

    public boolean isDodging(){
        return dodging;
    }
}
