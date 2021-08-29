package documents;


//письмо
public class Letter {
    private final int numberId;   //номер приказа
    private final String name ="Письмо";          //имя приказа

    private String nameFrom;    //от кого письмо
    private String nameTo;      //кому письмо
    private String content;        //текст письма

    public Letter(int numberId, String nameFrom, String nameTo) {
        this.numberId = numberId;
        this.nameFrom = nameFrom;
        this.nameTo = nameTo;
    }

    //метод для записи содержимого письма
    public void setContent(String content) {
        this.content = content;
    }

    public void printLet(String[] args){
        if(args.length!=0 && args[0].equals("-simple")){System.out.println(this.name+ " №" + numberId);}
        else {
            System.out.println(this.name+ " №" + numberId);
            System.out.println("От: "+nameFrom+" Кому: "+nameTo);
            System.out.println(content);
        }

    }

    @Override
    public String toString() {
        return "Letter{" +
                "numberId=" + numberId +
                ", name='" + name + '\'' +
                ", nameFrom='" + nameFrom + '\'' +
                ", nameTo='" + nameTo + '\'' +
                ", content='" + content + '\'' +
                '}';

    }

}
