package com.vavilinigor.studygame.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.vavilinigor.studygame.box2d.EnemyUserData;
import com.vavilinigor.studygame.box2d.UserData;

/**
 * Created by ODSnew on 17.10.2017.
 */

public class Enemy extends GameActor {

    public Enemy(Body body) {
        super(body);
    }

    @Override
    public EnemyUserData getUserData() {
        return (EnemyUserData) userData;
    }

    @Override
    public void act(float delta){
        super.act(delta);
        body.setLinearVelocity(getUserData().getLinearVelocity());
    }
}
