package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺2020��3��29�� ����10:26:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("����ʦӢ�����ÿ���", "1989-02-19", 999, 100);
		//ʵ����ͼ��ҵ�����
		BookBiz bookBiz = new BookBiz();
		
		bookBiz.sellBook(book);
		System.out.println(book.getCount());
	}

}
