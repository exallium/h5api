/*
 * Copyright (c) 2015 Alex Hart
 *
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.exallium.h5.api.models.metadata;

public class SpriteLocation {
    /**
     * A reference to an image that contains all the sprites.
     */
    private String spriteSheetUri;

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

    public String getSpriteSheetUri() {
        return spriteSheetUri;
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpriteWidth() {
        return spriteWidth;
    }

    public int getSpriteHeight() {
        return spriteHeight;
    }
}
