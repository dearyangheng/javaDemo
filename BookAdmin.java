import java.util.Scanner;
public class BookAdmin{
    public static void main(String[] args){
        Book[] book = new Book[10000];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<1;){
         System.out.println("图书管理系统");
         System.out.println("----查找图书（11）");
         System.out.println("----添加图书（22）");
         System.out.println("----删除图书（33）");
         System.out.println("----修改图书（44）");
         System.out.println("----查看全部图书（55）");
         System.out.println("----退出（99）");
         String cmd = in.next();
         if(cmd.equals("11")){
             System.out.println("选择查找方式:");
             System.out.println("按书号查找1:");
             System.out.println("按书名查找2:");
             System.out.println("按语种查找3:");
             System.out.println("按作者查找4:");
             System.out.println("按主题查找5:");
             System.out.println("按状态查找6:");
             try{
                int find = in.nextInt();
                if(find==1){
                    System.out.println("输入查找的书号");
                    bookInfo(book,in.nextInt());
                }else if(find==2){

                }
             }catch(Exception e){
                System.out.println("输入有误，重新输入！");
             }
         }
         else if(cmd.equals("22")){//添加图书
             System.out.println("添加图书");
             int bookBid = autoId(book);//自动获取递增ID
             book[bookBid] = new Book();
             System.out.println(bookBid);
                  book[bookBid].setBid(bookBid+1);
             System.out.println("请输入语种");
                  book[bookBid].setLanguage(in.next());
             System.out.println("请输入书名");
                 book[bookBid].setName(in.next());
             System.out.println("请输入作者");
                  book[bookBid].setAuthor(in.next());
             System.out.println("请输入主题");
                  book[bookBid].setTheme(in.next());
             System.out.println("请输入状态");
                  book[bookBid].setStatus(in.next());
             toString(book);
         }else if(cmd.equals("33")){
             System.out.println("输入要删除的书本书号");
             int id = in.nextInt() - 1;
             if(exist(book,id)){
                 book[id].setBid(00);
                 System.out.println("删除成功");
             }else{
                 System.out.println("指定书本不存在");
             }
         }else if(cmd.equals("44")){
             System.out.println("输入要修改的的书本书号");
             int id = in.nextInt() - 1;
             if(exist(book,id)){
                bookInfo(book,id);
                System.out.println("请输入修改后的语种");
                    book[id].setLanguage(in.next());
                System.out.println("请输入修改后的书名");
                    book[id].setName(in.next());
                System.out.println("请输入修改后的作者");
                    book[id].setAuthor(in.next());
                System.out.println("请输入修改后的主题");
                    book[id].setTheme(in.next());
                System.out.println("请输入修改后的状态");
                    book[id].setStatus(in.next());
                bookInfo(book,id);
             }else{
                System.out.println("指定书本不存在");
             }
         }else if(cmd.equals("55")){
             toString(book);
         }else if(cmd.equals("99")){
             System.exit(0);
         }else{
              System.out.println("输入有误，重新输入！");
         }
        }
    }
     public static int autoId(Book[] arr){
         int i;
         for(i = 0;i<arr.length;i++){
             if(arr[i] == null){
                 break;
             }
         }
         return i;
     }
     public static void toString(Book[] arr){
         System.out.println("书号\t书名\t作者\t语种\t主题\t状态");
         for(int i = 0;i<arr.length;i++){
             if(arr[i] == null){
                 break;
             }else if(arr[i].getBid() == 00){
                continue;
             }else{
                 System.out.print(arr[i].getBid()+"\t");
                 System.out.print(arr[i].getName()+"\t");
                 System.out.print(arr[i].getAuthor()+"\t");
                 System.out.print(arr[i].getLanguage()+"\t");
                 System.out.print(arr[i].getTheme()+"\t");
                 System.out.print(arr[i].getStatus()+"\t\n");
             }
         }
     }
     public static void bookInfo(Book[] arr,int i){
             System.out.println("书号\t书名\t作者\t语种\t主题\t状态");
             System.out.print(arr[i].getBid()+"\t");
             System.out.print(arr[i].getName()+"\t");
             System.out.print(arr[i].getAuthor()+"\t");
             System.out.print(arr[i].getLanguage()+"\t");
             System.out.print(arr[i].getTheme()+"\t");
             System.out.print(arr[i].getStatus()+"\t\n");
     }
     public static boolean exist(Book[] arr,int i){
        if(arr[i]==null){
             return false;
        }else if(arr[i].getBid()==00){
             return false;
        }else{
             return true;
        }
     }
}
