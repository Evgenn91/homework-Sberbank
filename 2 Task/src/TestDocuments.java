import Documents.Letter;
import Documents.OrderDismiss;
import Documents.OrderRecept;
import Documents.StatusOrder;

public class TestDocuments {
    public static void main(String[] args) {

        Letter letter = new Letter(2,"Коля Пупкин","Иван Иванов");
        letter.setContent("Здесь мы написали основной текст письма");

        OrderRecept orderRecept = new OrderRecept(5,"Иван Иванов");

        OrderDismiss orderDismiss = new OrderDismiss(7, "Семен Сидоров","По собственному желанию");

        letter.printLet(args);
        System.out.println("----------------------" );
        orderRecept.printLet(args);
        System.out.println("----------------------" );
        orderDismiss.printLet(args);
        System.out.println("----------------------" );


        //меняем статус кадровых документов и выводим в консоль
        orderRecept.changeStatOrder(StatusOrder.EXECUTED);
        orderDismiss.changeStatOrder(StatusOrder.EXECUTED);
        System.out.println("================" );
        System.out.println("================" );

        orderRecept.printLet(args);
        System.out.println("----------------------" );
        orderDismiss.printLet(args);
        System.out.println("----------------------" );

        //меняем статус кадровых документов при действующем статусе ИСПОЛНЕН и выводим в консоль, чтобы убедиться что статус не поменялся
        System.out.println("хххххххххххххххх" );
        System.out.println("хххххххххххххххх" );

        orderRecept.changeStatOrder(StatusOrder.CREATURE);
        orderDismiss.changeStatOrder(StatusOrder.CREATURE);

        orderRecept.printLet(args);
        System.out.println("----------------------" );
        orderDismiss.printLet(args);
        System.out.println("----------------------" );

    }
}
