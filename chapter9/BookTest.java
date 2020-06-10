package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：2020年3月29日 下午10:26:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("高老师英语的奇幻课堂", "1989-02-19", 999, 100);
		//实例化图书业务对象
		BookBiz bookBiz = new BookBiz();
		
		bookBiz.sellBook(book);
		System.out.println(book.getCount());
	}

}
