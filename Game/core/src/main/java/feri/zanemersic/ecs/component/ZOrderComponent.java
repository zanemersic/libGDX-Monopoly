package feri.zanemersic.ecs.component;

import com.badlogic.gdx.utils.Pool;
import com.badlogic.ashley.core.Component;

public class ZOrderComponent implements Component, Pool.Poolable {
    public int z;

    @Override
    public void reset() {
        z = 0;
    }
}
