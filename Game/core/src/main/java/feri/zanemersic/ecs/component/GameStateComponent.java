package feri.zanemersic.ecs.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Pool;

public class GameStateComponent implements Component, Pool.Poolable {
    public int playerTurn;
    public boolean gameOver;

    @Override
    public void reset() {
        playerTurn = 0;
        gameOver = false;
    }
}
