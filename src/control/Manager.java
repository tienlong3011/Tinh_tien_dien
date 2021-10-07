package control;

import model.Client;
import model.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Client> clientArrayList = new ArrayList<>();
    ArrayList<Receipt> receiptArrayList = new ArrayList<>();

    public Manager() {
    }

    public Manager(ArrayList<Client> clientArrayList, ArrayList<Receipt> receiptArrayList) {
        this.clientArrayList = clientArrayList;
        this.receiptArrayList = receiptArrayList;
    }

    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }

    public void setClientArrayList(ArrayList<Client> clientArrayList) {
        this.clientArrayList = clientArrayList;
    }

    public ArrayList<Receipt> getReceiptArrayList() {
        return receiptArrayList;
    }

    public void setReceiptArrayList(ArrayList<Receipt> receiptArrayList) {
        this.receiptArrayList = receiptArrayList;
    }

    public void addClient(Client newClient){
        clientArrayList.add(newClient);
    }

    public void removeClient(int index){
        clientArrayList.remove(index);
    }

    public void editClient(int index, Client newClient){
        clientArrayList.set(index,newClient);
    }

    public void addReceipt(Receipt newReceipt){
        receiptArrayList.add(newReceipt);
    }

    public void removeReceipt(int index){
        receiptArrayList.remove(index);
    }

    public void editReceipt(int index, Receipt newReceipt){
        receiptArrayList.set(index,newReceipt);
    }

    public void showAllListClient(){
        for (Client client: clientArrayList) {
            System.out.println(client);
        }
    }

    public void showAllListReceipt(){
        for (Receipt receipt: receiptArrayList) {
            System.out.println(receipt);
        }
    }

    public Client searchClientById(String id) {
        Client client = null;
        for (int i = 0; i < clientArrayList.size(); i++) {
            if(clientArrayList.get(i).getId().equalsIgnoreCase(id)){
               client = clientArrayList.get(i);
               break;
            }
        }
        return client;
    }

    public Receipt searchReceipt(String id){
        Receipt receipt = null;
        for (int i = 0; i < receiptArrayList.size(); i++) {
            if(receiptArrayList.get(i).getClient().getId().equalsIgnoreCase(id)){
                receipt = receiptArrayList.get(i);
                break;
            }
        }
        return receipt;
    }


}
