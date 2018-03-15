package computerTest;

import java.util.Optional;

public class ComputerWithOptional {
    private GraphicCard card;

    public ComputerWithOptional(GraphicCard card) {
        this.card = card;
    }

    public Optional<GraphicCard> getCard() {
        return Optional.ofNullable(card);
    }

    public void setCard(GraphicCard card) {
        this.card = card;
    }
}
