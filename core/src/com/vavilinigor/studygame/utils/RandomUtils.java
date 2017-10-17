package com.vavilinigor.studygame.utils;

import com.vavilinigor.studygame.enums.EnemyType;
import java.util.Random;
/**
 * Created by ODSnew on 17.10.2017.
 */

public class RandomUtils {

    public static EnemyType getRandomEnemyType(){
        RandomEnum <EnemyType> randomEnum = new RandomEnum<EnemyType>(EnemyType.class);
        return randomEnum.random();
    }

    public static class RandomEnum<E extends Enum> {

        public static final Random RND = new Random();
        private final E[] values;

        public RandomEnum(Class<E> token){
            values = token.getEnumConstants();
        }

        public E random(){
            return values[RND.nextInt(values.length)];
        }

    }

}
