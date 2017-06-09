package br.ufrpe.social_network.negocio.beans;

import java.util.ArrayList;

public class Post {
    
	private static long nextId = 1;
    private long id = 1;
    private String texto;
    private Person author;
    private ArrayList<Post> comments;

    public Post(String texto, Person author) {
        this.id = nextId;
        nextId++;
        
        this.texto = texto;
        this.author = author;
        this.comments = new ArrayList<>();
    }
    
    public Post() {
        this(null, null);
    }
    
    public String getTexto(){
    	return texto;
    }
    
    public void setTexto(String texto){
    	this.texto = texto;
    }
    
    public Person getAuthor(){
    	return author;
    }
    
    public void setAuthor(Person author){
    	this.author = author;
    }
    public ArrayList<Post> getComments(){
    	return comments;
    }
    
    public long getId(){
    	return id;
    }


    // TODO gerar todos os métodos get/set, exceto o setId
    
    public void addComment(Post comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }
    
    public void removeComment(Long id) {
        // TODO remover comentário da lista de comentários se ele existir. 
        // Você deve varrer a lista inteira verificando se há algum 
        // comentário com o ID informado como parâmetro e então removê-lo
    }
    
    @Override
    public String toString() {
    	String texto = "";
    	
    	texto += "Author : \n";
    	texto += this.getAuthor();
    	texto += "Post : \n ";
    	texto += this.texto;
    	
    	if(this.comments != null)
    	{
    		texto +="	Comments : \n";
    		texto += this.getComments();
    	}
  
    	return texto;
    }
    

}
