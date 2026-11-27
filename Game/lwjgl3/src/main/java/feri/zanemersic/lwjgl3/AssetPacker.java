package feri.zanemersic.lwjgl3;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class AssetPacker {
    public static void main(String[] args) {
        TexturePacker.Settings settings = new TexturePacker.Settings();
        settings.maxWidth = 4096;
        settings.maxHeight = 4096;

        TexturePacker.process(settings, "lwjgl3/assets-raw/backgrounds", "assets/backgrounds", "backgrounds");
        TexturePacker.process(settings, "lwjgl3/assets-raw/figures", "assets/figures", "figures");
        TexturePacker.process(settings, "lwjgl3/assets-raw/tiles", "assets/tiles", "tiles");
    }
}
