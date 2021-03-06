package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLTopPeerCategoryBotsInline extends TLAbsTopPeerCategory {

    public static final int CONSTRUCTOR_ID = 0x148677e2;

    private final String _constructor = "topPeerCategoryBotsInline#148677e2";

    public TLTopPeerCategoryBotsInline() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
