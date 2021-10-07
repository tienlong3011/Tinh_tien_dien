package view;

import control.Manager;
import model.Client;
import model.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        ArrayList<Client> clientArrayList = new ArrayList<>();
        ArrayList<Receipt> receiptArrayList = new ArrayList<>();

        Client client1 = new Client("Nguyễn Tiến Long" , 1, "CT1");
        Client client2 = new Client("Nguyễn Tiến Đức" , 2, "CT2");
        Client client3 = new Client("Nguyễn Văn Chiến" , 3, "CT3");
        clientArrayList.add(client1);
        clientArrayList.add(client2);
        clientArrayList.add(client3);

        Receipt receipt1 = new Receipt(client1,100,150);
        Receipt receipt2 = new Receipt(client2,50,200);
        Receipt receipt3 = new Receipt(client3,101,250);
        receiptArrayList.add(receipt1);
        receiptArrayList.add(receipt2);
        receiptArrayList.add(receipt3);

        Manager manager = new Manager(clientArrayList,receiptArrayList);

        int choice = -1;
        String nameHouse, id;
        int apartmentNumber;

        while (choice != 0){
            System.out.println("--------Biên lai thu tiền Điện hàng tháng--------");
            System.out.println("1. Thêm hộ sử dụng điện");
            System.out.println("2. Hiển thị thông tin về các biên lai đã nhập");
            System.out.println("3. Tính tiền điện cho khách");
            System.out.println("4. Hiển thị thông tin khách hàng cần tìm");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhập tên chủ hộ: ");
                    nameHouse = scanner1.nextLine();
                    System.out.print("Nhập số nhà: ");
                    apartmentNumber = scanner.nextInt();
                    System.out.print("Nhập ID: ");
                    id = scanner1.nextLine();
                    Client client = new Client(nameHouse,apartmentNumber,id);
                    clientArrayList.add(client);
                    Receipt receipt = new Receipt(client,0,0);
                    receiptArrayList.add(receipt);
                    break;
                case 2:
                    manager.showAllListReceipt();
                    break;
                case 3:
                    System.out.print("Nhập số ID: ");
                    id = scanner1.nextLine();
                    double money = manager.searchReceipt(id).electricBill();
                    System.out.println("Số tiền cần thanh toán là: " + money);
                    break;
                case 4:
                    System.out.print("Nhập số ID: ");
                    id = scanner1.nextLine();
                    Client client4 = manager.searchClientById(id);
                    if(client4 != null){
                        System.out.println(client4);
                    }else {
                        System.out.println("Không có khách hàng");
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
