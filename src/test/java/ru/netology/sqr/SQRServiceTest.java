package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void counterClean() {
      SQRService service = new SQRService();

      int x = service.clean(200, 300);
        System.out.println(x);

    }
}
