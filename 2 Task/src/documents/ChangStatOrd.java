package documents;

public abstract class ChangStatOrd {
    private Enum status;            //статус приказа

    public ChangStatOrd() {
        this.status = StatusOrder.CREATURE;
    }

    public void changeStatOrder(StatusOrder status){
        chanStatPriv(status);
    }

    protected String getStatPrint(){
        if(status==StatusOrder.EXECUTED) return "Исполнен";
        else if(status==StatusOrder.CREATURE) return "Создан";
        else return "Статус не известен";

    }

    //метот для контроля за статусом(следит чтобы не изменялся больше статус если он "ИСПОЛНЕН" )
    private void chanStatPriv(StatusOrder status){
        if(!this.status.equals(StatusOrder.EXECUTED)) this.status = status;
    }
}
