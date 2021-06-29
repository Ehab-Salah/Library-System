/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.util.ArrayList;


public class Data {
    
    public boolean searchMember(String name,String password){
    // search if name exist 
    // if name =name in DB && password=password in DB return true
        return true;
    }
    public boolean searchBook(String title){
    // search if book exist 
        return true;
    }
    
    public void insertMember(Member member ){
    
    }
    public void insertBook(Book book ){
    
    }
    public Member getMemberInfo(String name ){
    Member member=new Member();
    return member;
    }
    public Book getBookInfo(String title ){
        Book book=new Book();
        
    return book;
    }
    public void deleteMember(String name){
    }
    public void deleteBook(String title){
    }
    public ArrayList<Member> getAllMembers(){
    ArrayList<Member> member=new ArrayList();
    
    return member;
    } 
    public ArrayList<Book> getAllBooks(){
    ArrayList<Book> book=new ArrayList();
    
    return book;
    } 
}
