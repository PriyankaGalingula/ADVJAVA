package com.spring.collection;
import java.util.*;
public class Library {
		private int id;
		private String name;
		private List<String> books;
		public Library(int id,String name,List<String> books)
		{
			this.id=id;
			this.name=name;
			this.books=books;
			
			
		}
		@Override
		public String toString() {
			return "Library [id=" + id + ", name=" + name + ", books=" + books + "]";
		}
	
		
	
	
}
