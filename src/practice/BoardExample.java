package practice;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board("Title", "Content");
		System.out.println("board1.title : " + board1.title);
		System.out.println("board1.content : " + board1.content);
		System.out.println();
		
		Board board2 = new Board("Title", "Content", "Writer");
		System.out.println("board2.title : " + board2.title);
		System.out.println("board2.content : " + board2.content);
		System.out.println("board2.writer : " + board2.writer);
		System.out.println();
		
		Board board3 = new Board("Title", "Content", "Writer", "2023-08-17");
		System.out.println("board3.title : " + board3.title);
		System.out.println("board3.content : " + board3.content);
		System.out.println("board3.writer : " + board3.writer);
		System.out.println("board3.date : " + board3.date);
		System.out.println();
		
		Board board4 = new Board("Title", "Content", "Writer", "2023-08-17", 0);
		System.out.println("board4.title : " + board4.title);
		System.out.println("board4.content : " + board4.content);
		System.out.println("board4.writer : " + board4.writer);
		System.out.println("board4.date : " + board4.date);
		System.out.println("board4.hitcount : " + board4.hitcount);
	}

}
