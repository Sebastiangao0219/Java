package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺2020��3��29�� ����10:07:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BookBiz {
	/**
	 * �����鼮
	 * @param book Ҫ���۵�ͼ�����
	 * @return ������۳ɹ����������۵�����������ʧ�ܣ����� -1
	 */
	public int sellBook(Book book) {
		//1. �ж�ͼ��Ŀ���Ƿ����1
		//2. ͼ��Ŀ��-1
		//3. �������۵�����
		if(!(book.getCount() > 1)) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}
