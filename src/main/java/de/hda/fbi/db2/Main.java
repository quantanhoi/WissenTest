package de.hda.fbi.db2;

import de.hda.fbi.db2.controller.Controller;

/**
 * Main Class.
 *
 * @author L. Koehler
 */
public class Main {

  /**
   * Main Method and Entry-Point.
   *
   * @param args Command-Line Arguments.
   */
  public static void main(String[] args) {
    Controller controller = Controller.getInstance();

    controller.readCsv();
    controller.getLab01Data().printData();
    controller.getLab02EntityManager().setLab01Data(controller.getLab01Data());

    controller.persistData();

    controller.startMenu();
  }
}
