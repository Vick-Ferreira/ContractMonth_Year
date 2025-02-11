package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;



import entities.Comment;
import entities.Post;

public class ProgramRedeSocial {

	public static void main(String[] args) throws ParseException { //esseção
		// TODO Auto-generated method stub
		
		//data e hora local   INSTANCIA
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //conversão de data
		
		
		//criando objeto, instânciando objetos - criando comentarios
		Comment c1 = new Comment("Have a nive trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post( 
				sdf.parse("21/06/2018 13:05:44"), 
						"Traveling to new Zealand", 
						"I'm going to visit this wonderful contry!",
						12);
		
		//adicionando comentarios na lista de comentarioS
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		 //criando comentarios
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		//criando post
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good nigth guys",
				"See you tomorrow",
				5);
		
		//adicionando comentarios na lista de comentarioS
		p2.addComment(c3);
		p2.addComment(c4);
		
				
		
		
		
		
		System.out.println(p1);
		System.out.println(p2);

    }
}