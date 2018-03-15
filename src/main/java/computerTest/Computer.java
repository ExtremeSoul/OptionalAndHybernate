package computerTest;

public class Computer {

    private GraphicCard graphicCard;

    public Computer(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }
}
