package Java03.unit6.design_pattern.prototype_pattern;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 7/17/2019 - 6:29 PM
 */

//定义一个原型类：Book，实现Cloneable接口
public class Book implements Cloneable {
    private String title;
    private ArrayList<String> image= new ArrayList<String>();
    public Book(){}

    //重写Object.clone()
    @Override
    public  Book clone(){
        try {
            Book book = (Book) super.clone();
           book.image = (ArrayList<String>) this.image.clone();
return book;
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<String> getImage(){
        return image;
    }
    public void addImage(String img){
        this.image.add(img);

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //被主函数调用后打印
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title：" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}
