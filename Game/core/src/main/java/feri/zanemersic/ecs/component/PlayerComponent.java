package feri.zanemersic.ecs.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Pool;

public class PlayerComponent implements Component, Pool.Poolable {
    public int health;
    public int money;
    public int trophies;
    public int propertiesOwned;

    @Override
    public void reset() {
        health = 0;
        money = 0;
        trophies = 0;
        propertiesOwned = 0;
    }
}
