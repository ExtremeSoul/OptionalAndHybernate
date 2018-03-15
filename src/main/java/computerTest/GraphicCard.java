package computerTest;

import computerTest.Chipset;

public class GraphicCard {

    private Chipset chipset;

    public GraphicCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }
}
