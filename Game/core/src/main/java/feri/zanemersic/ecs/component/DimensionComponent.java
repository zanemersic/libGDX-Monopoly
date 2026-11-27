package feri.zanemersic.ecs.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Pool;

public class DimensionComponent implements Component, Pool.Poolable {
    public float width;
    public float height;

    @Override
    public void reset() {
        width = 0f;
        height = 0f;
    }
}
