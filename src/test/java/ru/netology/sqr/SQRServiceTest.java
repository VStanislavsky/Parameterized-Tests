package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void counterClean() {
      SQRService service = new SQRService();

      int counter1 = service.clean(200, 300);
        System.out.println(counter1);

        int counter2 = service.clean(150, 350);
        System.out.println(counter2);

        int counter3 = service.clean(225, 289);
        System.out.println(counter3);

        int counter4 = service.clean(300, 200);
        System.out.println(counter4);

    }
}
