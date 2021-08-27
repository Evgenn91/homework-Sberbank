package Documents;


//Приказ о приеме на работу
public class OrderRecept extends ChangStatOrd {
    private final int numberId;  //номер приказа
    private final String name = "Приказ о приеме на работу";         //имя приказа

    private final String nameEmpl;      //имя сотрудника
    private String content;      //текст приказа


    public OrderRecept(int numberId,String nameEmpl) {
        this.numberId = numberId;
        this.nameEmpl=nameEmpl;
        this.content= createContent();
    }

    public void printLet(String[] args){
        if(args.length!=0 && args[0].equals("-simple")){System.out.println(this.name+ " №" + numberId);}
        else {
            System.out.println(this.name+ " №" + numberId);
            System.out.println(content);
            System.out.println("Статус приказа: "+getStatPrint());
        }

    }


    @Override
    public String toString() {
        return "OrderRecept{" +
                "numberId=" + numberId +
                ", name='" + name + '\'' +
                ", nameEmpl='" + nameEmpl + '\'' +
                ", content='" + content + '\'' +
                ", status=" + getStatPrint() +
                '}';
    }

    private String createContent(){
        String result = nameEmpl +" принят на работу согласно приказу №11111";
        return result;
    }

}
