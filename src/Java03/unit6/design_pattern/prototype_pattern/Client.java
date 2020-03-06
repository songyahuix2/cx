package Java03.unit6.design_pattern.prototype_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 7:41 PM
 */
public class Client {
    public static void main(String[] args) {
        Book book1 = new Book();
        //编辑书本，添加图片
        book1.setTitle("葵花宝典");
        book1.addImage("图1");
        book1.showBook();

        // 以原型文档为原型，拷贝一份副本
        Book book2 = book1.clone();
        book2.showBook();

        book2.setTitle("Java编程思想");
        book2.addImage("图2");
        book2.showBook();
        book1.showBook();


    }
}
