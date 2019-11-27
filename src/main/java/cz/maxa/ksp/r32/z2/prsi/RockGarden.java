package cz.maxa.ksp.r32.z2.prsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RockGarden {
    private int width;
    private int height;
    private List<Stage> stages;
    private int watered = 0;

    RockGarden(int width, List<Integer> heights) {
        this.width = width;
        height = Collections.max(heights);
        initStages(heights);
    }

    private void initStages(List<Integer> heights) {
        stages = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            Stage stage = new Stage(width);
            int finalI = i;
            heights.forEach(height -> stage.addBlock(Block.getBlock(finalI < height)));
            stages.add(stage);
        }
    }

    int water() {
        stages.forEach(stage ->   watered += stage.water());
        return watered;
    }
}
