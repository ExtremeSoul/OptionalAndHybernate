package computerTest;

import computerTest.Chipset;
import computerTest.Computer;
import computerTest.GraphicCard;

import java.util.Optional;

public class ComputerTester {

    public static void main(String[] args) {
        Chipset nVidia = new Chipset();
        GraphicCard gForce = new GraphicCard(nVidia);
        Computer vEnom = new Computer(gForce);

        GraphicCard amd = new GraphicCard(null);
        Computer vAmd = new Computer(amd);

        Computer withoutGraphicCard = new Computer(null);

        printCompNameLegacy(vEnom);
        printCompNameLegacy(vAmd);
        printCompNameLegacy(withoutGraphicCard);
        printCompNameLegacy(null);

        printCompNameNewSchine(vEnom);
        printCompNameNewSchine(vAmd);
        printCompNameNewSchine(withoutGraphicCard);
        printCompNameNewSchine(null);
    }

    static private void printCompNameLegacy(Computer comp) {
        if (null != comp) {
            if (null != comp.getGraphicCard()) {
                if (null != comp.getGraphicCard().getChipset()) {
                    System.out.println(comp.getGraphicCard().getChipset().getVendorName());
                }
            }
        }
    }

    static private void printCompNameNewSchine(Computer comp) {
        Optional.ofNullable(comp)
                .map(comp1 -> comp1.getGraphicCard())
                .map(graphicCard -> graphicCard.getChipset())
                .map(chipset -> chipset.getVendorName())
                .ifPresent(vendor -> System.out.println(vendor));
    }

    static private void printCompNameNewSchineWithFlatMap(ComputerWithOptional comp) {
        Optional.ofNullable(comp)
                .flatMap(comp1 -> comp1.getCard())
                .map(graphicCard -> graphicCard.getChipset())
                .map(chipset -> chipset.getVendorName())
                .ifPresent(vendor -> System.out.println(vendor));
    }


}
