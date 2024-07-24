package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss "); //conversão de data
	
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	
	//post tera varios comentarios, loco precisamos criar a  lista -NÃO COLOCA LISTA EM CONTRUTORES
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}
	
	public Date getMoment() {
		return moment;
	}
	public String getTile() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Integer getLikes() {
		return likes;
	}
	
	//IMPORTANTE
	public List<Comment> getComment(){
		return comments;
	}
	
	//PAPEL DO SET PARA LISTAS
	//adicionar comentario, recebendo um comentario como argumento -COMENTARIO QUE VAI SER ADICIONADO VEM COM ARGUMENTO E CHAMA METODO DE ADIÇÃO-
	public void addComment(Comment comment) {
		comments.add(comment);//vai até a lista de comentarios e chama o metodo add para adicionar na lista o comentario que veio com o argumento
	};
	public void removeComment(Comment comment) {
		comments.remove(comment);
	};
	
	
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content  = content;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");//apresentar no final
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		   //para cada comentario na lista comentarios, vou acrescentar o comentario 
		   for(Comment c : comments) {
			   sb.append(c.getText() + "\n");
		   }
		   return sb.toString(); //converte StringBuild para String
				
		
	}
	
	
	
}
