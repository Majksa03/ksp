package cz.maxa.ksp.r32.z2.prsi;

public enum Block {
    SOIL(true), AIR(false);

    private boolean filled;

    Block(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public static Block getBlock(boolean filled) {
        if (filled) {
            return SOIL;
        } else {
            return AIR;
        }
    }
}
