package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：2020年3月29日 下午10:07:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class BookBiz {
	/**
	 * 销售书籍
	 * @param book 要销售的图书对象
	 * @return 如果销售成功，返回销售的数量，销售失败，返回 -1
	 */
	public int sellBook(Book book) {
		//1. 判断图书的库存是否大于1
		//2. 图书的库存-1
		//3. 返回销售的数量
		if(!(book.getCount() > 1)) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}
