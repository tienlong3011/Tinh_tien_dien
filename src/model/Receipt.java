package model;

public class Receipt {
    private Client client;
    private double oldIndex;
    private double newIndex;

    public Receipt(){
    }

    public Receipt(double oldIndex, double newIndex) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Receipt(Client client, double oldIndex, double newIndex) {
        this.client = client;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public double electricBill(){
        return (newIndex - oldIndex) * 750;
    }

    @Override
    public String toString() {
        return  client +
                "oldIndex= " + oldIndex +
                ", newIndex= " + newIndex ;
    }
}
