package documents;


//Приказ об увольнении
public class OrderDismiss extends ChangStatOrd {
    private final int numberId;    //номер приказа
    private final String name = "Приказ об увольнении";       //имя приказа

    private final String nameEmpl;      //имя сотрудника
    private String content;        //текст приказа
    private String reasonDism;      //причина увольнения

    public OrderDismiss(int numberId,String nameEmpl,String reasonDism) {
        this.numberId = numberId;
        this.nameEmpl=nameEmpl;
        this.reasonDism = reasonDism;
        this.content = createContent();

    }

    public void printLet(String[] args){
        if(args.length!=0 && args[0].equals("-simple")){System.out.println(this.name+ " №" + numberId);}
        else {System.out.println(this.name+ " №" + numberId);
            System.out.println(content);
            System.out.println("Причина увольнения "+reasonDism);
            System.out.println("Статус приказа: "+getStatPrint());
        }

    }

    @Override
    public String toString() {
        return "OrderDismiss{" +
                "numberId=" + numberId +
                ", name='" + name + '\'' +
                ", nameEmpl='" + nameEmpl + '\'' +
                ", content='" + content + '\'' +
                ", status=" + getStatPrint() +
                ", reasonDism='" + reasonDism + '\'' +
                '}';
    }

    private String createContent(){
        String result = nameEmpl +" уволен с работы согласно приказу №222222";
        return result;
    }


}
