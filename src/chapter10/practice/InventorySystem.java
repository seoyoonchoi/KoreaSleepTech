package chapter10.practice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static jdk.javadoc.internal.doclets.toolkit.util.DocFinder.search;

public class InventorySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("----------Inventory System----------");
            System.out.println("1. Add book");
            System.out.println("2. List all book");
            System.out.println("3. Search Book");
            System.out.println("4. Search by Category");
            System.out.println("5. Search by Price Range");
            System.out.println("6. Update Stock");
            System.out.println("7. Remove Book");
            System.out.println("8. Exit");

            try{
                int choice = Integer.parseInt(sc.nextLine());
                //nextLine은 문자열로 인식하여서 Integer.parseInt()[변환한다 라는 뜻 ㅎ]
                //따라서 Integer.parseInt(A)라면
                //A값을 분석하여 Integer 형태로 변환하는 것이고 숫자 형태로 변경할 수 없는 값이 입력되는 경우
                //NumberFormatException 예외 발생한다.

                switch (choice){
                    case 1:
                        System.out.print("enter Book ID: ");
                        String id = sc.nextLine();
                        System.out.print("enter Book Title: ");
                        String title = sc.nextLine();
                        System.out.print("enter Book IsBN: ");
                        String isbn = sc.nextLine();
                        System.out.print("enter Book Author: ");
                        String author = sc.nextLine();
                        System.out.print("enter Book Publisher: ");
                        String publisher = sc.nextLine();
                        System.out.print("enter Book Category: ");
                        String category = sc.nextLine();

                        System.out.print("Enter Book Publish Year : ");
                        int year = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Book Publish Price : ");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Book Publish Stock Quantity: ");
                        int stock = Integer.parseInt(sc.nextLine());

                        manager.add(new Book(id,title,isbn,author,publisher,category,year,price,stock));
                        break;

                    case 2:
                        manager.listAll();
                        break;
                    case 3:
                        System.out.println("Enter Search Keyword");
                        String keyword = sc.nextLine();
                        List<Item> searchResults = manager.search(keyword);
                        if(searchResults.isEmpty()){
                            System.out.println("No items found in Keyword");
                            // 결과값이 안나오는 경우 이 키워드로 아이템을 찾을 수 없다는 메시지 호출
                        }else{
                            for(Item item: searchResults){
                                item.display();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter Category");
                        String searchCategory = sc.nextLine();
                        List<Item> categoryResults = manager.searchByCategory(searchCategory);
                        if(categoryResults.isEmpty()){
                            System.out.println("No Items found in Category: "+searchCategory);
                        }else{
                            for (Item item : categoryResults){
                                item.display();
                            }
                        }
                        break;
                    case 5:
                        System.out.print("Enter minimum Price : ");
                        int minPrice = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter maximum Price : ");
                        int maxPrice = Integer.parseInt(sc.nextLine());

                        List<Item> priceResults = manager.searchByPriceRange(minPrice,maxPrice);
                        if(priceResults.isEmpty()){
                            System.out.println("No items in Range");
                        }else{
                            for(Item item : priceResults){
                                item.display();
                            }
                        }
                        break;
                    case 6:
                        System.out.print("Enter Book ID to update stock : ");
                        String updateId = sc.nextLine();
                        System.out.print("Enter Quantity to add / substract: ");
                        int quantity = Integer.parseInt(sc.nextLine());
                        System.out.println();
                        manager.updateStock(updateId,quantity);
                        break;
                    case 7 :
                        System.out.print("Enter book ID to remove : ");
                        String removeID = sc.nextLine();
                        manager.remove(removeID);
                        break;
                    case 8:
                        System.out.println("If you want to exit, Please enter 'Y'");
                        if(sc.nextLine().equalsIgnoreCase("y")){
                            System.out.println("Exit==================================");
                            sc.close();
                            return;
                        }else{
                        System.out.println("Try Again");
                        break;
                        }
                    default:
                        System.out.println("Invalid Options , Try again!!");

                }

            }catch(NumberFormatException e){
                System.out.println("Please Enter a valid Number");
            }catch (NoSuchElementException e){
                //검색된 내용이 없을 경우 실행될 블럭
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
