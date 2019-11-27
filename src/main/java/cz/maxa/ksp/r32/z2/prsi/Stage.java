package cz.maxa.ksp.r32.z2.prsi;

import java.util.ArrayList;
import java.util.List;

class Stage {
    private int width;
    private List<Block> blocks;
    private int watered = 0;
    private int tmpWatered = 0;
    private boolean tmpBlocked = false;

    Stage(int width) {
        this.width = width;
        blocks = new ArrayList<>(width);
    }

    void addBlock(Block block) {
        blocks.add(block);
    }

    int water() {
        blocks.forEach(block -> {
            if(block.isFilled()) {
                if(tmpBlocked) {
                    watered += tmpWatered;
                    tmpWatered = 0;
                } else {
                    tmpBlocked = true;
                }
            } else {
                tmpWatered++;
            }
        });
        return watered;
    }
}
