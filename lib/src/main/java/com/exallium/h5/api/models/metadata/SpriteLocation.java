package com.exallium.h5.api.models.metadata;

public class SpriteLocation {
    /**
     * A reference to an image that contains all the sprites.
     */
    private String spriteSheetUrl;

    /**
     * The X coordinate where the top-left corner of the sprite is located.
     */
    private int left;

    /**
     * The Y coordinate where the top-left corner of the sprite is located.
     */
    private int top;

    /**
     * The width of the full sprite sheet (in pixels). The dimensions of the full sheet
     * are included so that the sheet can be resized.
     */
    private int width;

    /**
     * The height of the full sprite sheet (in pixels). The dimensions of the full
     * sheet are included so that the sheet can be resized.
     */
    private int height;

    /**
     * The width of this sprite (in pixels)
     */
    private int spriteWidth;

    /**
     * The height of this sprite (in pixels).
     */
    private int spriteHeight;
}
