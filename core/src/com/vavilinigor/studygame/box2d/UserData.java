package com.vavilinigor.studygame.box2d;

import com.badlogic.gdx.math.Vector2;
import com.vavilinigor.studygame.enums.UserDataType;

/**
 * Created by ODSnew on 10.10.2017.
 */

public abstract class UserData {

    protected UserDataType userDataType;

    public UserData(){

    }

    public UserDataType getUserDataType(){
        return userDataType;
    }


}
