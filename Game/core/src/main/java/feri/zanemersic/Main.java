package feri.zanemersic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

import feri.zanemersic.assets.AssetDescriptors;

public class Main extends Game {
    private AssetManager assetManager;

    @Override
    public void create() {
        assetManager = new AssetManager();

        assetManager.load(AssetDescriptors.BACKGROUND_ATLAS);
        assetManager.load(AssetDescriptors.FIGURE_ATLAS);
        assetManager.load(AssetDescriptors.PARTICLE_ATLAS);
        assetManager.load(AssetDescriptors.TILE_ATLAS);

        assetManager.load(AssetDescriptors.FONT);

        assetManager.load(AssetDescriptors.EXPLOSION_EFFECT);
        assetManager.load(AssetDescriptors.MONEY_GAIN_EFFECT);
        assetManager.load(AssetDescriptors.MONEY_LOST_EFFECT);
        assetManager.load(AssetDescriptors.SKIP_EFFECT);

        assetManager.load(AssetDescriptors.SOUND_DICE_HIT);
        assetManager.load(AssetDescriptors.SOUND_FIGURE_MOVE);
        assetManager.load(AssetDescriptors.SOUND_GAME_START);
        assetManager.load(AssetDescriptors.SOUND_LOST);
        assetManager.load(AssetDescriptors.SOUND_MONEY_LOST);
        assetManager.load(AssetDescriptors.SOUND_MONEY_RECEIVED);
        assetManager.load(AssetDescriptors.SOUND_PROPERTY_PURCHASED);
        assetManager.load(AssetDescriptors.SOUND_UPGRADE);

        assetManager.load(AssetDescriptors.SOUND_MUSIC);

        assetManager.load(AssetDescriptors.SOUND_TILE_BLANK);
        assetManager.load(AssetDescriptors.SOUND_TILE_BANK);
        assetManager.load(AssetDescriptors.SOUND_TILE_DESTROY);
        assetManager.load(AssetDescriptors.SOUND_TILE_FEE);
        assetManager.load(AssetDescriptors.SOUND_TILE_JAIL);
        assetManager.load(AssetDescriptors.SOUND_TILE_MONEY);
        assetManager.load(AssetDescriptors.SOUND_TILE_PROPERTY);
        assetManager.load(AssetDescriptors.SOUND_TILE_ROBBERY);
        assetManager.load(AssetDescriptors.SOUND_TILE_SHIELD);
        assetManager.load(AssetDescriptors.SOUND_TILE_SKIP);
        assetManager.load(AssetDescriptors.SOUND_TILE_START);
        assetManager.load(AssetDescriptors.SOUND_TILE_SWITCH);
        assetManager.load(AssetDescriptors.SOUND_TILE_TREASURE);
        assetManager.load(AssetDescriptors.SOUND_TILE_TROPHY);

        assetManager.load(AssetDescriptors.SOUND_UI_BUTTON_CLICK);
        assetManager.load(AssetDescriptors.SOUND_UI_MENU_CLOSE);
        assetManager.load(AssetDescriptors.SOUND_UI_MENU_OPEN);

        assetManager.finishLoading();

        // SET SCREEN;
    }

    @Override
    public void dispose() {
        super.dispose();

        if (assetManager != null) {
            assetManager.dispose();
        }
    }
}
