public class Book{
    private int bid;//书号
    private String language;//语种
    private String name;//书名
    private String author;//作者
    private String theme;//主题
    private String status;//状态
// 书号
    public void setBid(int bid){
        this.bid = bid;//set函数设置书号
    }
    public int getBid(){
        return bid;//get函数获取书号
    }
// 语种
    public void setLanguage(String language){
        this.language = language;//set函数设置语种
    }
    public String getLanguage(){
        return language;//get函数获取语种
    }
// 书名
    public void setName(String name){
        this.name = name;//set函数设置书名
    }
    public String getName(){
        return name;//get函数获取书名
    }
// 作者
    public void setAuthor(String author){
        this.author = author;//set函数设置作者
    }
    public String getAuthor(){
        return author;//get函数获取作者
    }
// 主题
    public void setTheme(String theme){
        this.theme = theme;//set函数设置主题
    }
    public String getTheme(){
        return theme;//get函数获取主题
    }
// 状态 
    public void setStatus(String status){
        this.status = status;//set函数设置状态
    }
    public String getStatus(){
        return status;//get函数获取状态
    }
}
