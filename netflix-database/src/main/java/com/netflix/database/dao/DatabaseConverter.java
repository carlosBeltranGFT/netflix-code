//package com.netflix.database.dao;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.netflix.database.entities.Actor;
//import com.netflix.database.entities.Category;
//import com.netflix.database.entities.Director;
//import com.netflix.database.entities.NetflixTitles;
//import com.netflix.database.entities.Title;
//import com.netflix.database.repositories.ActorRepository;
//import com.netflix.database.repositories.CategoryRepository;
//import com.netflix.database.repositories.DirectorRepository;
//import com.netflix.database.repositories.NetflixRepository;
//import com.netflix.database.repositories.TitleRepository;
//
//@SpringBootApplication
//public class DatabaseConverter implements CommandLineRunner {
//
//	@Autowired
//	NetflixRepository netflixRepository;
//
//	@Autowired
//	ActorRepository actorRepository;
//	
//	@Autowired
//	DirectorRepository directorRepository;
//	
//	@Autowired
//	CategoryRepository categoryRepository;
//	
//	@Autowired
//	TitleRepository titleRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		List<NetflixTitles> lista = netflixRepository.findAll();
//
//		for (NetflixTitles titulo : lista) {
//			RegistrarTitulo(titulo);
//		}
//	}
//
//	public Set<Actor> RecuperarActores(NetflixTitles title) {
//
//		List<String> actoresString = Arrays.asList(title.getCast().split(","));
//		Set<Actor> actores = new HashSet<Actor>();
//
//		actoresString = actoresString.stream().map(a -> a.trim()).collect(Collectors.toList());
//
//		for (String a : actoresString) {
//			Actor actorRepetido = actorRepository.findByName(a);
//			if(actorRepetido!=null) {
//				actores.add(actorRepetido);
//			}else {
//				if (!a.isEmpty()) {
//					Actor actor = new Actor(a);
//					actores.add(actor);
//					actorRepository.save(actor);
//				}
//			}
//
//			
//		}
//		
//		return actores;
//	}
//	
//	public Set<Director> RecuperarDirectores(NetflixTitles title) {
//
//		List<String> directorString = Arrays.asList(title.getDirector().split(","));
//		Set<Director> directores = new HashSet<Director>();
//
//		directorString = directorString.stream().map(a -> a.trim()).collect(Collectors.toList());
//
//		for (String d : directorString) {
//			Director directorRepetido = directorRepository.findByName(d);
//			if(directorRepetido!=null) {
//				directores.add(directorRepetido);
//			}else {
//				if (!d.isEmpty()) {
//					Director director = new Director(d);
//					directores.add(director);
//					directorRepository.save(director);
//				}
//			}
//		}
//		
//		return directores;
//	}
//	
//	public Set<Category> RecuperarCategorias(NetflixTitles title) {
//
//		List<String> categoryString = Arrays.asList(title.getListed_in().split(","));
//		Set<Category> categories = new HashSet<Category>();
//
//		categoryString = categoryString.stream().map(a -> a.trim()).collect(Collectors.toList());
//
//		for (String d : categoryString) {
//			Category categoryRepetido = categoryRepository.findByName(d);
//			if(categoryRepetido!=null) {
//				categories.add(categoryRepetido);
//			}else {
//				if (!d.isEmpty()) {
//					Category category = new Category(d);
//					categories.add(category);
//					categoryRepository.save(category);
//				}
//			}
//		}
//		
//		return categories;
//	}
//	
//	public void RegistrarTitulo(NetflixTitles raw) throws SQLException {
//
//		Set<Actor> actores = RecuperarActores(raw).stream().collect(Collectors.toSet());
//		Set<Director> directores = RecuperarDirectores(raw).stream().collect(Collectors.toSet());
//		Set<Category> categories = RecuperarCategorias(raw).stream().collect(Collectors.toSet());
//		
//		
//		Title title = new Title(raw.getShow_id(), raw.getTitle(), raw.getDate_added(), raw.getRelease_year(), raw.getRating(), raw.getDuration(),
//				raw.getDescription(), raw.getUser_rating(), actores, directores, categories);
//		
//		titleRepository.save(title);
//		
//		
//		
//	}
//
//}
