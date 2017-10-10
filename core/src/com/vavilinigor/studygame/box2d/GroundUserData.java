package com.vavilinigor.studygame.box2d;

import com.vavilinigor.studygame.enums.UserDataType;

/**
 * Created by ODSnew on 10.10.2017.
 */

public class GroundUserData extends UserData {

    public GroundUserData(){
        super();
        userDataType = UserDataType.GROUND;
    }
}
