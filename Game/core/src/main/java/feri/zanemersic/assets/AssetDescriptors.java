package feri.zanemersic.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter;

public final class AssetDescriptors {

    // ATLASES
    public static final AssetDescriptor<TextureAtlas> BACKGROUND_ATLAS = new AssetDescriptor<>(AssetPaths.BACKGROUND_ATLAS, TextureAtlas.class);
    public static final AssetDescriptor<TextureAtlas> FIGURE_ATLAS = new AssetDescriptor<>(AssetPaths.FIGURE_ATLAS, TextureAtlas.class);
    public static final AssetDescriptor<TextureAtlas> PARTICLE_ATLAS = new AssetDescriptor<>(AssetPaths.EFFECT_ATLAS, TextureAtlas.class);
    public static final AssetDescriptor<TextureAtlas> TILE_ATLAS = new AssetDescriptor<>(AssetPaths.TILES_ATLAS, TextureAtlas.class);

    // FONT
    public static final AssetDescriptor<BitmapFont> FONT = new AssetDescriptor<>(AssetPaths.FONT, BitmapFont.class);

    // EFFECTS
    public static final AssetDescriptor<ParticleEffect> EXPLOSION_EFFECT = particleEffect(AssetPaths.EXPLOSION_EFFECT);
    public static final AssetDescriptor<ParticleEffect> MONEY_GAIN_EFFECT = particleEffect(AssetPaths.MONEY_GAIN_EFFECT);
    public static final AssetDescriptor<ParticleEffect> MONEY_LOST_EFFECT = particleEffect(AssetPaths.MONEY_LOST_EFFECT);
    public static final AssetDescriptor<ParticleEffect> SKIP_EFFECT = particleEffect(AssetPaths.SKIP_EFFECT);

    // SOUNDS

    // GAMEPLAY
    public static final AssetDescriptor<Sound> SOUND_DICE_HIT = new AssetDescriptor<>(AssetPaths.GAMEPLAY_DICE_HIT_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_FIGURE_MOVE = new AssetDescriptor<>(AssetPaths.GAMEPLAY_FIGURE_MOVE_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_GAME_START = new AssetDescriptor<>(AssetPaths.GAMEPLAY_GAME_START_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_LOST = new AssetDescriptor<>(AssetPaths.GAMEPLAY_LOST_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_MONEY_LOST = new AssetDescriptor<>(AssetPaths.GAMEPLAY_MONEY_LOST_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_MONEY_RECEIVED = new AssetDescriptor<>(AssetPaths.GAMEPLAY_MONEY_RECEIVED_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_PROPERTY_PURCHASED = new AssetDescriptor<>(AssetPaths.GAMEPLAY_PROPERTY_PURCHASED_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_UPGRADE = new AssetDescriptor<>(AssetPaths.GAMEPLAY_UPGRADE_SOUND, Sound.class);

    // MUSIC
    public static final AssetDescriptor<Sound> SOUND_MUSIC = new AssetDescriptor<>(AssetPaths.MUSIC_SOUND, Sound.class);

    // TILES
    public static final AssetDescriptor<Sound> SOUND_TILE_BLANK = new AssetDescriptor<>(AssetPaths.TILE_BLANK_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_BANK = new AssetDescriptor<>(AssetPaths.TILE_BANK_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_DESTROY = new AssetDescriptor<>(AssetPaths.TILE_DESTROY_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_FEE = new AssetDescriptor<>(AssetPaths.TILE_FEE_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_JAIL = new AssetDescriptor<>(AssetPaths.TILE_JAIL_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_MONEY = new AssetDescriptor<>(AssetPaths.TILE_MONEY_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_PROPERTY = new AssetDescriptor<>(AssetPaths.TILE_PROPERTY_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_ROBBERY = new AssetDescriptor<>(AssetPaths.TILE_ROBBERY_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_SHIELD = new AssetDescriptor<>(AssetPaths.TILE_SHIELD_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_SKIP = new AssetDescriptor<>(AssetPaths.TILE_SKIP_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_START = new AssetDescriptor<>(AssetPaths.TILE_START_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_SWITCH = new AssetDescriptor<>(AssetPaths.TILE_SWITCH_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_TREASURE = new AssetDescriptor<>(AssetPaths.TILE_TREASURE_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_TILE_TROPHY = new AssetDescriptor<>(AssetPaths.TILE_TROPHY_SOUND, Sound.class);

    // UI
    public static final AssetDescriptor<Sound> SOUND_UI_BUTTON_CLICK = new AssetDescriptor<>(AssetPaths.UI_BUTTON_CLICK_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_UI_MENU_OPEN = new AssetDescriptor<>(AssetPaths.UI_MENU_OPEN_SOUND, Sound.class);
    public static final AssetDescriptor<Sound> SOUND_UI_MENU_CLOSE = new AssetDescriptor<>(AssetPaths.UI_MENU_CLOSE_SOUND, Sound.class);


    private static AssetDescriptor<ParticleEffect> particleEffect(String path) {
        ParticleEffectParameter parameters = new ParticleEffectParameter();
        parameters.atlasFile = AssetPaths.EFFECT_ATLAS;

        return new AssetDescriptor<>(path, ParticleEffect.class, parameters);
    }



    private AssetDescriptors() {
    }
}
